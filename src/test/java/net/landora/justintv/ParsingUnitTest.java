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

import com.fasterxml.jackson.databind.ObjectMapper;
import java.net.URL;
import junit.framework.TestCase;
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
    
}
