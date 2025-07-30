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
    private String puesto;
    
    //Constructores
    /**
     * Constructor por defecto de la clase Vendedor
     */
    public Vendedor() {
        super();
        this.puesto = "";
        id++;
    }
    /**
     * Constructor con parametros de la clase Vendedor
     * @param nombre
     * @param cedula
     * @param telefono
     * @param edad
     * @param puesto 
     */
    public Vendedor(String nombre, String cedula, String telefono, int edad, String puesto) {
        super(nombre, cedula, telefono, edad);
        this.puesto = puesto;
        id++;
    }
    
    //Getters
    public static int getId() {
        return id;
    }

    public String getPuesto() {
        return puesto;
    }
    
    //Setters
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    //Metodo
    /**
     * Metodo que nos permite mostrar la informacion del vendedor
     * @return 
     */
    @Override
    public String toString() {
        return "[ID: " + id + " Nombre:" + getNombre() + " Cédula: " + getCedula() + " Puesto:" + getPuesto()+" Teléfono: " + getTelefono()
                +" Edad: " + getEdad() + "]";
    }
    
}
