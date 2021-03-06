/*
 * Copyright (c) 2013 Big Switch Networks, Inc.
 * Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University 
 *
 * Licensed under the Eclipse Public License, Version 1.0 (the
 * "License"); you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 *
 *      http://www.eclipse.org/legal/epl-v10.html
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package org.openflow.util;

import junit.framework.TestCase;

public class U32Test extends TestCase {
  /**
   * Tests that we correctly translate unsigned values in and out of an int
   * @throws Exception
   */
  public void test() throws Exception {
      long val = 0xffffffffL;
      TestCase.assertEquals(-1, U32.t(val));
      TestCase.assertEquals(val, U32.f(-1));
  }
}
