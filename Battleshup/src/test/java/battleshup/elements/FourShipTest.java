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
public class FourShipTest {
    
    public FourShipTest() {
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
     * Test of returnSize method, of class FourShip.
     */
    @Test
    public void testReturnSize() {
        System.out.println("returnSize");
        FourShip instance = new FourShip();
        int expResult = 4;
        int result = instance.returnSize();
        assertEquals(expResult, result);
    }

    /**
     * Test of returnHealth method, of class FourShip.
     */
    @Test
    public void testReturnHealth() {
        System.out.println("returnHealth");
        FourShip instance = new FourShip();
        int[] expResult = {1,1,1,1};
        int[] result = instance.returnHealth();
        assertArrayEquals(expResult, result);
    }

    @Test
    public void testSinking() {
        FourShip instance = new FourShip();
        instance.sink();
        assertFalse(instance.isPlaced());
        int[] expResult = {0,0,0,0};
        assertArrayEquals(expResult, instance.returnHealth());
    }

    @Test
    public void testPlacing() { //if placing succeeds, place and isPlaced should return true
        Grid grid = new Grid(10,10);
        FourShip instance = new FourShip();
        
        assertTrue(instance.place(0, 0));
        assertTrue(instance.isPlaced());
    }
    
}
