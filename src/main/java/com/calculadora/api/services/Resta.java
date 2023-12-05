package com.calculadora.api.services;

import org.springframework.stereotype.Component;

@Component
public class Resta implements IOperacionMatematica{
    @Override
    public double operar(double num1, double num2) {
        return num1-num2;
    }
}
