/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.Clases;

import java.util.ArrayList;

/**
 *
 * @author Usuario-Asus
 */
public class Consesionaria {
    //Atributos
    private ArrayList<Cliente> clientes = new ArrayList<>();
    private ArrayList<Vendedor> vendedores = new ArrayList<>();
    private ArrayList<Vehiculo> vevhiculos = new ArrayList<>();
    
    //Constructores
    public Consesionaria() {
    } 
    /**
     * Constructor con parametros de la clase Consesionaria.
     * @param clientes
     * @param vendedores
     * @param vehiculos 
     */
    public Consesionaria(ArrayList<Cliente> clientes, ArrayList<Vendedor> vendedores, ArrayList<Vehiculo> vehiculos ){
        this.clientes = clientes;
        this.vendedores = vendedores;
        this.vevhiculos = vehiculos;
    }
    
    //Getters
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public ArrayList<Vendedor> getVendedores() {
        return vendedores;
    }

    public ArrayList<Vehiculo> getVevhiculos() {
        return vevhiculos;
    }
    
    //Setters

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public void setVendedores(ArrayList<Vendedor> vendedores) {
        this.vendedores = vendedores;
    }

    public void setVevhiculos(ArrayList<Vehiculo> vevhiculos) {
        this.vevhiculos = vevhiculos;
    }
    
    //Metodo

    @Override
    public String toString() {
        return "Consesionaria{" + "clientes=" + clientes + ", vendedores=" + vendedores + ", vevhiculos=" + vevhiculos + '}';
    }
    
}
