package com.github.gukov.calculator.model;

import com.github.gukov.calculator.service.Executor;
import com.github.gukov.calculator.service.impl.AddExecutor;
import com.github.gukov.calculator.service.impl.SubExecutor;

import java.lang.reflect.InvocationTargetException;

public enum Operator {
    ADD(AddExecutor.class),
    SUB(SubExecutor.class);

    private final Class<? extends Executor> executor;
    Operator(Class<? extends Executor> executor){
        this.executor = executor;
    }

    public Executor getExecutor(){
        try {
            return executor.getDeclaredConstructor().newInstance();
        } catch (InstantiationException | InvocationTargetException | NoSuchMethodException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
