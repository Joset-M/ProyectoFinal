/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.Clases;

/**
 *
 * @author Usuario-Asus
 */
public class Cliente extends Persona {
    //Atributos
    private String correo;
    private String direccion;
    
    //Constructores
    /**
     * Constructor por defecto de la clase Cliente.
     */
    public Cliente() {
        super();
        this.correo = "";
        this.direccion = "";
    }
    /**
     * Constructor con parametros de la clase Cliente.
     * @param correo
     * @param direccion
     * @param nombre
     * @param cedula
     * @param telefono
     * @param edad 
     */
    public Cliente(String correo, String direccion, String nombre, String cedula, String telefono, int edad) {
        super(nombre, cedula, telefono, edad);
        this.correo = correo;
        this.direccion = direccion;
    }
    
    //Getters

    public String getCorreo() {
        return correo;
    }

    public String getDireccion() {
        return direccion;
    }
    
    //Setters

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    //Metodo
    /**
     * Metodo que nos permite mostrar la informacion del Cliente.
     * @return 
     */
    @Override
    public String toString() {
        return "[Nombre: " + getNombre() + " Cédula: " + getCedula() + " Teléfono: " + getTelefono()
               +" Edad: " + getEdad() + " Dirección: " + getDireccion() + " Correo: " + getCorreo()+ " ]";
    }
    
}
