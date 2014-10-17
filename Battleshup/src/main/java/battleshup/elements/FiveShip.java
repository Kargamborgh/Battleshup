/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleshup.elements;

import battleshup.gui.Grid;

/**
 *
 * @author Kargamborgh
 * 
 * This is a five-square ship class that extends abstract class Ship.
 * It knows (or should know after implementation) its position and health (unhit squares).
 * It also offers methods for placing and removing (sinking) instances of itself.
 */
public class FiveShip extends Ship {

    private int[] squares;
    private int[][] position;//square value 1 means not hit, 0 means hit
    private boolean placed;
    private int range;
    private int health;
    
    /*
    * The constructor sets ship health to maximum (depending on size) and creates an array
    * into which the position of the ship parts are placed.
    */

    public FiveShip() {
        health = 5;
        squares = new int[5];
        for (int i = 0; i < 5; i++) {
            squares[i] = 1;
            this.squares = squares;
        }
        position = new int[20][10];
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 10; j++) {
                position[i][j] = 0;
            }
        }
    }

    @Override
    public int returnSize() {
        return squares.length;
    }

    @Override
    public int[] returnHealth() {
        return this.squares;
        //return square values
    }

    
    
    
    @Override
    public int[][] returnPosition() {
        return this.position;
    }

    /**
     *  The method sets ship "square" values to zero as well as clears its position
     * and sets placed to false.
     */
    
    @Override
    public void sink() {
        for (int i = 0; i < 5; i++) {
            this.squares[i] = 0;
        }
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 10; j++) {
                this.position[i][j] = 0;
            }
        }
        placed = false;
    }

    @Override
    public boolean isPlaced() {
        return placed;
    }
    
    /*
    * The randomWithRange method takes two integers as parameters and returns a random integer
    * from the range.
    * @param    min     the smallest possible integer
    * @param    max     the largest possible integer
    *
    * @return a random integer from the range
    */
    
    @Override
    public int randomWithRange(int min, int max) {
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;
    }
    
    /*
    * The randomAlignment method uses the randomWithRange method to determine
    * whether the ship is placed horizontally or vertically.
    * @return truth value of i == 1
    */
    
    public boolean randomAlignment() { //randomize ship alignment: true == horizontal, false == vertical
        int i = randomWithRange(0,1);
        return i == 1;
    }

    /*
    * The place method uses two parameter integers, determines ship alignment, randomizes the integers
    * and checks for space availability before placing the ship on the grid using Grid class methods.
    * @param    x   x coordinate
    * @param    y   y coordinate
    *
    * @return truth value of successful placement
    */
    
    public boolean place(int x, int y) { //if all squares are free, place ship and placed == true. if not, return false
        if (randomAlignment() == true) {
            x = randomWithRange(0,5);
            for (int i = x; i < x + 5; i++) {
                if (!Grid.isSquareEmpty(i, y)) {
                    Grid.addToSquare(i, y, this);
                    position[i][y] = 1;
                } else {
                    return false;
                }
            }
        } else {
            y = randomWithRange(0,5);
            for (int i = y; i < y + 5; i++) {
                if (!Grid.isSquareEmpty(x, i)) {
                    Grid.addToSquare(x, i, this);
                    position[x][i] = 1;
                } else {
                    return false;
                }
            }
        }
        Grid.addShipToGrid();
        placed = true;
        return true;
    }



}
