/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.pkgfinal;

/**
 *
 * @author belca
 */
public class Class_Libro {
    private String titulo;
    private String autor;
    private String editorial;
    private String fecha;
    private int precio;
    private int cantidad;

    public Class_Libro() {
    }
    
    public Class_Libro (String titulo, String autor, String editorial, String fecha, int precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.fecha = fecha;
        this.precio = precio;
        
    }

    public int get_Precio_Libro() {
        return precio;
    }

    public void set_Precio_Libro(int precio) {
        this.precio = precio;
    }
    
    
    public String get_Titulo_Libro() {
        return titulo;
    }
    
    public void set_Titulo_Libro(String titulo) {
        this.titulo = titulo;
    }
    
    public String get_Autor_Libro() {
        return autor;
    }
    
    public void set_Autor_Libro(String autor) {
        this.autor = autor;
    }
    
    public String get_Editorial_Libro() {
        return editorial;
    }
    
    public void set_Editorial_Libro(String editorial) {
        this.editorial = editorial;
    }
    
    public String get_Fecha_libro() {
        return fecha;
    }
    
    public void set_Fecha_Libro(String anioPublicacion) {
        this.fecha = anioPublicacion;
    }
    public int get_Cantidad_Libro() {
        return cantidad;
    }

    public void set_Cantidad_Libro(int cantidad) {
        this.cantidad = cantidad;
    }
}
    
    
