/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package descomposicion;

import javax.swing.JOptionPane;

/**
 *
 * @author ERIK
 */
public class Des11 {
    public static void main(String[] args) {
        int dc = 0,c=0;
        int x = Integer.parseInt(JOptionPane.showInputDialog("numero: "));
        int cont = x;
        while (cont>0) {            
            dc = cont%10;
            cont/=10;
            c++;
        }
        if (c%2==0) {
            while (x>0) {                
                
            }
        }
    }
}
