/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package battleshup.elements;

import battleshup.gui.Grid;
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

    @Test
    public void testSinking() {
        ThreeShip instance = new ThreeShip();
        instance.sink();
        assertFalse(instance.isPlaced());
        int[] expResult = {0,0,0};
        assertArrayEquals(expResult, instance.returnHealth());
    }

    @Test
    public void testPlacing() { //if placing succeeds, place and isPlaced should return true
        Grid grid = new Grid(10,10);
        TwoShip instance = new TwoShip();
        
        assertTrue(instance.place(2, 2));
        assertTrue(instance.isPlaced());
    }
    
}
