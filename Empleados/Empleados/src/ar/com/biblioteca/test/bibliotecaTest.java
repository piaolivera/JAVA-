package ar.com.biblioteca.test;

import ar.com.biblioteca.*;

/**
 * @author Pia Olivera
 */
public class bibliotecaTest {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Caos", "Magali Tajes",5000);
        Libro libro2 = new Libro ("Intensamente", "Gabriel Rolon", 5999);
        
        Biblioteca biblioteca1 = new Biblioteca("Biblioteca central", "Estrada111");
        
        biblioteca1.agregarLibro(libro1);
        biblioteca1.agregarLibro(libro2);
        biblioteca1.calcularTotalValor();
        biblioteca1.mostrarBiblioteca();
        
        
       
    }
}
