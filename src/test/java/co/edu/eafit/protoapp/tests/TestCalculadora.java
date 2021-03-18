package co.edu.eafit.protoapp.tests;

import co.edu.eafit.protoapp.Calculadora;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestCalculadora {

    @Test
    public void testCuadrado() {
        Calculadora calc = new Calculadora();
        assertEquals(25.0, calc.cuadrado(5.0), 0);
    }

    @Test
    public void testCero() {
        Calculadora calc = new Calculadora();
        assertEquals(0.0, calc.cuadrado(0.0), 0);
    }

    @Test
    public void testUno() {
        Calculadora calc = new Calculadora();
        assertEquals(1.0, calc.cuadrado(1.0), 0);
    }

    @Test
    public void testNegativo() {
        Calculadora calc = new Calculadora();
        assertEquals(16.0, calc.cuadrado(-4.0), 0);
    }
}
