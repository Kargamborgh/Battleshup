/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package battleshup.logic;
import battleshup.gui.Grid;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JButton;

/**
 *
 * @author Kargamborgh
 */
public class ButtonListener implements ActionListener {
    
    private Grid grid;
    private int x;
    private int y;
    private JButton button;
    
    public ButtonListener(Grid grid, int x, int y, JButton button) {
        this.grid = grid;
        this.x = x;
        this.y = y;
        this.button = button;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (Grid.hitSquare(x, y)) {
            button.setText("hit");
        } else {
            button.setText("missed");
        }
    }
    
}
