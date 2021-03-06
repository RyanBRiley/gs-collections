/*
 * Copyright 2013 Goldman Sachs.
 *
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
 */

package com.gs.collections.impl.map.mutable.primitive;

import com.gs.collections.impl.test.Verify;
import org.junit.Test;

public class SynchronizedDoubleObjectHashMapTest
{
    @Test
    public void serializedForm()
    {
        Verify.assertSerializedForm(
                1L,
                "rO0ABXNyAE1jb20uZ3MuY29sbGVjdGlvbnMuaW1wbC5tYXAubXV0YWJsZS5wcmltaXRpdmUuU3lu\n"
                        + "Y2hyb25pemVkRG91YmxlT2JqZWN0SGFzaE1hcAAAAAAAAAABAgACTAAEbG9ja3QAEkxqYXZhL2xh\n"
                        + "bmcvT2JqZWN0O0wAA21hcHQAPUxjb20vZ3MvY29sbGVjdGlvbnMvYXBpL21hcC9wcmltaXRpdmUv\n"
                        + "TXV0YWJsZURvdWJsZU9iamVjdE1hcDt4cHEAfgADc3IAQWNvbS5ncy5jb2xsZWN0aW9ucy5pbXBs\n"
                        + "Lm1hcC5tdXRhYmxlLnByaW1pdGl2ZS5Eb3VibGVPYmplY3RIYXNoTWFwAAAAAAAAAAEMAAB4cHcI\n"
                        + "AAAAAD8AAAB4",
                new SynchronizedDoubleObjectHashMap<Object>(new DoubleObjectHashMap<Object>()));
    }
}
