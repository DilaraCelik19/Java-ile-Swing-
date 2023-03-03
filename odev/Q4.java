/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odev;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author User-Pc
 */
public class Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      JFrame frame=new JFrame("Frame");
      JLabel label=new JLabel();
      label.setText("Label");
      label.setBounds(50, 10, 100, 30);
      
      JTextField text=new JTextField();
      text.setText("Text box");
      text.setBounds(50, 50, 200, 30);
      
      JButton button=new JButton();
      button.setText("Button");
      button.setBounds(100, 100, 100, 30);
      
      frame.add(label);
      frame.add(text);
      frame.add(button);
      frame.setSize(300, 300);
      frame.setLayout(null);
      frame.setVisible(true);
      
      
    }
    
}
