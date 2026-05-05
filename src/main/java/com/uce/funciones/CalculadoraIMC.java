package com.uce.funciones;

public class CalculadoraIMC {

    public double calcularIMC(int peso, int estatura) {

        // Convertir estatura a metros
        double estatura1 = estatura / 100.0;
        // Convertir peso a kg
        double peso1 = peso * 0.453592;
        // Calcular IMC
        double imc = peso1 / (estatura1 * estatura1);
        return imc;
    }

    public double calcularIMC(double peso, double estatura) {
        // Calcular IMC
        int imc = (int) (peso / (estatura * estatura));
        return imc;
    }

}
