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
 *      int p = 1;
 *       for (int i = 1; i <= 10; i++) {
 *           for (int j = 1; j <= 10; j++) {
 *               p = j * i;
 *               System.out.println(+i+ " x " +j+ " = " +p);
 *           }
 *           System.out.println(" ");
 *       }
 * 
 */
public class Multi {

    public static void main(String[] args) {
        int p=1;
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        for (int i = 1; i <= 10; i++) {
            p=n*i;
            System.out.println(+i+ " x " +n+ " = " +p);
        }
    }
}

