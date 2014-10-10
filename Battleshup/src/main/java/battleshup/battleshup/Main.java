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
public class Main { //such WIP wow
    
    public static void startGame() {
        
        //instantiate grid & ships
        new Grid(10,10);
        TwoShip twoShip1 = new TwoShip();
        ThreeShip threeShip1 = new ThreeShip();
        FourShip fourShip1 = new FourShip();
        FiveShip fiveShip1 = new FiveShip();
        TwoShip twoShip2 = new TwoShip();
        ThreeShip threeShip2 = new ThreeShip();
        FourShip fourShip2 = new FourShip();
        FiveShip fiveShip2 = new FiveShip();
        
    }
    
    public static void main(String[] args) {
        
        startGame();
    }
    
}
