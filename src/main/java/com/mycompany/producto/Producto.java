/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.producto;

/**
 *
 * @author carlo
 */
public class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void mostrarDetalles() {
        System.out.println("--------------------------------");
        System.out.println("Producto: " + nombre);
        System.out.printf("Precio: S/ %.2f%n", precio);
        System.out.println("--------------------------------");
    }
}"// Cambio de prueba para Pull Request" 
