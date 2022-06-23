/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01;

import javax.swing.JOptionPane;

/**
 *
 * @author Pc25
 */
public class Perfecto {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("ponga un numero"));
        int a=n;
        int s=0;
        for(int i=1;i<n;i++){
            if(n % i == 0){
                s=s+i;
            }
        }
        if(s==a){
            JOptionPane.showMessageDialog(null, "Es numero perfecto");
        }else{
            JOptionPane.showMessageDialog(null, "No es numero perfecto");
        }
    }
}
