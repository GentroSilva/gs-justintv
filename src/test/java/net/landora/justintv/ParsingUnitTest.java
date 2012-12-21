/**
 * Copyright 2012 Blake Dickie
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
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
import java.net.URL;
import java.util.List;
import junit.framework.TestCase;
import net.landora.justintv.data.JustinArchive;
import net.landora.justintv.data.JustinChannel;

/**
 *
 * @author bdickie
 */
public class ParsingUnitTest extends TestCase {
    
    public ParsingUnitTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
    
    public void testChannelParsingMalfusx() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        
        URL url = getClass().getResource("channel-malfusx.json");
        JustinChannel channel = mapper.readValue(url, JustinChannel.class);
        
        assertEquals("gaming", channel.getCategory());
        assertNull((channel.getSubcategory()));
        assertNull(channel.getMature());
        assertEquals("http://static-cdn.jtvnw.net/previews/live_user_malfusx-630x473.jpg", channel.getScreenCapUrlHuge());
        assertEquals("http://static-cdn.jtvnw.net/previews/live_user_malfusx-70x53.jpg", channel.getScreenCapUrlSmall());
    }
    
    public void testChannelParsingAphromoo() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        
        URL url = getClass().getResource("channel-aphromoo.json");
        JustinChannel channel = mapper.readValue(url, JustinChannel.class);
        
        assertEquals("gaming", channel.getCategory());
        assertEquals("new_broadcaster", channel.getSubcategory());
        assertNull(channel.getMature());
        assertEquals("http://static-cdn.jtvnw.net/previews/live_user_aphromoo-630x473.jpg", channel.getScreenCapUrlHuge());
        assertEquals("http://static-cdn.jtvnw.net/previews/live_user_aphromoo-70x53.jpg", channel.getScreenCapUrlSmall());
    }
    
    public void testArchiveParsingMalfusx() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        
        URL url = getClass().getResource("archives-malfusx.json");
        List<JustinArchive> readValue = mapper.readValue(url, new TypeReference<List<JustinArchive>>() {});
        
        assertEquals(50, readValue.size());
        
        JustinArchive archive = readValue.get(0);
        
        assertEquals("http://static-cdn.jtvnw.net/jtv.thumbs/archive-349020459-320x240.jpg", archive.getImageUrlMedium());
        
        assertEquals(1355807012000l, archive.getCreatedOn().getTimeInMillis());
        
        assertEquals(7, archive.getBroadcastPart());
        
        assertEquals("4384490592", archive.getBroadcastId());
        
        assertEquals("http://media37.justin.tv/archives/2012-12-18/live_user_malfusx_1355806964.flv", archive.getVideoFileUrl());
    }
    
}
