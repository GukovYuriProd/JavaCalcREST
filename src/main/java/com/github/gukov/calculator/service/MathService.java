package com.github.gukov.calculator.service;

import java.math.BigDecimal;

public interface MathService {
    BigDecimal divide(BigDecimal dividend, BigDecimal divider);
    BigDecimal sub(BigDecimal a, BigDecimal b);
    BigDecimal plus(BigDecimal a, BigDecimal b);
    BigDecimal multiply(BigDecimal a, BigDecimal b);
}
