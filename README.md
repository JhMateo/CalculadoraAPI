# CalculadoraAPI

Esta API de calculadora, desarrollada en Spring, proporciona funcionalidades básicas de suma, resta, multiplicación y división. Es una herramienta práctica para realizar operaciones matemáticas simples mediante solicitudes HTTP.

## Rutas Disponibles

### Sumar
Realiza una suma entre dos números.

- **Ruta:** `http://localhost:8082/api/calculadora/sumar/{num1}/{num2}`
- **Método:** GET
- **Ejemplo:** `http://localhost:8082/api/calculadora/sumar/5/3`

### Restar
Realiza una resta entre dos números.

- **Ruta:** `http://localhost:8082/api/calculadora/restar/{num1}/{num2}`
- **Método:** GET
- **Ejemplo:** `http://localhost:8082/api/calculadora/restar/8/2`

### Multiplicar
Realiza una multiplicación entre dos números.

- **Ruta:** `http://localhost:8082/api/calculadora/multiplicar/{num1}/{num2}`
- **Método:** GET
- **Ejemplo:** `http://localhost:8082/api/calculadora/multiplicar/4/6`

### Dividir
Realiza una división entre dos números.

- **Ruta:** `http://localhost:8082/api/calculadora/dividir/{num1}/{num2}`
- **Método:** GET
- **Ejemplo:** `http://localhost:8082/api/calculadora/dividir/10/2`

## Ejemplos de Uso

Puedes probar la API utilizando herramientas como curl o Postman. Aquí hay un ejemplo usando curl:

```bash
curl http://localhost:8082/api/calculadora/sumar/5/3
```

Esto devolverá el resultado de la suma.

¡Explora las diversas funciones que ofrece esta API y úsala según tus necesidades! Si tienes alguna pregunta o sugerencia, no dudes en comunicarte.
