/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package battleshup.gui;

import battleshup.elements.Ship;
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
        Grid instance = new Grid(10,10);
        assertNotNull(instance);
    }
    
    @Test
    public void testPlacementCheck() {
        Grid instance = new Grid(10,10);
        assertTrue(!instance.isSquareEmpty(1,1)); //constructor sets all squares to 1, this should return true
    }
    
    @Test
    public void testAddShip() {
        Grid instance = new Grid(10,10);
        instance.addShipToGrid();
        assertEquals(instance.shipsOnGrid(), 1); //ship should be added
    }
    

    /**
     * Test of addShipToGrid method, of class Grid.
     */
    @Test
    public void testAddShipToGrid() {
        System.out.println("addShipToGrid");
        Grid.addShipToGrid();
        assertEquals(Grid.shipsOnGrid(), 1);
    }

    /**
     * Test of shipsOnGrid method, of class Grid.
     */
    @Test
    public void testShipsOnGrid() {
        System.out.println("shipsOnGrid");
        Grid instance = null;
        int expResult = 0;
        int result = instance.shipsOnGrid();
        assertEquals(expResult, result);
    }

    /**
     * Test of isSquareEmpty method, of class Grid.
     */
    @Test
    public void testIsSquareEmpty() {
        System.out.println("isSquareEmpty");
        int x = 0;
        int y = 0;
        boolean expResult = false;
        boolean result = Grid.isSquareEmpty(x, y);
        assertEquals(expResult, result);
    }

    /**
     * Test of checkGameOver method, of class Grid.
     */
    @Test
    public void testCheckGameOver() {
        System.out.println("checkGameOver");
        Grid.checkGameOver();
    }

    /**
     * Test of hitSquare method, of class Grid.
     */
    @Test
    public void testHitSquare() {
        System.out.println("hitSquare");
        int x = 0;
        int y = 0;
        boolean expResult = false;
        boolean result = Grid.hitSquare(x, y);
        assertEquals(expResult, result);
    }

    /**
     * Test of addToSquare method, of class Grid.
     */
    @Test
    public void testAddToSquare() {
        System.out.println("addToSquare");
        int x = 0;
        int y = 0;
        Ship ship = null;
        Grid.addToSquare(x, y, ship);
    }
    
}
