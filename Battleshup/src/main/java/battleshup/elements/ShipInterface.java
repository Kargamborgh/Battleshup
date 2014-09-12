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
public interface ShipInterface {
    int returnSize();
    int[] returnHealth();
    void sink();
    boolean isPlaced();
}
