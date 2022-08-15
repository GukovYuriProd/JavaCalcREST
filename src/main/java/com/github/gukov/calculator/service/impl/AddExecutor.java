package com.github.gukov.calculator.service.impl;

import com.github.gukov.calculator.service.Executor;

import java.math.BigDecimal;

public class AddExecutor implements Executor {

    @Override
    public BigDecimal execute(BigDecimal firstArg, BigDecimal secondArg) {
        return firstArg.add(secondArg);
    }
}
