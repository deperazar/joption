/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciski;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Estudiante
 */
public class Ejerciski {

    public static void main(String[] args) {
        
       // JTextField a=new JTextField("Introduce your name");
       
        String name= JOptionPane.showInputDialog(null,"What´s your name?");
        
        int choice= JOptionPane.showConfirmDialog(null, "Do you like cake "+ name+" ?");
        
        
        if(choice==JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, "Of course! Who doesn't");
        }else{
             JOptionPane.showMessageDialog(null, "We'll have to agree to disagree");
        }
        
       
     
    }
    
}
