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
public class ThreeShip implements ShipInterface {

    int[] squares;
    
    public ThreeShip() {
        squares = new int[3];
        for(int i = 0; i < 3; i++) {
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
        return false; //implement later
    }
    
}
