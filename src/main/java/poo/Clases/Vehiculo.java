/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.Clases;

/**
 *
 * @author Usuario-Asus
 */
public class Vehiculo implements Alquiler{

    //Atributos
    private String placa;
    private String modelo;
    private String marca;
    private double precioAlquiler;
    
    //Constructor

    public Vehiculo() {
        this.placa = "";
        this.modelo = "";
        this.marca = "";
        this.precioAlquiler = 80;
    }
    
    public Vehiculo(String placa, String modelo, String marca, double precioAlquiler) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.precioAlquiler = precioAlquiler;
    }

    @Override
    public double calcularCosto(int dias) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double kilometrajeMaximo(double km) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double kilometrajeMinimo(double kmMin) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
