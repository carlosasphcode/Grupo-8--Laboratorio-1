/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.producto;

/**
 *
 * @author carlo
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Instancia por defecto
        try (Scanner scanner = new Scanner(System.in)) {
            // Instancia por defecto
            Producto productoDemo = new Producto("Pollo a la Brasa Con papas", 65.50);
            
            int opcion = 0;
            do {
                System.out.println("\n========== GESTIÓN DE PEDIDOS ==========");
                System.out.println("1. Mostrar detalles del producto");
                System.out.println("2. Registrar un nuevo producto");
                System.out.println("3. Salir");
                System.out.print("Seleccione una opción: ");
                
                if (scanner.hasNextInt()) {
                    opcion = scanner.nextInt();
                    scanner.nextLine(); // Limpiar búfer
                } else {
                    System.out.println("Entrada inválida. Ingrese un número.");
                    scanner.nextLine();
                    continue;
                }
                
                switch (opcion) {
                    case 1 -> {
                        System.out.println("\n--- Detalle del Producto ---");
                        productoDemo.mostrarDetalles();
                    }
                    case 2 -> {
                        System.out.print("Ingrese el nombre del producto: ");
                        String nombre = scanner.nextLine();
                        System.out.print("Ingrese el precio del producto: ");
                        double precio = scanner.nextDouble();
                        scanner.nextLine();
                        
                        productoDemo = new Producto(nombre, precio);
                        System.out.println("¡Producto registrado con éxito!");
                    }
                    case 3 -> System.out.println("Saliendo del sistema...");
                    default -> System.out.println("Opción no válida. Intente nuevamente.");
                }
            } while (opcion != 3);
        }
    }
}