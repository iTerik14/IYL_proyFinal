/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema01;

/**
 *
 * @author ERIK
 */
public class MainPersona {
    public static void main(String[] args) {
        Persona p = new Persona("Juan", "Perez", "123456", 30);
        System.out.println(
                "Datos de la persona: "
                +"\nNombre: "+p.getNombre()
                +"\nApellido: "+p.getApellido()
                +"\nEdad: "+p.getEdad()
                +"\nCI: "+p.getCi()
        );
        
        Estudiante e = new Estudiante(123, 59.9, "Rodrigo", "Apaza", "985547", 19);
        e.mostrarDatos();
    }
}
