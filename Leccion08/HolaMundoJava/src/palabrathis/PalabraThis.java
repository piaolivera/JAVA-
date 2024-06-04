package palabrathis;

/**
 *
 * @author Pia Olivera
 */
public class PalabraThis {
    public static void main(String[] args) {
        Persona persona = new Persona("Juan", "Perez");
        System.out.println("persona = " + persona); //direccion de memoria del objeto
        System.out.println("Persona nombre: "+persona.nombre);
        System.out.println("Persona apellido: "+persona.apellido);
    }
}


class Persona{
    String nombre;
    String apellido;
    
    Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("Nombre completo: "+this.nombre +" "+this.apellido);
        new Imprimir().imprimir(this);
    }
}

class Imprimir{
    public void imprimir(Persona persona){
        System.out.println("Persona dede imprimir: " +persona);
        System.out.println("Impresion del objeto actual (this): "+this);
    }
}