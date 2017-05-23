/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciski;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Estudiante
 */
public class MessageListener implements ActionListener{
    private JTextField x;
    
    public  MessageListener(JTextField g){
        this.x=g;
       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "X: "+x.getText());
        
    }
    
}
