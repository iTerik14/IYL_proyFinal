/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema01;

public class Estudiante extends Persona {

    private int codigoEstudiante;
    private double notaFinal;

    public Estudiante(int codigoEstudiante, double notaFinal, String nombre, String apellido, String ci, int edad) {
        super(nombre, apellido, ci, edad);
        this.codigoEstudiante = codigoEstudiante;
        this.notaFinal = notaFinal;
    }

    public int getCodigoEstudiante() {
        return codigoEstudiante;
    }

    public void setCodigoEstudiante(int codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    public void mostrarDatos() {
        System.out.print(
                "Datos del estudiante: "
                + "\nNombre: " + getNombre()
                + "\nApellido: " + getApellido()
                + "\nCI: " + getCi()
                + "\nCodigo Estudiandte: " + codigoEstudiante
                + "\nNotaFinal: " + notaFinal + "\n"
        );
    }
}
