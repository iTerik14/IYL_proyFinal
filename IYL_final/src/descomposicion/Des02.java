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
public class Des02 {
    // numero mayor a 100

    public static void main(String[] args) {
        int x = 0, d = 0, d1 = 0, c = 0, p;
        do {
            x = Integer.parseInt(JOptionPane.showInputDialog("numero: "));
        } while (x <= 100);
        System.out.println(x);

        while (x > 0) {
            d = x % 10;
            x /= 10;
            p = x;
            System.out.print("->" + d);
            System.out.println("");
            while (p > 0) {
                d1 = p % 10;
                p /= 10;
                System.out.print(" " + d1);
                System.out.println("");
                if (d == d1) {
                    c++;
                }
                
            }
            if (c > 1) {
                System.out.print(" ");
            }
        }
    }
}
