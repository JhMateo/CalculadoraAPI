package com.calculadora.api.controllers;


import com.calculadora.api.model.Operacion;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.calculadora.api.services.IOperacionMatematica;
import com.calculadora.api.services.Suma;
import com.calculadora.api.services.Resta;
import com.calculadora.api.services.Multiplicacion;
import com.calculadora.api.services.Division;

import java.util.Map;

@RestController
@RequestMapping("/api/calculadora")
public class CalculadoraController {
    private final IOperacionMatematica suma;
    private final IOperacionMatematica resta;
    private final IOperacionMatematica multiplicacion;
    private final IOperacionMatematica division;


    public CalculadoraController(Suma suma, Resta resta, Multiplicacion multiplicacion, Division division) {
        this.suma = suma;
        this.resta = resta;
        this.multiplicacion = multiplicacion;
        this.division = division;
    }

    @GetMapping("/sumar/{num1}/{num2}")
    public Map<String, Object> suma(@PathVariable double num1, @PathVariable double num2) {
        double resultado = suma.operar(num1, num2);
        return new Operacion(num1, num2, "+", resultado).getOperacion();
    }

    @GetMapping("/restar/{num1}/{num2}")
    public Map<String, Object> resta(@PathVariable double num1, @PathVariable double num2) {
        double resultado = resta.operar(num1, num2);
        return new Operacion(num1, num2, "-", resultado).getOperacion();
    }


    @GetMapping("/multiplicar/{num1}/{num2}")
    public Map<String, Object> multiplicar(@PathVariable double num1, @PathVariable double num2) {
        double resultado = multiplicacion.operar(num1, num2);
        return new Operacion(num1, num2, "X", resultado).getOperacion();
    }


    @GetMapping("/dividir/{num1}/{num2}")
    public Map<String, Object> dividir(@PathVariable double num1, @PathVariable double num2) {
        double resultado = division.operar(num1, num2);
        return new Operacion(num1, num2, "/", resultado).getOperacion();
    }
}
