package com.uce.funciones;

public class Calculadora {
    
    public static final double PI = 3.1416;
    public static final double e = 2.7183;

    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public double dividir(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("No se puede dividir por cero");
            return 0;
        }
    }

    public static int factorial(int n) {
        int resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
    
    
}
