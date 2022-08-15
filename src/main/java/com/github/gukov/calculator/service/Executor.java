package com.github.gukov.calculator.service;

import java.math.BigDecimal;

public interface Executor {
    BigDecimal execute(BigDecimal firstArg, BigDecimal secondArg);
}
