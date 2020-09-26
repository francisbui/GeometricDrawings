/*
 * Francis Bui
 * CMIS 242
 * Dr. Schmeelk
 * Project 3 - Shape Drawing
 * July 21, 2020
 * The purpose of this program is to render various elliptical and rectangular shape defined by the x and y coordinates inputted
 * by the user. The shapes have the options of being either having an outline (hollow) or filled (solid) with various color options.
 * Additionally, the program will check for various exceptions. These includes, but not limited to, invalid non-integer input values
 * and shapes that do not fit within the parameters of the panel.
 *
 */

// 1. Defines what happens when the checked exception is triggered
//      a. message appears prompting user to input a valid value, i.e. "Please enter a value between 0 and 200"

import javax.swing.JOptionPane;

public class OutsideBounds extends Exception{

    // Pop-up error message if exception is called
    public OutsideBounds(){
        JOptionPane.showMessageDialog(null, "Please enter whole number value between 0 - 200");
    }

}
