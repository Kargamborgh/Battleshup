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
public class FourShip implements ShipInterface {
    
    private int[] squares;
    private boolean placed;
    
    public FourShip() {
        squares = new int[4];
        for(int i = 0; i < 4; i++) {
            squares[i] = 1;
            this.squares = squares;
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
    public void sink() {
        //sink ship (remove from play) implement later
    }

    @Override
    public boolean isPlaced() {
        return placed; 
    }
    
    public boolean place(boolean alignment, int x, int y) { //if all squares are free, place ship and placed == true. if not, return false
        if (alignment == true) {
            for (int i = x; i < x + 4; i++) {
                if (Grid.placementCheck(i, y)) {
                    Grid.addToSquare(i, y);
                } else {
                    return false;
                }
            }
        } else if (alignment == false) {
            for (int i = y; i < y + 4; i++) {
                if (Grid.placementCheck(x, i)) {
                    Grid.addToSquare(x, i);
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
