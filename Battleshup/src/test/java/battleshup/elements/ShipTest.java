/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleshup.elements;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Kargamborgh
 */
public class ShipTest {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    /**
     * Test of returnSize method, of class Ship.
     */
    @Test
    public void testReturnSize() {
        System.out.println("returnSize");
        Ship instance = new ShipImpl();
        int expResult = 0;
        int result = instance.returnSize();
        assertEquals(expResult, result);
    }

    /**
     * Test of returnHealth method, of class Ship.
     */
    @Test
    public void testReturnHealth() {
        System.out.println("returnHealth");
        Ship instance = new ShipImpl();
        int[] expResult = null;
        int[] result = instance.returnHealth();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of sink method, of class Ship.
     */
    @Test
    public void testSink() {
        System.out.println("sink");
        Ship instance = new ShipImpl();
        instance.sink();
    }

    /**
     * Test of isPlaced method, of class Ship.
     */
    @Test
    public void testIsPlaced() {
        System.out.println("isPlaced");
        Ship instance = new ShipImpl();
        boolean expResult = false;
        boolean result = instance.isPlaced();
        assertEquals(expResult, result);
    }

    /**
     * Test of place method, of class Ship.
     */
    @Test
    public void testPlace() {
        System.out.println("place");
        int x = 0;
        int y = 0;
        Ship instance = new ShipImpl();
        boolean expResult = false;
        boolean result = instance.place(x, y);
        assertEquals(expResult, result);
    }

    /**
     * Test of returnPosition method, of class Ship.
     */
    @Test
    public void testReturnPosition() {
        System.out.println("returnPosition");
        Ship instance = new ShipImpl();
        int[][] expResult = null;
        int[][] result = instance.returnPosition();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of randomWithRange method, of class Ship.
     */
    @Test
    public void testRandomWithRange() {
        System.out.println("randomWithRange");
        int min = 0;
        int max = 0;
        Ship instance = new ShipImpl();
        int expResult = 0;
        int result = instance.randomWithRange(min, max);
        assertEquals(expResult, result);
    }

    /**
     * Test of hit method, of class Ship.
     */
    @Test
    public void testHit() {
        System.out.println("hit");
        Ship instance = new ShipImpl();
        instance.hit();
    }

    /**
     * Test of isSunk method, of class Ship.
     */
    @Test
    public void testIsSunk() {
        System.out.println("isSunk");
        Ship instance = new ShipImpl();
        boolean expResult = true;
        boolean result = instance.isSunk();
        assertEquals(expResult, result);

    }

    private void assertArrayEquals(int[] expResult, int[] result) {
    }

    private void assertArrayEquals(int[][] expResult, int[][] result) {
    }

    public class ShipImpl extends Ship {

        public int returnSize() {
            return 0;
        }

        public int[] returnHealth() {
            return null;
        }

        public void sink() {
        }

        public boolean isPlaced() {
            return false;
        }

        public boolean place(int x, int y) {
            return false;
        }

        public int[][] returnPosition() {
            return null;
        }

        public int randomWithRange(int min, int max) {
            return 0;
        }
    }

}
