/*-
 * #%L
 * JSQLParser library
 * %%
 * Copyright (C) 2004 - 2019 JSQLParser
 * %%
 * Dual licensed under GNU LGPL 2.1 or Apache License 2.0
 * #L%
 */
package com.vonchange.jsqlparser.expression.operators.relational;

import com.vonchange.jsqlparser.expression.ExpressionVisitor;

public class MinorThanEquals extends ComparisonOperator {

    public MinorThanEquals() {
        super("<=");
    }

    public MinorThanEquals(String operator) {
        super(operator);
    }

    @Override
    public void accept(ExpressionVisitor expressionVisitor) {
        expressionVisitor.visit(this);
    }
}