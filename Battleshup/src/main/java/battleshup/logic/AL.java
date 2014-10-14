/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package battleshup.logic;
import java.awt.*;
import java.awt.event.*;
import battleshup.gui.Grid;

/**
 *
 * @author Kargamborgh
 */
public class AL implements ActionListener {
    
    private Grid grid;
    private int x;
    private int y;
    
    public AL(Grid grid, int x, int y) {
        this.grid = grid;
        this.x = x;
        this.y = y;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
    }
    
}
