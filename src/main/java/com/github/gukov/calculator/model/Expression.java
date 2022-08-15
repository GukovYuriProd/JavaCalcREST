package com.github.gukov.calculator.model;


import java.math.BigDecimal;

public class Expression {
    private BigDecimal firstArg;
    private BigDecimal secondArg;
    private Operator operator;

    public BigDecimal getFirstArg() {
        return firstArg;
    }

    public void setFirstArg(BigDecimal firstArg) {
        this.firstArg = firstArg;
    }

    public BigDecimal getSecondArg() {
        return secondArg;
    }

    public void setSecondArg(BigDecimal secondArg) {
        this.secondArg = secondArg;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }
}
