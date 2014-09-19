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
    private static int[][] gridArray;
    private static int shipsOnGrid;

    public Grid() {
        shipsOnGrid = 0;
        gridArray = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                gridArray[i][j] = 0; //set array values to 0 as default
            }
        }
    }
    

    public static boolean placementCheck(int x, int y) { //checks that the square is empty, no stacking ships!
        if (gridArray[x][y] == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    public static void addShipToGrid() {
        shipsOnGrid++;
    }

    public int shipsOnGrid() {
        return shipsOnGrid;
    }
    
    public static int checkSquare(int x, int y) {
        return gridArray[x][y];
    }
    
    //hit square, if square has stuff in it
    public void hitSquare(int x, int y) {
        if (gridArray[x][y] == 1){
            gridArray[x][y] = 0;
            //hit!
        } else {
            //miss :(
            //more stuff here on a later deadline
        }
    }
    
    public static void addToSquare(int x, int y) {
        if (gridArray[x][y] == 0) {
            gridArray[x][y] = 1;
        } else {
            //do nothing
        }
    }

}
