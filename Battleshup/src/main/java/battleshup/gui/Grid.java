/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleshup.gui;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.GridLayout;

/**
 *
 * @author Kargamborgh
 *
 * This is the grid class or the "playing field" on which ships are placed. It
 * provides several methods for operations on individual squares.
 */
public class Grid {

    //simulate a grid with a 2-dimensional array
    //values at indices are 0 if no ship is present, 1 if ship is present
    private static int[][] gridArray;
    private static int shipsOnGrid;

    JFrame frame = new JFrame(); //JFrame full of dumb JButtons, todo make clicking on a button shoot at a specific location
    JButton[][] grid;

    public Grid(int width, int length) {

        frame.setLayout(new GridLayout(width, length));
        grid = new JButton[width][length]; //initialise jbutton grid array
        for (int y = 0; y < length; y++) {
            for (int x = 0; x < width; x++) {
                grid[x][y] = new JButton("(" + x + "," + y + ")");
                frame.add(grid[x][y]); //add button to grid
            }
        }
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        
        

        shipsOnGrid = 0;
        
        //DEPRECATED due to refactoring?
        gridArray = new int[width][length];
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < length; j++) {
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
        if (gridArray[x][y] == 1) {
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
