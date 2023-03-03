/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odev;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

/**
 *
 * @author User-Pc
 */
public class Q5 {
    public static void main(String[] args) {
        JFrame f=new JFrame("Frame örneği");
        JTextField text=new JTextField();
        text.setBounds(50, 50,200, 30);
        
        JToggleButton toogle=new JToggleButton();
        toogle.setText("Button");
        toogle.setBounds(100, 100, 100, 30);
        toogle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(toogle.isSelected()){
                    toogle.setText("VİSİBLE");
                    toogle.setBackground(Color.PINK);
                    text.setVisible(true);
                }else{
                toogle.setText("UNVİSİBLE");
                toogle.setBackground(Color.yellow);
                text.setVisible(false);
            }
            }
        });
        
        f.add(text);
        f.add(toogle);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
}
