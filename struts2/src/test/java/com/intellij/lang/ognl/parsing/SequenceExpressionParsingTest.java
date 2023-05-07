/*
 * Copyright 2014 The authors
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.intellij.lang.ognl.parsing;

/**
 * @author Yann C&eacute;bron
 */
public class SequenceExpressionParsingTest extends OgnlParsingTestCase {

  public SequenceExpressionParsingTest() {
    super("sequenceExpression");
  }

  public void testExpressionAfterCommaExpected() {
    doTest(true);
  }

  public void testSingleExpressionIsNotSequence() {
    doTest(true);
  }

  public void testMissingClosingRightBrace() {
    doTest(true);
  }

}