
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pia Olivera
 */
public class claseScanner {
    public static void main(String[] args) {
        /*System.out.println("Escribe tu nombre: ");
        Scanner consola = new Scanner (System.in);
        var usuario = consola.nextLine();
        System.out.println("usuario = " + usuario);
        System.out.println("Escribe tu profesion: ");
        var titulo = consola.nextLine();
        System.out.println("Resultado: "+titulo +" "+usuario);
        */
        
        System.out.println("Escribe el nombre del libro: ");
        Scanner consola = new Scanner(System.in);
        var libro = consola.nextLine();
        System.out.println("Escribe el nombre del autor del libro: ");
        var autor =consola.nextLine();
        System.out.println("El libro " +libro +" fue escrito por " +autor);
        
        
    }
}
