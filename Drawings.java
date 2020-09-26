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

// 1. Extend JPanel class
// 2. Instance variable contains shape currently drawn
// 3. Overridden method named paintComponent that accepts the object shape (Oval/Rectangle) as parameter
//    Draw the number of shapes created thus far in upper left hand corner
// 4. Overridden getPreferredSize method that limits the dimension to 200px by 200px
// 5. Method named drawShape accepts shape (Oval/Rectangle) as parameter
//      a. First checks if the shape will completely fit in the panel, if not call an OutsideBounds exception (class you created)
//      b. Saves shape in the instance variable
//      c. Calls repaint the will create shape on the panel

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;

public class Drawings extends JPanel {

    /**
     * Creates new form Drawings2
     */

    //static Shape tempShape  = new Oval(0,0,0,0,Color.MAGENTA,true);
    static Shape tempShape;


    public Drawings() {
        initComponents();
    }

    @Override
    public void paintComponent(Graphics g) {

        // draws shape onto panel then repaints once draw button is click
        try {

            super.paintComponent(g);
            tempShape.draw(g);
            repaint();
        } catch (NullPointerException e){
        }
    }


    public static void drawShape() throws OutsideBounds, NumberFormatException {

        // reads the text fields and throws an exception if the values are invalid
        try {

            // reads the text fields and throws an OutsideBounds exception if width and height is greater than 200
            if ((Integer.parseInt(Project3.jTextField1.getText()) > 200) || Integer.parseInt(Project3.jTextField2.getText()) > 200) {

                System.out.println(Project3.jComboBox1.getSelectedItem());
                System.out.println(Project3.jComboBox2.getSelectedItem());
                System.out.println(Project3.jComboBox3.getSelectedItem());

                System.out.println(Integer.parseInt(Project3.jTextField1.getText()));
                System.out.println(Integer.parseInt(Project3.jTextField2.getText()));
                System.out.println(Integer.parseInt(Project3.jTextField3.getText()));
                System.out.println(Integer.parseInt(Project3.jTextField4.getText()));

                //} throw new OutsideBounds();

                throw new OutsideBounds();
            }

            // Creating a shape to be passed; determines whether the data input is an Oval or Rectangular

            // if Oval Solid
            if (Project3.jComboBox1.getSelectedItem() == "Oval"){
                if (Project3.jComboBox2.getSelectedItem() == "Solid") {
                    tempShape = new Oval(Integer.parseInt(Project3.jTextField4.getText()),Integer.parseInt(Project3.jTextField3.getText()),Integer.parseInt(Project3.jTextField1.getText()),Integer.parseInt(Project3.jTextField2.getText()), Color.blue, true);
                    if (Project3.jComboBox3.getSelectedItem() == "Black") {
                        tempShape.shapeColor = Color.BLACK;
                    } else if (Project3.jComboBox3.getSelectedItem() == "Red") {
                        tempShape.shapeColor = Color.RED;
                    } else if (Project3.jComboBox3.getSelectedItem() == "Orange") {
                        tempShape.shapeColor = Color.ORANGE;
                    } else if (Project3.jComboBox3.getSelectedItem() == "Yellow") {
                        tempShape.shapeColor = Color.YELLOW;
                    } else if (Project3.jComboBox3.getSelectedItem() == "Green") {
                        tempShape.shapeColor = Color.GREEN;
                    } else if (Project3.jComboBox3.getSelectedItem() == "Blue") {
                        tempShape.shapeColor = Color.BLUE;
                    } else if (Project3.jComboBox3.getSelectedItem() == "Magenta") {
                        tempShape.shapeColor = Color.MAGENTA;
                    }

                    // delete later
                    System.out.println(tempShape.toString());
                    System.out.println(tempShape.shapeColor.toString());

                } else {
                    // if Oval Hollow
                    tempShape = new Oval(Integer.parseInt(Project3.jTextField4.getText()),Integer.parseInt(Project3.jTextField3.getText()),Integer.parseInt(Project3.jTextField1.getText()),Integer.parseInt(Project3.jTextField2.getText()), Color.blue, false);
                    if (Project3.jComboBox3.getSelectedItem() == "Black") {
                        tempShape.shapeColor = Color.BLACK;
                    } else if (Project3.jComboBox3.getSelectedItem() == "Red") {
                        tempShape.shapeColor = Color.RED;
                    } else if (Project3.jComboBox3.getSelectedItem() == "Orange") {
                        tempShape.shapeColor = Color.ORANGE;
                    } else if (Project3.jComboBox3.getSelectedItem() == "Yellow") {
                        tempShape.shapeColor = Color.YELLOW;
                    } else if (Project3.jComboBox3.getSelectedItem() == "Green") {
                        tempShape.shapeColor = Color.GREEN;
                    } else if (Project3.jComboBox3.getSelectedItem() == "Blue") {
                        tempShape.shapeColor = Color.BLUE;
                    } else if (Project3.jComboBox3.getSelectedItem() == "Magenta") {
                        tempShape.shapeColor = Color.MAGENTA;
                    }

                    // delete later
                    System.out.println(tempShape.toString());
                    System.out.println(tempShape.shapeColor.toString());
                }
            } else {
                // if Rectangular Solid
                if (Project3.jComboBox2.getSelectedItem() == "Solid") {
                    tempShape = new Rectangular (Integer.parseInt(Project3.jTextField4.getText()),Integer.parseInt(Project3.jTextField3.getText()),Integer.parseInt(Project3.jTextField1.getText()),Integer.parseInt(Project3.jTextField2.getText()), Color.blue, true);
                    if (Project3.jComboBox3.getSelectedItem() == "Black") {
                        tempShape.shapeColor = Color.BLACK;
                    } else if (Project3.jComboBox3.getSelectedItem() == "Red") {
                        tempShape.shapeColor = Color.RED;
                    } else if (Project3.jComboBox3.getSelectedItem() == "Orange") {
                        tempShape.shapeColor = Color.ORANGE;
                    } else if (Project3.jComboBox3.getSelectedItem() == "Yellow") {
                        tempShape.shapeColor = Color.YELLOW;
                    } else if (Project3.jComboBox3.getSelectedItem() == "Green") {
                        tempShape.shapeColor = Color.GREEN;
                    } else if (Project3.jComboBox3.getSelectedItem() == "Blue") {
                        tempShape.shapeColor = Color.BLUE;
                    } else if (Project3.jComboBox3.getSelectedItem() == "Magenta") {
                        tempShape.shapeColor = Color.MAGENTA;
                    }

                    // delete later
                    System.out.println(tempShape.toString());
                    System.out.println(tempShape.shapeColor.toString());

                    // if Rectangular Hollow
                } else {
                    tempShape = new Rectangular(Integer.parseInt(Project3.jTextField4.getText()),Integer.parseInt(Project3.jTextField3.getText()),Integer.parseInt(Project3.jTextField1.getText()),Integer.parseInt(Project3.jTextField2.getText()), Color.blue, false);
                    if (Project3.jComboBox3.getSelectedItem() == "Black") {
                        tempShape.shapeColor = Color.BLACK;
                    } else if (Project3.jComboBox3.getSelectedItem() == "Red") {
                        tempShape.shapeColor = Color.RED;
                    } else if (Project3.jComboBox3.getSelectedItem() == "Orange") {
                        tempShape.shapeColor = Color.ORANGE;
                    } else if (Project3.jComboBox3.getSelectedItem() == "Yellow") {
                        tempShape.shapeColor = Color.YELLOW;
                    } else if (Project3.jComboBox3.getSelectedItem() == "Green") {
                        tempShape.shapeColor = Color.GREEN;
                    } else if (Project3.jComboBox3.getSelectedItem() == "Blue") {
                        tempShape.shapeColor = Color.BLUE;
                    } else if (Project3.jComboBox3.getSelectedItem() == "Magenta") {
                        tempShape.shapeColor = Color.MAGENTA;
                    }

                    // delete later
                    System.out.println(tempShape.toString());
                    System.out.println(tempShape.shapeColor.toString());
                }
            }


            jLabel1.setText(Integer.toString(Shape.getNoOfShapes()));


        } catch (OutsideBounds e) {


        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter whole number in the appropriate fields");


        }
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createTitledBorder("Shape Drawing"));
        setToolTipText("");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(200, 200));
        setSize(new java.awt.Dimension(200, 200));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(154, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 158, Short.MAX_VALUE))
        );
    }// </editor-fold>


    // Variables declaration - do not modify
    protected static javax.swing.JLabel jLabel1;
    // End of variables declaration
}
