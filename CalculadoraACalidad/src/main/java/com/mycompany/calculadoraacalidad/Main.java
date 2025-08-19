
package com.mycompany.calculadoraacalidad;

public class Main {
    public static void main(String[] args) {
        CalculadoraACalidad calc = new CalculadoraACalidad();

        System.out.println("Suma 2 + 3 = " + calc.sumar(2, 3));
        System.out.println("Resta 5 - 2 = " + calc.restar(5, 2));
        System.out.println("Multiplicación 4 * 3 = " + calc.multiplicar(4, 3));
        System.out.println("División 8 / 2 (con bug, debería dar 4) = " + calc.dividir(8, 2));

        System.out.println("Promedio del historial = " + calc.promedioHistorial());
        System.out.println("Historial de operaciones: " + calc.obtenerHistorial());
    }
} 

