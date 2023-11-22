/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.pkgfinal;

import java.util.ArrayList;
import java.util.Scanner;


public class Class_Venta_Libro extends Class_Libro {
    Scanner scanner = new Scanner(System.in);
    boolean salir;
    int cliente_Venta;
    int libro_Venta;
         public static Class_Listas_Libros_Clientes biblioteca = new Class_Listas_Libros_Clientes ();
         
         
    public Class_Venta_Libro() {
    }
    //contructor 
    public Class_Venta_Libro(int cliente_Venta, int libro_Venta) {
        this.cliente_Venta = cliente_Venta;
        this.libro_Venta = libro_Venta;
    }
         
    
    
    public void menu_Venta(ArrayList<Class_Libro> libro, ArrayList<Class_Cliente> cliente){  
        salir = true;
         while (salir) {
           
            
            System.out.println("""
                               Bienvenido al menu de Ventas de libros 
                               Deseas registrar una venta? 1/Si 2/No""");
                int opcion = scanner.nextInt();
            
            if (opcion == 1){
                System.out.println("Elije el cliente con su respectivo numero");
                biblioteca.mostrar_clientes(cliente);
                this.cliente_Venta = scanner.nextInt();
                System.out.println("Elije el libro con su respectivo numero que deseas vender");
                biblioteca.mostrar_Libros(libro);
                this.libro_Venta = scanner.nextInt();
                System.out.println("Gracias por su compra");
                facturacion(libro);
            }else if (opcion == 2){
                System.out.println("Gracias por estar en menu de Ventas");
                salir = false;
                
            }
           
         }
        
    }
    
    public void facturacion(ArrayList<Class_Libro> libro){
        Class_Libro librov = new Class_Libro();
        System.out.println("Gracias por su compra, el total es de: " + librov.get_Precio_Libro());
    }
    
    
}

