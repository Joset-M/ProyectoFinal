/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.Clases;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SistemaConcecionario {

    public Consesionaria concesionaria;

    public SistemaConcecionario() {
        this.concesionaria = new Consesionaria();
        cargarDatos();
    }

    /**
     * Carga los datos de clientes, vendedores y vehículos desde archivos de texto.
     */
    private void cargarDatos() {
        cargarClientes("clientes.txt");
        cargarVendedores("vendedores.txt");
        cargarVehiculos("vehiculos.txt");
    }

    /**
     * Guarda todos los datos actuales de clientes, vendedores y vehículos en sus respectivos archivos.
     */
    public void guardarDatos() {
        guardarClientes("clientes.txt");
        guardarVendedores("vendedores.txt");
        guardarVehiculos("vehiculos.txt");
    }

    // Métodos para cargar datos desde archivos

    private void cargarClientes(String archivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                Cliente cliente = parsearCliente(linea);
                if (cliente != null) {
                    concesionaria.getClientes().add(cliente);
                }
            }
        } catch (IOException e) {
            System.err.println("Error al cargar clientes desde " + archivo + ": " + e.getMessage());
        }
    }

    private Cliente parsearCliente(String linea) {
        Pattern pattern = Pattern.compile("\\[Nombre: (.*?) Cédula: (.*?) Teléfono: (.*?) Edad: (\\d+) Dirección: (.*?) Correo: (.*?) \\]");
        Matcher matcher = pattern.matcher(linea);
        if (matcher.matches()) {
            String nombre = matcher.group(1);
            String cedula = matcher.group(2);
            String telefono = matcher.group(3);
            int edad = Integer.parseInt(matcher.group(4));
            String direccion = matcher.group(5);
            String correo = matcher.group(6);
            return new Cliente(correo, direccion, nombre, cedula, telefono, edad);
        }
        return null;
    }

    private void cargarVendedores(String archivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                Vendedor vendedor = parsearVendedor(linea);
                if (vendedor != null) {
                    concesionaria.getVendedores().add(vendedor);
                }
            }
        } catch (IOException e) {
            System.err.println("Error al cargar vendedores desde " + archivo + ": " + e.getMessage());
        }
    }

    private Vendedor parsearVendedor(String linea) {
        Pattern pattern = Pattern.compile("\\[ID: (\\d+) Nombre:(.*?) Cédula: (.*?) Puesto:(.*?) Teléfono: (.*?) Edad: (\\d+)\\]");
        Matcher matcher = pattern.matcher(linea);
        if (matcher.matches()) {
            // int id = Integer.parseInt(matcher.group(1)); // El ID es estático y auto-incrementa, no se carga desde el archivo de esta manera
            String nombre = matcher.group(2);
            String cedula = matcher.group(3);
            String puesto = matcher.group(4);
            String telefono = matcher.group(5);
            int edad = Integer.parseInt(matcher.group(6));
            return new Vendedor(nombre, cedula, telefono, edad, puesto);
        }
        return null;
    }

    private void cargarVehiculos(String archivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                Vehiculo vehiculo = parsearVehiculo(linea);
                if (vehiculo != null) {
                    concesionaria.getVevhiculos().add(vehiculo);
                }
            }
        } catch (IOException e) {
            System.err.println("Error al cargar vehículos desde " + archivo + ": " + e.getMessage());
        }
    }

    private Vehiculo parsearVehiculo(String linea) {
        Pattern pattern = Pattern.compile("\\[placa:(.*?) modelo:(.*?) marca:(.*?) precio del Alquiler:(.*?) Disponible:(.*?)\\]");
        Matcher matcher = pattern.matcher(linea);
        if (matcher.matches()) {
            String placa = matcher.group(1);
            String modelo = matcher.group(2);
            String marca = matcher.group(3);
            double precioAlquiler = Double.parseDouble(matcher.group(4));
            boolean disponible = Boolean.parseBoolean(matcher.group(5));
            return new Vehiculo(placa, modelo, marca, precioAlquiler, disponible);
        }
        return null;
    }

    // Métodos para agregar elementos

    public void agregarCliente(Cliente cliente) {
        concesionaria.getClientes().add(cliente);
        guardarClientes("clientes.txt");
    }

    public void agregarVendedor(Vendedor vendedor) {
        concesionaria.getVendedores().add(vendedor);
        guardarVendedores("vendedores.txt");
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        concesionaria.getVevhiculos().add(vehiculo);
        guardarVehiculos("vehiculos.txt");
    }

    // Métodos para guardar datos en archivos

    private void guardarClientes(String archivo) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo))) {
            for (Cliente cliente : concesionaria.getClientes()) {
                bw.write(cliente.toString());
                bw.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error al guardar clientes en " + archivo + ": " + e.getMessage());
        }
    }

    private void guardarVendedores(String archivo) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo))) {
            for (Vendedor vendedor : concesionaria.getVendedores()) {
                bw.write(vendedor.toString());
                bw.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error al guardar vendedores en " + archivo + ": " + e.getMessage());
        }
    }

    public void guardarVehiculos(String archivo) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo))) {
            for (Vehiculo vehiculo : concesionaria.getVevhiculos()) {
                bw.write(vehiculo.toString());
                bw.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error al guardar vehículos en " + archivo + ": " + e.getMessage());
        }
    }

    // Métodos para mostrar información

    public void mostrarClientes() {
        System.out.println("--- Clientes ---");
        if (concesionaria.getClientes().isEmpty()) {
            System.out.println("No hay clientes registrados.");
            return;
        }
        for (Cliente cliente : concesionaria.getClientes()) {
            System.out.println(cliente.toString());
        }
    }

    public void mostrarVendedores() {
        System.out.println("--- Vendedores ---");
        if (concesionaria.getVendedores().isEmpty()) {
            System.out.println("No hay vendedores registrados.");
            return;
        }
        for (Vendedor vendedor : concesionaria.getVendedores()) {
            System.out.println(vendedor.toString());
        }
    }

    public void mostrarVehiculos() {
        System.out.println("--- Vehículos ---");
        if (concesionaria.getVevhiculos().isEmpty()) {
            System.out.println("No hay vehículos registrados.");
            return;
        }
        for (Vehiculo vehiculo : concesionaria.getVevhiculos()) {
            System.out.println(vehiculo.toString());
        }
    }
}
