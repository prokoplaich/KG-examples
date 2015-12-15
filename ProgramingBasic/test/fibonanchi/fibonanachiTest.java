/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonanchi;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ProkopLaichter
 */
public class fibonanachiTest {
    
    public fibonanachiTest() {
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
     * Test of fibonanchi method, of class fibonanachi.
     */
    @Test
    public void testFibonanchi() {
        System.out.println("fibonanchi");
        int a = 1;
        int expResult = 1;
        int result = fibonanachi.fibonanchi(a);
        assertEquals(expResult, result);
        
        System.out.println("fibonanchi");
        a = 2;
        expResult = 2;
        result = fibonanachi.fibonanchi(a);
        assertEquals(expResult, result);
        
        System.out.println("fibonanchi");
        a = 5;
        expResult = 8;
        result = fibonanachi.fibonanchi(a);
        assertEquals(expResult, result);
        
        System.out.println("fibonanchi");
        a = 7;
        expResult = 21;
        result = fibonanachi.fibonanchi(a);
        assertEquals(expResult, result);
    }
    
}
