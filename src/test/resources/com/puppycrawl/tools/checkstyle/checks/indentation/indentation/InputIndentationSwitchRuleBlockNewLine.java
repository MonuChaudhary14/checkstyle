// Java17                                                                  //indent:0 exp:0
package com.puppycrawl.tools.checkstyle.checks.indentation.indentation;    //indent:0 exp:0

/* Config:                                                                 //indent:0 exp:0
 * basicOffset = 2                                                         //indent:1 exp:1
 * braceAdjustment = 2                                                     //indent:1 exp:1
 * caseIndent = 2                                                          //indent:1 exp:1
 * tabWidth = 4                                                            //indent:1 exp:1
 * lineWrappingIndentation = 4                                             //indent:1 exp:1
 * throwsIndent = 4                                                        //indent:1 exp:1
 */                                                                        //indent:1 exp:1

public class InputIndentationSwitchRuleBlockNewLine {                      //indent:0 exp:0

  int test(int x) {                                                        //indent:2 exp:2
    int result;                                                            //indent:4 exp:4
    switch (x) {                                                           //indent:4 exp:4
      case 1 -> { result = 1; }                                            //indent:6 exp:6 warn
      case 2 -> result = 2;                                                //indent:6 exp:6
      default -> result = 0;                                               //indent:6 exp:6
    }                                                                      //indent:4 exp:4
    return result;                                                         //indent:4 exp:4
  }                                                                        //indent:2 exp:2
}                                                                          //indent:0 exp:0
