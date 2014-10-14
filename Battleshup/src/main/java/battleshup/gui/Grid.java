/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleshup.gui;

import battleshup.elements.Ship;
import battleshup.logic.ButtonListener;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

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
    private static Ship[][] gridArray;
    private static int shipsOnGrid;

    JFrame frame = new JFrame(); //JFrame full of JButtons
    JButton[][] grid;

    public Grid(int width, int length) {

        frame.setLayout(new GridLayout(width, length));
        grid = new JButton[width][length]; //initialise jbutton grid array
        for (int y = 0; y < length; y++) {
            for (int x = 0; x < width; x++) {
                grid[x][y] = new JButton("(" + x + "," + y + ")");
                frame.add(grid[x][y]); //add button to grid
                grid[x][y].addActionListener(new ButtonListener(this,x,y,grid[x][y]));
            }
        }
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        
        shipsOnGrid = 0;
        
        gridArray = new Ship[width][length];
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < length; j++) {
                gridArray[i][j] = null; //set array values to 0 as default
            }
        }
    }

    

    public static void addShipToGrid() {
        shipsOnGrid++;
    }

    public static int shipsOnGrid() {
        return shipsOnGrid;
    }

    public static boolean isSquareEmpty(int x, int y) {
        return gridArray[x][y] != null;
    }
    
    static void checkGameOver() {
         for (Ship[] row : gridArray) {
             for (Ship ship : row) {
                 if (ship == null) continue;
                 
                 if (ship.isSunk()) return;
             } 
         }
         
         JOptionPane.showMessageDialog(null, "Game over!");
    }

    //hit square if square has stuff in it
    public static boolean hitSquare(int x, int y) {
        Ship ship = gridArray[x][y];
        if (ship == null) {
            return false;
        }
        ship.hit();
        checkGameOver();
        return true;
    }

    public static void addToSquare(int x, int y, Ship ship) {
        if (gridArray[x][y] == null) {
            gridArray[x][y] = ship;
        } 
    }

}
