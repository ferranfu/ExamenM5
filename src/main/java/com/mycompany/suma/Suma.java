package com.mycompany.suma;

public class Suma {

    public double Sumar(double numeroA, double numeroB) {
        double suma = numeroA + numeroB;
        return suma;
    }

    public double getNum1(double numeroA) {
        return numeroA;
    }

    public double sumaValorAbsolut(double numeroA, double numeroB) {
        double suma = Math.abs(numeroA) + Math.abs(numeroB);
        return suma;
    }
}
