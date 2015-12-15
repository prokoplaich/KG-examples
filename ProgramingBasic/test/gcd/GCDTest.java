/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gcd;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Student
 */
public class GCDTest {
    
    public GCDTest() {
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
     * Test of gcd method, of class GCD.
     */
    @Test
    public void testGcd() {
        System.out.println("gcd");
        int a = 1;
        int b = 2;
        int expResult = 1;
        int result = GCD.gcd(a, b);
        assertEquals(expResult, result);
       
        a = 4;
        b = 8;
        expResult = 4;
        result = GCD.gcd(a, b);
        assertEquals(expResult, result);
        
        a = 3;
        b = 5;
        expResult = 1;
        result = GCD.gcd(a, b);
        assertEquals(expResult, result);
        
        a = 6;
        b = 9;
        expResult = 3;
        result = GCD.gcd(a, b);
        assertEquals(expResult, result);
        
        a = 5;
        b = 15;
        expResult = 5;
        result = GCD.gcd(a, b);
        assertEquals(expResult, result);
    }
    
}
