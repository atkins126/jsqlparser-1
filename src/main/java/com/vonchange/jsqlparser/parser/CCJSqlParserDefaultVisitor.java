/*-
 * #%L
 * JSQLParser library
 * %%
 * Copyright (C) 2004 - 2019 JSQLParser
 * %%
 * Dual licensed under GNU LGPL 2.1 or Apache License 2.0
 * #L%
 */
/* Generated By:JavaCC: Do not edit this line. CCJSqlParserDefaultVisitor.java Version 7.0.4 */
package com.vonchange.jsqlparser.parser;

public class CCJSqlParserDefaultVisitor implements CCJSqlParserVisitor{
  public Object defaultVisit(SimpleNode node, Object data){
    node.childrenAccept(this, data);
    return data;
  }
  public Object visit(SimpleNode node, Object data){
    return defaultVisit(node, data);
  }
}
/* JavaCC - OriginalChecksum=dce084b52683455e3663fc977ed268ce (do not edit this line) */
