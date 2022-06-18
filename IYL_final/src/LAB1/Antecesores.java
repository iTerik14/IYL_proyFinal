/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB1;

import javax.swing.JOptionPane;

/**
 *
 * @author Pc25
 */
public class Antecesores {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("ponga un numero"));
        int a=0;
        for(int i=1; i<n; i++){
            if(i % 2 == 0){
                a=a+i;
            }
        }
        JOptionPane.showMessageDialog(null," "+a);
    }
}
