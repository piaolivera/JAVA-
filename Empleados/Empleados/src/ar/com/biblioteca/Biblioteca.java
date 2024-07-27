package ar.com.biblioteca;

import ar.com.biblioteca.*;
/*@author Pia Olivera*/
public class Biblioteca {
    private int idBiblioteca;
    private String nombre;
    private String direccion;
    private Libro libros[];
    private static int contadorBiblioteca;
    private int contadorLibros;
    private static final int MAX_LIBROS =10;
    
    public Biblioteca(){
        this.idBiblioteca = ++Biblioteca.contadorBiblioteca;
        this.libros = new Libro[Biblioteca.MAX_LIBROS];
    }
    public Biblioteca (String nombre, String direccion){
        this();
        this.nombre = nombre;
        this.direccion = direccion;
    }
    
    public void agregarLibro(Libro libro){
        if(contadorLibros< Biblioteca.MAX_LIBROS){
            this.libros[this.contadorLibros++] =libro;
        }
        else{
            System.out.println("Ha superado el maximo de productos");
        }
    }
    public double calcularTotalValor(){
        double total =0;
        for (int i = 0; i < this.contadorLibros; i++) {
            total += libros[i].getPrecio();
        }
        return total;
    }
    public void mostrarBiblioteca(){
        System.out.println("Id libro: "+this.idBiblioteca);
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Direccion: "+this.direccion);
        double total = calcularTotalValor();
        System.out.println("El total es : $"+total);
        System.out.println("Libros de la biblioteca: ");
         for (int i = 0; i < this.contadorLibros; i++) {
            System.out.println(this.libros[i]);
    }
}
}    
