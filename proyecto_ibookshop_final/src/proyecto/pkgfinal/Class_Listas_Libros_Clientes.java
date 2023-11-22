/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.pkgfinal;

import java.util.ArrayList;
import java.util.Scanner;


public class Class_Listas_Libros_Clientes {
    Scanner scanner = new Scanner(System.in);
    boolean salir;
    int cont;
  

   public void mostrar_clientes(ArrayList<Class_Cliente> cliente){
        cont = 0;
        for (Class_Cliente clientes : cliente) {
            System.out.println("Cliente: "+ cont + 
                    " Nombre: "+  clientes.get_Nombre_Cliente()+
                    " Telefono: "+ clientes.get_Telefono_Cliente()+
                    " Correo: "+ clientes.get_CorreoElectronico_Cliente());
               cont++;
}
     

    }
    
    public void registrarCliente(ArrayList<Class_Cliente> cliente) {
        Class_Cliente clientes = new Class_Cliente ();
        System.out.println("Ingrese los datos del nuevo cliente: ");
        System.out.println("Ingrese el nombre: ");
        String nombre = scanner.next();
        System.out.println("Ingrese el Teléfono: ");
        String telefono = scanner.next();
        System.out.println("Ingrese el Correo electrónico: ");
        String correoElectronico = scanner.next();
        System.out.println("El cliente se ha registrado correctamente.");
                                
     clientes.set_Nombre_Cliente(nombre);
     clientes.set_Telefono_Cliente(telefono);
     clientes.set_CorreoElectronico_Cliente(correoElectronico);
     
     
     cliente.add(clientes);    
    }
    
    public void modificarCliente(ArrayList<Class_Cliente> cliente) {
          Class_Cliente clientes = new Class_Cliente ();
          System.out.println("Elija el número de cliente que deseas modificar: ");
          mostrar_clientes(cliente);
          int clienteMod = scanner.nextInt();
          cliente.remove(clienteMod);
          
           System.out.println("Ingrese los datos del cliente seleccionado");
           System.out.println("Ingrese el nombre: ");
           String nombre = scanner.next();
           System.out.println("Ingrese el Teléfono: ");
           String telefono = scanner.next();
           System.out.println("Ingrese el Correo electrónico: ");
           String correoElectronico = scanner.next();
           System.out.println("Los datos del cliente se han modificado correctamente.");
                                
     clientes.set_Nombre_Cliente(nombre);
     clientes.set_Telefono_Cliente(telefono);
     clientes.set_CorreoElectronico_Cliente(correoElectronico);
     
          
     cliente.add(clientes); 
          
       
    }
      
    public void eliminarCliente(ArrayList<Class_Cliente> cliente) {
          System.out.println("Elija el numero de cliente que desea eliminar: ");
          mostrar_clientes(cliente);
          int clienteMod = scanner.nextInt();
          cliente.remove(clienteMod);
          System.out.println("El cliente se ha eliminado correctamente.");
     
    } 
         public void op_mostrar_cliente(ArrayList<Class_Cliente> cliente){
          PanelCliente ventana = new PanelCliente();
          ventana.setVisible(true);
          ventana.OPmostrar_clientes(cliente);
      }
         
                 public void op_mostrar_Libros(ArrayList<Class_Libro> libro){
          PanelLibros VentanaLibros = new PanelLibros();
          VentanaLibros.setVisible(true);
          VentanaLibros.OPmostrar_libros(libro);
       
        }
         
      

      
    public void mostrar_Libros(ArrayList<Class_Libro> libro){
        cont = 0;
        for (Class_Libro libros : libro) {
            System.out.println("Libro: "+ cont + 
                    " Titulo: "+  libros.get_Titulo_Libro()+
                    " Autor: "+ libros.get_Autor_Libro()+
                    " Editorial: "+ libros.get_Editorial_Libro()+
                    " Fecha de publicacion: "+ libros.get_Fecha_libro()+
                    " Precio: "+ libros.get_Precio_Libro());
                 cont++;
}
   

    }   
      
    public void registrar_Libro(ArrayList<Class_Libro> libro) {
         Class_Libro libros = new Class_Libro ();
     System.out.println("Ingrese los datos del nuevo libro");
                                System.out.println("Ingrese el Título: ");
                                String titulo = scanner.next();
                                System.out.println("Ingrese el Autor: ");
                                String autor = scanner.next();
                                System.out.println("Ingrese la Editorial: ");
                                String editorial = scanner.next();
                                System.out.println("Ingrese la fecha de publicación: ");
                                String fecha = scanner.next();
                                System.out.println("Ingrese el precio del libro: ");
                                int precio = scanner.nextInt();
                                System.out.println("Ingrese la cantidad del libros: ");
                                int cantidad= scanner.nextInt();
                                System.out.println("El libro se ha registrado correctamente.");
                                
                                
     libros.set_Titulo_Libro(titulo);
     libros.set_Autor_Libro(autor);
     libros.set_Editorial_Libro(editorial);
     libros.set_Fecha_Libro(fecha);
     libros.set_Precio_Libro(precio);
     libros.set_Cantidad_Libro(cantidad);
     
     libro.add(libros);
                             
    } 
      
    public void modificar_Libro(ArrayList<Class_Libro> libro) {
         Class_Libro libros = new Class_Libro ();
          System.out.println("Elija el número de libro que desea modificar: ");
          mostrar_Libros(libro);
          int libroMod = scanner.nextInt();
          libro.remove(libroMod);
            System.out.println("Ingrese los datos del libro modificado");
                                System.out.println("Ingrese el Título: ");
                                String titulo = scanner.next();
                                System.out.println("Ingrese el Autor: ");
                                String autor = scanner.next();
                                System.out.println("Ingrese la Editorial: ");
                                String editorial = scanner.next();
                                System.out.println("Ingrese la fecha de publicación: ");
                                String fecha = scanner.next();
                                System.out.println("Ingrese el precio del libro: ");
                                int precio = scanner.nextInt();
                                System.out.println("Ingrese la cantidad del libros: ");
                                int cantidad= scanner.nextInt();
                                System.out.println("Los datos del libro se han modificado correctamente.");                           
     libros.set_Titulo_Libro(titulo);
     libros.set_Autor_Libro(autor);
     libros.set_Editorial_Libro(editorial);
     libros.set_Fecha_Libro(fecha);
     libros.set_Precio_Libro(precio);
     libros.set_Cantidad_Libro(cantidad);
     
     
     libro.add(libros);
          
          
    }
    
    public void eliminarLibro(ArrayList<Class_Libro> libro) {
          System.out.println("Elija el numero de libro que deseas eliminar: ");
          mostrar_Libros(libro);
          int libroMod = scanner.nextInt();
          libro.remove(libroMod);
          System.out.println("El libro se ha eliminado correctamente.");
       
    }
    

    
    public void menuCliente( ArrayList<Class_Cliente> cliente){
        salir = true;
         while (salir) {
             //se utiliza la excepcion try-catch
                        try{
                        System.out.println("¿Qué acción desea realizar con respecto a mantenimiento de clientes?");
                        System.out.println("1. Registrar cliente");
                        System.out.println("2. Modificar cliente");
                        System.out.println("3. Eliminar cliente");
                        System.out.println("4. Mostrar Clientes");
                        System.out.println("5. Salir");
                        System.out.print("Ingrese una opción: ");
                        int opcion = scanner.nextInt();
                       
                        switch (opcion) {
                            case 1 :
                                 registrarCliente(cliente);
                                break;
                           
                            
                            case 2 :
                                modificarCliente(cliente);
                                break;
                                
                            
                            case 3 :
                                eliminarCliente(cliente);
                                break;
                                   
                            case 4 :
                                op_mostrar_cliente(cliente);
                                break;
                            case 5 :
                                salir = false;
                                break;
                             
                            default:
                                System.out.println("Digite un número válido");
                                break;
    }
                        }catch(Exception e){
                            System.out.println("Ingrese datos correctos");
                        }
    

        }
       
    }
    
    public void menuLibro( ArrayList<Class_Libro> libro){
         salir = true;
         while (salir) {
                        try{
                        System.out.println("¿Qué acción desea realizar con respecto a mantenimiento de libros?");
                        System.out.println("1. Registrar libro");
                        System.out.println("2. Modificar libro");
                        System.out.println("3. Eliminar libro");
                        System.out.println("4. Mostrar Libros");
                        System.out.println("5. Salir");
                        System.out.print("Ingrese una opción: ");
                        int opcion = scanner.nextInt();
                       
                        switch (opcion) {
                            case 1 :
                                 registrar_Libro(libro);
                                break;
                           
                            
                            case 2 :
                                modificar_Libro(libro);
                                break;
                                
                            
                            case 3 :
                                eliminarLibro(libro);
                                break;
                                   
                            case 4 :
                                op_mostrar_Libros(libro);
                                break;
                            case 5 :
                                salir = false;
                                break;
                             
                            default:
                                System.out.println("Digite un número válido");
                                break;
    }
                        }catch(Exception e){
                            System.out.println("Ingrese datos correctos");
                        }
    

        }
        
    }
    
    
}



    
