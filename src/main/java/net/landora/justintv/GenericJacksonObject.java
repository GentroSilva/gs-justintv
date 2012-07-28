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

import com.fasterxml.jackson.annotation.JsonAnySetter;
import org.slf4j.LoggerFactory;

/**
 *
 * @author bdickie
 */
public abstract class GenericJacksonObject {

    public GenericJacksonObject() {
    }
    
    
    
    /**
     * Handle unknown properties and print a message
     * @param key
     * @param value
     */
    @JsonAnySetter
    public void handleUnknown(String key, Object value) {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append(" Unknown property: '").append(key);
        sb.append("' value: '").append(value).append("'");
        LoggerFactory.getLogger(getClass()).warn(sb.toString());
    }
    
}
