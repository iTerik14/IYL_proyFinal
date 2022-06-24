/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab04;

/**
 *
 * @author Pc27
 */
public class Coche {

    String color;
    String marca;
    int km;

    public Coche(String color, String marca, int km) {
        this.color = color;
        this.marca = marca;
        this.km = km;
    }

    public String getColor() {
        return color;
    }

    public String getMarca() {
        return marca;
    }

    public int getKm() {
        return km;
    }
}
