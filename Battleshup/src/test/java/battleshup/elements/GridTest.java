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
    
    @Test
    public void testPlacementCheck() {
        Grid instance = new Grid();
        assertTrue(instance.placementCheck(1,1)); //constructor sets all squares to 1, this should return true
    }
    
    @Test
    public void testAddShip() {
        Grid instance = new Grid();
        instance.addShipToGrid();
        assertEquals(instance.shipsOnGrid(), 1); //ship should be added
    }
    
    @Test
    public void testSquareEditing() { //add to square, check that adding works, then hit square and check that hitting works
        Grid instance = new Grid();
        instance.addToSquare(1,1);
        assertEquals(instance.checkSquare(1,1), 1);
        instance.hitSquare(1,1);
        assertEquals(instance.checkSquare(1,1), 0);
    }
    
}
