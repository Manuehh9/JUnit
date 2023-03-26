/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package myutils;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author garci
 */
public class MyUtilTest {
    
    public MyUtilTest() {
    }
    
    @Test
    public void testInverteix() {
        System.out.println("inverteix");
        String cadena = "HOLA";
        String expResult = "ALOH";
        String result = MyUtil.inverteix(cadena);
        assertEquals(expResult, result);
    }


    @Test
    public void testEdat() {
        System.out.println("edat");
        int day = 2;
        int month = 9;
        int year = 2004;
        int expResult = 18;
        int result = MyUtil.edat(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void testFactorial() {
        System.out.println("factorial");
        double numero = 5;
        double expResult = 120;
        double result = MyUtil.factorial(numero);
        assertEquals(expResult, result, 0);
    }
    
}
