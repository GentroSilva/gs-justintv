/*
 * Copyright 2012 bdickie.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.landora.justintv;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.Comparators;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.landora.justintv.data.JustinArchive;

/**
 *
 * @author bdickie
 */
public class JustinTVAPI {
    
    private static InputStream openURL(String url) throws IOException {
        URL urlObject = new URL(url);
        return urlObject.openStream();
    }
    
    public static List<JustinArchive> readArchives(String channelName) throws Exception {
        return readArchives(channelName, 100);
    }
    
    public static List<JustinArchive> readArchives(String channelName, int maxNumber) throws Exception {
        return readArchives(channelName, 0, maxNumber);
    }
    
    public static List<JustinArchive> readArchives(String channelName, int offset, int maxNumber) throws Exception {
        
        String url = String.format("http://api.justin.tv/api/channel/archives/%s.json?offest=%d&limit=%d", channelName, offset, Math.min(100, maxNumber));
        
        InputStream stream = openURL(url);
        
        ObjectMapper mapper = new ObjectMapper();
        
        List<JustinArchive> readValue = mapper.readValue(stream, new TypeReference<List<JustinArchive>>() {});
        
        return readValue;
    }
    
    public static void main(String[] args) throws Exception {
        List<JustinArchive> archives = readArchives("tsmtournaments", 64);
        Map<String,List<JustinArchive>> groups = new HashMap<String, List<JustinArchive>>();
        for (int i = 0; i < archives.size(); i++) {
            JustinArchive archive = archives.get(i);
            List<JustinArchive> group = groups.get(archive.getBroadcastId());
            if (group == null) {
                group = new ArrayList<JustinArchive>(archive.getBroadcastPart());
                groups.put(archive.getBroadcastId(), group);
            }
            group.add(archive);
        }
        
        BroadcastSorter sorter = new BroadcastSorter();
        
        for(List<JustinArchive> group: groups.values()) {
            Collections.sort(group, sorter);
            
            JustinArchive base = group.get(group.size() - 1);
            
            StringBuffer cmd = new StringBuffer();
            cmd.append("mkvmerge -o \"");
            cmd.append(base.getBroadcastId());
            cmd.append(" - ");
            cmd.append(base.getTitle());
            cmd.append("\" ");
            
            for (int i = 0; i < group.size(); i++) {
                JustinArchive archive = group.get(i);
                if (i > 0)
                    cmd.append("+ ");
                
                cmd.append(archive.getId());
                cmd.append(".mkv ");
            }
            System.out.println(cmd);
        }
    }
    
    private static class BroadcastSorter implements Comparator<JustinArchive> {

        @Override
        public int compare(JustinArchive o1, JustinArchive o2) {
            int order1 = o1.getBroadcastPart();
            int order2 = o2.getBroadcastPart();
            if (order1 < order2)
                return -1;
            else if (order1 == order2)
                return 0;
            else
                return 1;
        }
        
    }
    
}
