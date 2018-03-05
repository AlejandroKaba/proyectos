/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junit_fecha;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HP
 */
public class FechaTest {
    
    public FechaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of devuelveFecha method, of class Fecha.
     */
    @Test
    public void testDevuelveFecha1() {
        System.out.println("devuelveFecha");
        int tipo = 1;
        Fecha instance = new Fecha();
        String expResult = "2018/03";
        String result = instance.devuelveFecha(tipo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testDevuelveFecha2() {
        System.out.println("devuelveFecha");
        int tipo = 2;
        Fecha instance = new Fecha();
        String expResult = "03/2018";
        String result = instance.devuelveFecha(tipo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testDevuelveFecha3() {
        System.out.println("devuelveFecha");
        int tipo = 3;
        Fecha instance = new Fecha();
        String expResult = "03/18";
        String result = instance.devuelveFecha(tipo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testDevuelveFecha4() {
        System.out.println("devuelveFecha");
        int tipo = 7;
        Fecha instance = new Fecha();
        String expResult = "ERROR";
        String result = instance.devuelveFecha(tipo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
