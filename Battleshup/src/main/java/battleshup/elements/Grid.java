/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package battleshup.elements;

/**
 *
 * @author Kargamborgh
 */
public class Grid {
    
    //simulate a 10x10 grid with a 2-dimensional array
    //values at indices are 0 if no ship is present, 1 if ship is present
    
    private int[][] gridArray;
    
    public Grid() {
        gridArray = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                gridArray[i][j] = 0; //set array values to 0 as default
            }
        }
    }
    
    //perhaps different methods for horizontal and vertical placement?
    public boolean placeShip() { //place ship on grid, return true if successfully placed
        return false; //not implemented yet
    }
    
}
