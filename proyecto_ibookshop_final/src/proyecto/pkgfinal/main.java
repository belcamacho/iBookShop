/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto.pkgfinal;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author belca
 */
public class main {
    
     public static ArrayList<Class_Cliente> registroClientes = new ArrayList<Class_Cliente>();
     public static ArrayList<Class_Libro> registroLibro = new ArrayList<Class_Libro>();
     public static Class_Listas_Libros_Clientes biblioteca = new Class_Listas_Libros_Clientes ();
     public static Class_Venta_Libro ventas = new Class_Venta_Libro();
     public static Class_Alquiler_Libros alquileres = new Class_Alquiler_Libros();
    
    public static void main(String[] args) {
        System.out.println("¡Bienvenido al sistema de librería iBookshoop!");
        Scanner scanner = new Scanner(System.in);
         boolean salir = false;
         while (!salir) {
         try{
            System.out.println("Digite la opción que desea realizar");
            System.out.println("1. Mantenimiento de Clientes");
            System.out.println("2. Mantenimiento de libros");
            System.out.println("3. Alquiler de libros"); 
            System.out.println("4. Venta de libros"); 
            System.out.println("5. Salir");
            System.out.print("Ingrese una opción: ");
            int opcion = scanner.nextInt();
            
            switch(opcion){
                case 1:
                    biblioteca.menuCliente(registroClientes);
                    break;
                case 2:
                    biblioteca.menuLibro(registroLibro);
                    break;
                    
                case 3:
                    alquileres.menu_Alquiler(registroLibro, registroClientes);
                    break;
                case 4:
                    ventas.menu_Venta(registroLibro, registroClientes);
                    break;
                    
                case 5:
                    salir =true;
                default:
                    
            }
            
           
         }catch(Exception e){
                            System.out.println("Ingrese datos correctos");
                        }
    }
}
}
 

         
    
    
            
                        
    
