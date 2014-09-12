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
public class FiveShip implements ShipInterface {
    
    int[] squares; //square value 1 means not hit, 0 means hit
    
    public FiveShip() {
        squares = new int[5];
        for(int i = 0; i < 5; i++) {
            squares[i] = 1;
        }
    }

    @Override
    public int returnSize() {
        return squares.length;
    }

    @Override
    public int returnHealth() {
        return 0;
        //implemented later, returns squares that have not been hit
    }

    @Override
    public void sink() {
        //sink ship (remove from play)
    }

    @Override
    public boolean isPlaced() {
        return false;
    }
    
}
