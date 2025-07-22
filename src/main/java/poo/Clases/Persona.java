/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.Clases;

import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario-Asus
 */
public class Persona {
    //Atributos
    private String nombre;
    private String cedula;
    private String telefono;
    private int edad;
    
    //Constructores

    /**
     * Constructor por defecto, el cual nos permite asignar
     * valores predeterminados
     */
    public Persona() {
        this.nombre = "";
        this.cedula = "";
        this.edad = 18;
        this.telefono = "";
    }

    /**
     * Constrcutor con Parametros, el cual asgina los parametros pasados
     * como valores definidos
     * @param nombre -> tipo String que corresponde al nombre del usuario
     * @param cedula -> tipo String, que corresponde a la cédula (Ecuatoriana) del usuario
     * @param edad  -> tipo int, corresponde a la edad en años del usuario
     * @param telefono -> tipo String, correspondiente al numero telefonico del usuario
     */
    public Persona(String nombre, String cedula, String telefono, int edad) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.edad = edad;
    }
   
    //Getters
    /**
     * Nos permite obtner el nombre del usuario
     * @return  -> un String, correspondiente al nombre del usuario
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Nos permite obtner la cédula del usuario
     * @return -> un String, correspondiente a la cédula del usuario
     */
    public String getCedula() {
        return cedula;
    }
    /**
     * Nos permite obtener el telefono del usuario
     * @return .-> un String, correspondiente al telefono de usuario
     */
    public String getTelefono() {
        return telefono;
    }
    /**
     * Nos permite obtener la edad del usuario
     * @return ->in int, correspondiente a la edad del usuario
     */
    public int getEdad() {
        return edad;
    }
    
    //Setters 
    /**
    Nos permite modificar el nombre del usuario.
    * @param nombre
    */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
    Nos permite modificar la cédula del usuario.
    * @param cedula
    */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    /**
     * Nos permite modificar el telefeno
     * @param telefono 
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    /**
    Nos permite modificar la edad del usuario.
    * @param edad
    */
    public void setEdad(int edad) {
        if(edad >= 0){
            this.edad = edad;
        }else{
            JOptionPane.showMessageDialog(null, "Error");
        }
    }
    
    //Metodo

    /*
    Este metodo nos permite mostrar la informacion de cada persona.
    */
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", cedula=" + cedula + ", edad=" + edad + '}';
    }

}
