/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nsn;

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
public class nsnTest {
    
    public nsnTest() {
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
     * Test of nsn method, of class nsn.
     */
    @Test
    public void testNsn() {
        System.out.println("nsn");
        int a = 5;
        int b = 6;
        int expResult = 30;
        int result = nsn.nsn(a, b);
        assertEquals(expResult, result);
        
        a = 12;
        b = 15;
        expResult = 60;
        result = nsn.nsn(a, b);
        assertEquals(expResult, result);
        
        a = 25;
        b = 85;
        expResult = 425;
        result = nsn.nsn(a, b);
        assertEquals(expResult, result);
        
    }
    
}
