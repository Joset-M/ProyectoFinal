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

    public Consesionaria(ArrayList<Cliente> clientes, ArrayList<Vendedor> vendedores, ArrayList<Vehiculo> vehiculos ){
        this.clientes = clientes;
        this.vendedores = vendedores;
        this.vevhiculos = vehiculos;
    }
    
    
}
