/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package battleshup.battleshup;

import battleshup.elements.FiveShip;
import battleshup.elements.FourShip;
import battleshup.gui.Grid;
import battleshup.elements.ThreeShip;
import battleshup.elements.TwoShip;

/**
 *
 * @author Kargamborgh
 */
public class Main { 
    
    public static void startGame() {
        
        
        new Grid(10,10);
        TwoShip twoShip = new TwoShip();
        ThreeShip threeShip = new ThreeShip();
        FourShip fourShip = new FourShip();
        FiveShip fiveShip = new FiveShip();
        
        fiveShip.place(2, 3);
        fourShip.place(5, 6);
        threeShip.place(1, 4);
        twoShip.place(8, 8);
        
    }
    
    public static void main(String[] args) {
        
        startGame();
    }
    
}
