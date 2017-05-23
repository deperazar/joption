/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciski;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Estudiante
 */
public class Dimak {
    public static void main(String[] args){
        JFrame frame=new JFrame();
        
        Image icon= Toolkit.getDefaultToolkit().getImage("Bullet_1.gif");
        frame.setIconImage(icon);
        JPanel panel= (JPanel) frame.getContentPane();
        panel.setBackground(Color.WHITE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(800,100));
        
        Dimension dim= Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width/2-frame.getSize().width/2,dim.height/2-frame.getSize().height/2);
        frame.setTitle("VENTANA");
        
        
        JButton button1=new JButton();
        button1.setText("I'm a button");
        button1.setBackground(Color.blue);
        
        
        JButton button2=new JButton();
        button2.setText("I'm a button too");
        button2.setBackground(Color.red);
        
        
        frame.setLayout(new BorderLayout());
        JLabel label=new JLabel("HELLO SON, PLEASE TYPE YOUR ID");
        JTextField field= new JTextField(5);
        frame.add(button1,BorderLayout.WEST);
        frame.add(button2,BorderLayout.EAST);
        frame.add(label,BorderLayout.NORTH);
        frame.add(field,BorderLayout.SOUTH);
        
        System.out.println("TEXT: "+field.getText() );
        button1.addActionListener(new MessageListener(field));
        frame.setVisible(true);
                
    }
    
}
