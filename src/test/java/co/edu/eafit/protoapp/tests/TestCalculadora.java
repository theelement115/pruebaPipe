/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import co.edu.eafit.protoapp.Calculadora;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestCalculadora {
    
    @Test
    public void testCuadrado() {
        Calculadora calc = new Calculadora();
        assertEquals(25.0, calc.cuadrado(5.0), 0);
    }
    
}
