package com.calculadora.api.model;

import java.util.LinkedHashMap;
import java.util.Map;

public class Operacion {
    private final double num1;
    private final double num2;
    private final String mathOperation;
    private final double result;

    public Operacion(double num1, double num2, String mathOperation, double result) {
        this.num1 = num1;
        this.num2 = num2;
        this.mathOperation = mathOperation;
        this.result = result;
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public String getMathOperation() {
        return mathOperation;
    }

    public double getResult() {
        return result;
    }

    public Map<String, Object> getOperacion(){
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("num1", getNum1());
        map.put("num2", getNum2());
        map.put("operation", getMathOperation());
        map.put("result", getResult());
        return map;
    }
}
