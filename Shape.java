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

// 1. A constructor that accepts 3 parameters that define the Rectangle (position + dimension/ color/ isFilled)
// 2. Method (Instance) named setColor that accepts object Graphics as parameter to be drawn on the panel (no return value)
// 3. Method (Instance) named getSolid that returns whether or not the shape is filled or not filled (returns isFilled; true/false)
// 4. Method (Class) named getNoOfShapes that returns the number of shapes created so far (returns this.noOfShapes)
// 5. Method (Abstract) named draw the accepts a Graphics object as parameter (returns Graphics probably/instruction doesnt specify)

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

abstract class Shape extends Rectangle {

    // Variables
    Color shapeColor;
    Graphics shapeGraphics;
    boolean isFilled;
    static int shapesCreated;

    // Constructor
    public Shape(int x, int y, int width, int height, Color shapeColor, boolean isFilled) {
        super(x, y, width, height);
        this.shapeColor = shapeColor;
        this.isFilled = isFilled;
        shapesCreated++;
    }

    // Methods
    public void setColor(Graphics g) {
        this.shapeGraphics = g;
    }

    public boolean getSolid() {
        return isFilled;
    }

    public static int getNoOfShapes() {
        return shapesCreated;
    }

    abstract void draw(Graphics g);

}
