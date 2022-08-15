package com.github.gukov.calculator.controller;

import com.github.gukov.calculator.model.Expression;
import com.github.gukov.calculator.service.Executor;
import com.github.gukov.calculator.service.MathService;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@RequestMapping("calculate")
public class MessageController {

    private final MathService mathService;

    public MessageController(MathService mathService) {
        this.mathService = mathService;
    }


    @PostMapping("/divide")
    public BigDecimal divide(@RequestParam BigDecimal a,@RequestParam BigDecimal b){
        return mathService.divide(a,b);
    }

    @PostMapping("/add")
    public BigDecimal add(@RequestParam BigDecimal a,@RequestParam BigDecimal b){
        return mathService.plus(a,b);
    }

    @PostMapping("/sub")
    public BigDecimal sub(@RequestParam BigDecimal a,@RequestParam BigDecimal b){
        return mathService.sub(a,b);
    }

    @PostMapping("/multiply")
    public BigDecimal multiply(@RequestParam BigDecimal a,@RequestParam BigDecimal b){
        return mathService.multiply(a,b);
    }

    @PostMapping()
    public BigDecimal getOne(@RequestBody Expression expression) {
        Executor executor = expression.getOperator().getExecutor();
        return executor.execute(expression.getFirstArg(),expression.getSecondArg());
    }
}