package ar.com.biblioteca;
/* @author Pia Olivera
 */
public class Libro {
    private int idLibro;
    private String titulo;
    private String autor;
    private double precio;
    private static int contadorLibro;
    
    public Libro(){
        this.idLibro = ++Libro.contadorLibro;
    }
    public Libro(String titulo, String autor, double precio){
        this();
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }

    public int getIdLibro() {
        return this.idLibro;
    }
    
    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Libro{" + "idLibro=" + idLibro + ", titulo=" + titulo + ", autor=" + autor + ", precio=" + precio + '}';
    }
    
    
}
