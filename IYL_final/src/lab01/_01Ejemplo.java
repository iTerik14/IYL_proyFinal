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
public class _01Ejemplo {

    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("ingrese otro numero"));
        //int n3 = Integer.parseInt(JOptionPane.showInputDialog("ingrese otro numero"));
        int suma = n1 + n2;
        JOptionPane.showConfirmDialog(null, "Confirma si es " + suma);
        JOptionPane.showMessageDialog(null, "la suma es " + suma);

        if (n1 > n2) {
            JOptionPane.showMessageDialog(null, "El mayor es " + n1);
        } else {
            if(n1==n2){
                JOptionPane.showMessageDialog(null, "Son iguales ");
            }else{
                JOptionPane.showMessageDialog(null, "El mayor es " + n2);
            }
        }
    }
}
