/*-
 * #%L
 * JSQLParser library
 * %%
 * Copyright (C) 2004 - 2019 JSQLParser
 * %%
 * Dual licensed under GNU LGPL 2.1 or Apache License 2.0
 * #L%
 */
package com.vonchange.jsqlparser.util.deparser;

import com.vonchange.jsqlparser.expression.ExpressionVisitor;
import com.vonchange.jsqlparser.statement.SetStatement;

public class SetStatementDeParser {

    protected StringBuilder buffer;
    private ExpressionVisitor expressionVisitor;

    public SetStatementDeParser(ExpressionVisitor expressionVisitor, StringBuilder buffer) {
        this.buffer = buffer;
        this.expressionVisitor = expressionVisitor;
    }

    public StringBuilder getBuffer() {
        return buffer;
    }

    public void setBuffer(StringBuilder buffer) {
        this.buffer = buffer;
    }

    public void deParse(SetStatement set) {
        buffer.append("SET ");

        for (int i = 0; i < set.getCount(); i++) {
            if (i > 0) {
                buffer.append(", ");
            }
            buffer.append(set.getName(i));
            if (set.isUseEqual(i)) {
                buffer.append(" =");
            }
            buffer.append(" ");
            set.getExpression(i).accept(expressionVisitor);
        }

    }

    public ExpressionVisitor getExpressionVisitor() {
        return expressionVisitor;
    }

    public void setExpressionVisitor(ExpressionVisitor visitor) {
        expressionVisitor = visitor;
    }
}
