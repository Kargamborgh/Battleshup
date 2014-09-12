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
public class GridTest {
    
    public GridTest() {
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

    @Test
    public void testGridExists() {
        Grid instance = new Grid();
        assertNotNull(instance);
    }
    
    /**
     * Test of placeShip method, of class Grid.
     */
    @Test
    public void testPlaceShip() {
        System.out.println("placeShip");
        Grid instance = new Grid();
        boolean expResult = false;
        boolean result = instance.placeShip();
        assertEquals(expResult, result);
        //dumb-ass test since not implemented yet
    }

    /**
     * Test of shipsOnGrid method, of class Grid.
     */
    @Test
    public void testShipsOnGrid() {
        System.out.println("shipsOnGrid");
        Grid instance = new Grid();
        int expResult = 0;
        int result = instance.shipsOnGrid();
        assertEquals(expResult, result);
        //dumb-ass test since not implemented yet
    }
    
}
