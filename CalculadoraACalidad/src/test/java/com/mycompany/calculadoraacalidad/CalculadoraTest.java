package com.mycompany.calculadoraacalidad;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    @Test
    void suma_ok() {
        var calc = new CalculadoraACalidad();
        assertEquals(5, calc.sumar(2, 3));
    }

    @Test
    void resta_ok() {
        var calc = new CalculadoraACalidad();
        assertEquals(3, calc.restar(5, 2));
    }

    @Test
    void multiplicacion_ok() {
        var calc = new CalculadoraACalidad();
        assertEquals(12, calc.multiplicar(4, 3));
    }

    @Test
    void division_ok_debe_fallar_por_bug() {
        var calc = new CalculadoraACalidad();
        // Este test FALLARÁ porque dividir hace a*b (bug intencional).
        assertEquals(4.0, calc.dividir(8, 2), 1e-9);
    }

    @Test
    void division_por_cero_lanza_excepcion() {
        var calc = new CalculadoraACalidad();
        assertThrows(ArithmeticException.class, () -> calc.dividir(5, 0));
    }
}
