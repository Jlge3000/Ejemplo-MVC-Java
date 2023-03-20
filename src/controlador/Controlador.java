package controlador;

import modelo.Cliente;
import modelo.Datos;
import modelo.ListaCliente;

import java.util.ArrayList;
import java.util.Scanner;

public class Controlador {
    Scanner e = new Scanner(System.in);

    public Cliente cliente = new Cliente();

    public ListaCliente lista = new ListaCliente();

    public Datos datos;

    public Controlador() {
    }

    public void crearCliente() {

        System.out.println("Introduce el nombre: ");
        String nombre = e.nextLine();
        System.out.println("Introduce los apellidos");
        String apellidos = e.nextLine();
        System.out.println("Introduce la edad: ");
        int edad = e.nextInt();
        e.nextLine();
        cliente = new Cliente(nombre, apellidos, edad);
        lista.addCliente(cliente);

    }
    public void mostrarClientes(){
        int i = 0;
        System.out.println("Listado de clientes");
        for (Cliente cliente: lista.getListaClientes()){
            i++;
            System.out.println("Num "+i+" "+cliente);
        }
    }
    public void eliminarCliente(){
        mostrarClientes();
        System.out.println("Elige el número de cliente a eliminar");
        int index = e.nextInt();
        e.nextLine();
        lista.eliminarCliente(index-1);//porque empiezan en 0
        System.out.println("Cliente eliminado!!");
        System.out.println("Nuevo listado Clientes: ");
        mostrarClientes();
    }


}
