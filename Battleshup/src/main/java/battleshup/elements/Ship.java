/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package battleshup.elements;

/**
 *
 * @author Kargamborgh
 * 
 * This is an abstract ship class, different sized ship classes extend this.
 * Used to be an interface, but changed it to enable instantiation.
 * 
 * 
 */
public abstract class Ship {
    int[] sq;
    int[][] pos;
    boolean plcd;
    protected int health;
    
    abstract int returnSize();
    abstract int[] returnHealth();
    abstract void sink();
    abstract boolean isPlaced();
    abstract boolean place(int x, int y);
    abstract int[][] returnPosition();
    abstract int randomWithRange(int min, int max);
    public void hit() {
        if (health > 0) health--;
    }
    public boolean isSunk() {
        return (health == 0);
    }
    
}
