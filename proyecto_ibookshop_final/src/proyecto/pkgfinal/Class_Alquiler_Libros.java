/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

    package proyecto.pkgfinal;

import java.util.ArrayList;
import java.util.Scanner;


public class Class_Alquiler_Libros extends Class_Libro {
        Scanner scanner = new Scanner(System.in);
    boolean salir;
    int cliente_Venta;
    int libro_Venta;
         public static Class_Listas_Libros_Clientes biblioteca = new Class_Listas_Libros_Clientes ();
         
    
    public Class_Alquiler_Libros() {
    } 

    public Class_Alquiler_Libros(int cliente_Venta, int libro_Venta) {
        this.cliente_Venta = cliente_Venta;
        this.libro_Venta = libro_Venta;
    }

    
    public void menu_Alquiler(ArrayList<Class_Libro> libro, ArrayList<Class_Cliente> cliente){  
        salir = true;
         while (salir) {
           
            
            System.out.println("""
                               Bienvenido al menu de Alquiler de libros 
                               Desea registrar un Alquiler? 1/Si 2/No""");
                int opcion = scanner.nextInt();
            
            if (opcion == 1){
                System.out.println("Elija el cliente con su respectivo número");
                biblioteca.mostrar_clientes(cliente);
                this.cliente_Venta = scanner.nextInt();
                System.out.println("Elije el libro con su respectivo número que desea alquilar");
                biblioteca.mostrar_Libros(libro);
                this.libro_Venta = scanner.nextInt();
                facturacion(libro);
            }else if (opcion == 2){
                System.out.println("Gracias por estar en el menú alquiler");
                salir = false;
                
            }
           
         }
        
    }
    
    
    public void facturacion(ArrayList<Class_Libro> libro){
        Class_Libro libros = new Class_Libro();
        System.out.println("Gracias por alquilar un libro, el precio total es de" + libros.get_Precio_Libro());
    }
    
    
}

    
