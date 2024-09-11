package zona_fit.presentacion;

import org.w3c.dom.ls.LSOutput;
import zona_fit.datos.ClienteDAO;
import zona_fit.datos.IClienteDAO;
import zona_fit.zona_fit_dominio.Cliente;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ZonaFitApp {
    public static void main(String[] args) {
        zonaFitApp();

    }
    private static void zonaFitApp(){
        var salir = false;
        var consola = new Scanner(System.in);
        //Creamos un objeto de la clase ClienteDAO
         IClienteDAO clienteDAO = new ClienteDAO();
        while(!salir){
            try{
                var opcion= mostrarMenu(consola);
               salir =ejecutarOpciones(consola,opcion, clienteDAO);
            }catch (Exception e){
                System.out.println("Error al ejecutar opciones: "+e.getMessage());
            }
            System.out.println();
        }
    }
    private static int mostrarMenu(Scanner consola){
        System.out.print("""
                *** Zona Fit (GYM)
                1. Listar Clientes
                2. Buscar Cliente
                3. Agregar Cliente
                4. Modificar Cliente
                5. Eliminar Cliente
                6. Salir
                Elije una opcion:\s""");
        return Integer.parseInt(consola.nextLine());

    }

    private static boolean ejecutarOpciones(Scanner consola, int opcion,
                                            IClienteDAO clienteDAO){
        var salir = false;
        switch (opcion){
            case 1 -> { //Listar clientes
                System.out.println("--- Listado de Clientes ---");
                var clientes = clienteDAO.listarClientes();
                clientes.forEach(System.out::println);
            }
            case 2 ->{//Buscar cliente
                System.out.println("Introduce el ID del cliente a buscar: ");
                var idCliente = Integer.parseInt(consola.nextLine());
                var cliente = new Cliente(idCliente);
                var encontrado = clienteDAO.buscarClientePorId(cliente);
                if (encontrado)
                    System.out.println("Cliente encontrado: "+cliente);
                else
                    System.out.println("Cliente no encontrado: "+cliente);
                 }
            case 3 ->{ //Agregar cliente
                System.out.println("--- Agregar Cliente ---");
                System.out.println("Nombre: ");
                var nombre = consola.nextLine();
                System.out.println("Apellido: ");
                var apellido = consola.nextLine();
                System.out.println("Membresia: ");
                var membresia = Integer.parseInt(consola.nextLine());
                //Creamos el objeto cliente
                var cliente = new Cliente(nombre, apellido, membresia);
                var agregado = clienteDAO.agregarCliente(cliente);
                if (agregado)
                    System.out.println("Cliente agregado: "+cliente);
                else
                    System.out.println("No se agrego el cliente: "+cliente);
                 }
            case 4 -> { //Modificar cliente
                System.out.println("--- Modificar Cliente ---");
                System.out.println("Id Cliente: ");
                var idCliente = Integer.parseInt(consola.nextLine());
                System.out.println("Nombre: ");
                var nombre = consola.nextLine();
                System.out.println("Apellido: ");
                var apellido = consola.nextLine();
                System.out.println("Membresia: ");
                var membresia = Integer.parseInt(consola.nextLine());
                var cliente = new Cliente(idCliente, nombre, apellido, membresia);
                var modificado = clienteDAO.modificarCliente(cliente);
                if (modificado)
                    System.out.println("Cliente modificado: "+cliente);
                else
                    System.out.println("Cliente NO modificado");
               }
            case 5 -> { //Eliminar cliente
                System.out.println("--- Eliminar Cliente ---");
                System.out.println("Ingrese el id del cliente a eliminar: ");
                var idCliente = Integer.parseInt(consola.nextLine());
                var cliente = new Cliente(idCliente);
                var eliminado = clienteDAO.eliminarCliente(cliente);
                if (eliminado)
                    System.out.println("Cliente eliminado EXITOSAMENTE: "+ cliente);
                else
                    System.out.println("Error al eminar el cliente: "+cliente);
            }
            case 6 -> { //Salir
                System.out.println("Hasta pronto !");
                salir =true;
            }
            default -> System.out.println("Opcion no reconocida: "+opcion);

            }




        return salir;
    }
}
