/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rodrigo.gregori
 */
public class TestaSoma {
    
    private Soma classeTestada;
    
    public TestaSoma() {
        classeTestada = new Soma();
    }
    
    @Test
    public void testaSomaAmbosPositivos() {
        int a = 10;
        int b = 9;
        int esperado = 19;
        assertEquals(esperado, classeTestada.soma(a, b));       
    }
    
    @Test
    public void testaSomaMaiorNegativo() {
        int a = -10;
        int b = 4;
        int esperado = -6;
        assertEquals(esperado, classeTestada.soma(a, b));
    }
    
    @Test
    public void testaSomaMaiorPositivo() {
        int a = 15;
        int b = -7;
        int esperado = 8;
        assertEquals(esperado, classeTestada.soma(a, b));
    }
         

}
