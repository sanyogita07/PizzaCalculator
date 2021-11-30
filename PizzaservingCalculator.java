/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaservingcalculator;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author sanyogitadeshmukh
 */
public class PizzaservingCalculator implements ActionListener { //pizzaservingcalculator class implements actionlistener which is an interface//

   
    private JFrame fr;//initialising a frame//
    private JLabel lblheading;
    private JPanel line2; //initialising a panel//
    private JLabel lblsize, lbldisplay;//initialising a label//
    private JTextField textsize;//initialising a text entry box//
    private JButton btncalc;//initialising a button//
    
    
    void gui()
            
    { fr = new JFrame("Pizza Servings Calculator");
      fr.setLayout(new GridLayout(4,1));//making a grid layout//
      lblheading= new JLabel("Pizza Servings Calculator", SwingConstants.CENTER);//making the heading//
      lblheading.setForeground(Color.red);
      Font f = new Font("Serif",Font.BOLD,24);// setting the font and size of the heeading//
      lblheading.setFont(f);
      fr.add(lblheading);//adding the heading to the frame//
      line2= new JPanel();
      lblsize= new JLabel("Enter the size of the pizza in inches:");
      textsize= new JTextField(4);//setting the size of the text box//
      line2.add(lblsize);
      line2.add(textsize);
      fr.add(line2);//adding panel to the frame//
      btncalc= new JButton("Calculate Servings");
      fr.add(btncalc);//adding a button to the frame//
      lbldisplay=new JLabel("",SwingConstants.CENTER);
      fr.add(lbldisplay);//adding a panel to the frame//
      btncalc.addActionListener(this);
      fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// command to stop running and close the page after the page is displayed//
      fr.setSize(350, 300);//setting the size of the frame//
      fr.setVisible(true);//command to make the frame visible//
      
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
       PizzaservingCalculator p = new PizzaservingCalculator();
       p.gui();
    }

    @Override
    public void actionPerformed(ActionEvent e) { //method where the role of button is described//
        double servings = Math.pow((Double.parseDouble(textsize.getText()) / 8),2);//when you click the button, it will calculate the servings for that size of pizza//
        lbldisplay.setText("A "+ textsize.getText()+" inch pizza will serve "+String.format("%.2f",servings)+" people.");
        
    }
    
}
