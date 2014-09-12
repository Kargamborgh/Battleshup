/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package battleshup.battleshup;

import battleshup.elements.FiveShip;
import battleshup.elements.FourShip;
import battleshup.elements.Grid;
import battleshup.elements.ThreeShip;
import battleshup.elements.TwoShip;

/**
 *
 * @author Kargamborgh
 */
public class Main { //such WIP wow
    
    public static void startGame() {
        
        //instantiate grid & ships
        Grid grid = new Grid();
        TwoShip twoShip1 = new TwoShip();
        ThreeShip threeShip1 = new ThreeShip();
        FourShip fourShip1 = new FourShip();
        FiveShip fiveShip1 = new FiveShip();
    }
    
    public static void main(String[] args) {
        
        startGame();
    }
    
}
