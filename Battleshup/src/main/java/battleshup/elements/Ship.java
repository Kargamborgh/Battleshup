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
    int[] herp;
    int[][] derp;
    boolean hurr;
    
    abstract int returnSize();
    abstract int[] returnHealth();
    abstract void sink();
    abstract boolean isPlaced();
    abstract boolean place(boolean alignment, int x, int y);
    abstract int[][] returnPosition();
    
}
