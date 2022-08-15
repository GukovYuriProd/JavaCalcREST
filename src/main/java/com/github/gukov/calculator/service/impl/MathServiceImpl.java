package com.github.gukov.calculator.service.impl;

import com.github.gukov.calculator.service.MathService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Service
public class MathServiceImpl implements MathService {


    @Override
    public BigDecimal divide(BigDecimal dividend, BigDecimal divider) {
        if(divider.compareTo(new BigDecimal(0))==0) throw new IllegalArgumentException("На ноль делить нельзя ублюдок");
        return dividend.divide(divider, RoundingMode.UNNECESSARY );
    }

    @Override
    public BigDecimal sub(BigDecimal a, BigDecimal b) {
        return a.subtract(b);
    }

    @Override
    public BigDecimal plus(BigDecimal a, BigDecimal b) {
        return a.add(b);
    }

    @Override
    public BigDecimal multiply(BigDecimal a, BigDecimal b) {
        return a.multiply(b);
    }
}
