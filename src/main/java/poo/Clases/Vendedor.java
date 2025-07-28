/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.Clases;

/**
 *
 * @author Usuario-Asus
 */
public class Vendedor extends Persona{
    //Atributos
    private static int id;
    
    //Constructores

    public Vendedor() {
        super();
        id++;
    }

    public Vendedor(String nombre, String cedula, String telefono, int edad) {
        super(nombre, cedula, telefono, edad);
        id++;
    }
    
    //Getters
    public static int getId() {
        return id;
    }
    
    //Metodo
    /**
     * Metodo que nos permite mostrar la informacion del vendedor
     * @return 
     */
    @Override
    public String toString() {
        return "Vendedor{" + '}';
    }
    
}
