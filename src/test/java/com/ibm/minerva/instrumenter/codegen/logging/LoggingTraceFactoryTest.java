/******************************************************************************* 
 * Copyright (c) contributors to the Minerva for Modernization project.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Contributors:
 *     IBM Corporation - initial implementation
 *******************************************************************************/

package com.ibm.minerva.instrumenter.codegen.logging;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.ibm.minerva.instrumenter.TypedFactory;
import com.ibm.minerva.instrumenter.codegen.TraceGeneratorFactory;

@DisplayName("LoggingTraceFactory Test")
public class LoggingTraceFactoryTest {
    
    @Test
    public void testType() {
        final TypedFactory tf = new LoggingTraceFactory();
        assertEquals("java-util-logging", tf.getType());
    }
    
    @Test
    public void testVersion() {
        final TypedFactory tf = new LoggingTraceFactory();
        assertEquals("1.0", tf.getVersion());
    }
    
    @Test
    public void testCreateTraceGenerator() {
        final TraceGeneratorFactory tgf = new LoggingTraceFactory();
        assertInstanceOf(TraceGeneratorImpl.class, tgf.createTraceGenerator(null));
    }
}
