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

// 1. A constructor that accepts 3 parameters that define the Oval (position + dimension/ color/ isFilled)
// 2. Override draw method that draws this object onto the graphics object (Shape should be on the "Shape Drawing" box where this object passes through override)

import java.awt.Color;
import java.awt.Graphics;

public class Oval extends Shape {

    // Constructor inherited from Shape
    public Oval(int x, int y, int width, int height, Color shapeColor, boolean isFilled) {
        super(x , y, width, height, shapeColor, isFilled);
    }

    //Override abstract method from shape to be drawn on paintComponent
    @Override
    void draw(Graphics g) {
        g.setColor(super.shapeColor);
        if (super.isFilled == true) {
            g.fillOval(super.x, super.y, super.width, super.height);
        } else {
            g.drawOval(super.x, super.y, super.width, super.height);
        }
    }

}
