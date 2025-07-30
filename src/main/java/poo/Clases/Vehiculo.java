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
    private boolean disponible;
    
    //Constructor

    public Vehiculo() {
        this.placa = "";
        this.modelo = "";
        this.marca = "";
        this.precioAlquiler = 80;
        this.disponible = true;
    }
    
    public Vehiculo(String placa, String modelo, String marca, double precioAlquiler, boolean disponible) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.precioAlquiler = precioAlquiler;
        this.disponible = true;
    }

    //Getters
    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public double getPrecioAlquiler() {
        return precioAlquiler;
    }

    public boolean isDisponible() {
        return disponible;
    }
    //Setters
    public void setPrecioAlquiler(double precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }
    
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "[placa:" + placa + " modelo:" + modelo + " marca:" + marca + " precio del Alquiler:" + precioAlquiler + " Disponible:" + disponible+']';
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
