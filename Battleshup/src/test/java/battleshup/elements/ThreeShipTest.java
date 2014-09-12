/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package battleshup.elements;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kargamborgh
 */
public class ThreeShipTest {
    
    public ThreeShipTest() {
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
     * Test of returnSize method, of class ThreeShip.
     */
    @Test
    public void testReturnSize() {
        System.out.println("returnSize");
        ThreeShip instance = new ThreeShip();
        int expResult = 3;
        int result = instance.returnSize();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of returnHealth method, of class ThreeShip.
     */
    @Test
    public void testReturnHealth() {
        System.out.println("returnHealth");
        ThreeShip instance = new ThreeShip();
        int[] expResult = {1,1,1};
        int[] result = instance.returnHealth();
        assertArrayEquals(expResult, result);
        
    }

    /**
     * Test of sink method, of class ThreeShip.
     */
    @Test
    public void testSink() {
        System.out.println("sink");
        ThreeShip instance = new ThreeShip();
        instance.sink();
        //dumb-ass test since not implemented yet
    }

    /**
     * Test of isPlaced method, of class ThreeShip.
     */
    @Test
    public void testIsPlaced() {
        System.out.println("isPlaced");
        ThreeShip instance = new ThreeShip();
        boolean expResult = false;
        boolean result = instance.isPlaced();
        assertEquals(expResult, result);
        //dumb-ass test since not implemented yet
    }
    
}
