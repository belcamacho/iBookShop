/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.pkgfinal;


public class Class_Cliente {
    private String nombre;
    private String telefono;
    private String correoElectronico;

    public Class_Cliente() {
    }
   
    public Class_Cliente (String nombre, String telefono, String correoElectronico) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
    }
    public String get_Nombre_Cliente() {
        return nombre;
    }
    
    public void set_Nombre_Cliente(String nombre) {
        this.nombre = nombre;
    }
   
    
    public String get_Telefono_Cliente() {
        return telefono;
    }
    
    public void set_Telefono_Cliente(String telefono) {
        this.telefono = telefono;
    }
    
    public String get_CorreoElectronico_Cliente() {
        return correoElectronico;
    }
    
    public void set_CorreoElectronico_Cliente(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    
  
    
} 
    
