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
public class Romanos {

    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        switch (n) {
            case 1:
                JOptionPane.showMessageDialog(null,n+" = I");
                break;
            case 2:
                JOptionPane.showMessageDialog(null,n+" = II");
                break;
            case 3:
                JOptionPane.showMessageDialog(null,n+" = III");
                break;
            case 4:
                JOptionPane.showMessageDialog(null,n+" = IV");
                break;
            case 5:
                JOptionPane.showMessageDialog(null,n+" = V");
                break;
            case 6:
                JOptionPane.showMessageDialog(null,n+" = VI");
                break;
            case 7:
                JOptionPane.showMessageDialog(null,n+" = VII");
                break;
            case 8:
                JOptionPane.showMessageDialog(null,n+" = VIII");
                break;
            case 9:
                JOptionPane.showMessageDialog(null,n+" = IX");
                break;
            case 10:
                JOptionPane.showMessageDialog(null,n+" = X");
                break;
            default:
                JOptionPane.showMessageDialog(null,"No esta en ese rango");
        }
    }
}
