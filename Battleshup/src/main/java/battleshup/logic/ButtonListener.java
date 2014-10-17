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

/*
* The ButtonListener class is an actionlistener for JButtons in the GUI.
*/
public class ButtonListener implements ActionListener {
    
    private Grid grid;
    private int x;
    private int y;
    private JButton button;
    
    /*
    * The constructor assigns its parameters.
    *
    * @param    grid    The GUI grid
    * @param    x       x coordinate (integer)
    * @param    y       y coordinate (integer)
    * @param    button  A JButton
    */
    
    public ButtonListener(Grid grid, int x, int y, JButton button) {
        this.grid = grid;
        this.x = x;
        this.y = y;
        this.button = button;
    }

    /*
    * The actionPerformed method is used to set a JButton's text to hit or miss, depending
    * on whether the corresponding square on Grid's gridArray is occupied.
    *
    * @param    ae  an ActionEvent
    */
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (Grid.hitSquare(x, y)) {
            button.setText("hit");
        } else {
            button.setText("missed");
        }
    }
    
}
