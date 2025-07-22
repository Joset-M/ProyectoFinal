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

    public Cliente() {
        super();
        this.correo = "";
        this.direccion = "";
    }

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
    
    
    @Override
    public String toString() {
        return "Cliente{" + "correo=" + correo + ", direccion=" + direccion + '}';
    }
    
}
