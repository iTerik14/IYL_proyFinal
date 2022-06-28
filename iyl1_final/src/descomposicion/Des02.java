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
        int x = 0, d = 0, p = 0, h = 0;
        do {
            x = Integer.parseInt(JOptionPane.showInputDialog("numero: "));
        } while (x <= 100);
        System.out.println(x);

        while (x > 0) {
            d = x % 10;
            x /= 10;
            if (buscarRep(x, d) != -1) {
                System.out.print(" " + buscarRep(x, d));
            }
        }
    }

    public static int buscarRep(int p, int d) {
        int d1 = 0, c = 1;
        while (p > 0) {
            d1 = p % 10;
            p /= 10;
            if (d == d1) {
                c++;
            }
        }
        if (c >= 2 && c < 3) {
            return d;
        }
        return -1;
    }
}
