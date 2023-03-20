package vista;

import controlador.Controlador;

import java.util.Scanner;

public class Vista {
Scanner e = new Scanner(System.in);
    public Vista(){

    }

    public void inicio(){
        Controlador control = new Controlador();

        int opcio;
        boolean salir = false;
        do{
            System.out.println("Introduce una opción");
            System.out.println("-1 Crear Cliente: ");
            System.out.println("-2 Listar Clientes");
            System.out.println("-3 Eliminar Clientes: ");
            System.out.println("-0 Salir");
            opcio = pedirOpcion();
            switch (opcio){
                case '1':
                    control.crearCliente();
                    System.out.println("Cliente creado!!");
                    break;
                case '2':
                    control.mostrarClientes();
                    break;
                case '3':
                    control.eliminarCliente();
                    break;
                case '0':
                    System.out.println("Salir de la aplicacion ");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }

        }while (!salir);



    }

    public char pedirOpcion() {
        String resp;
        System.out.println("Elige una opción (1,2,3 o 0): ");
        resp = e.nextLine();
        if (resp.isEmpty()) {
            resp = " ";
        }
        return resp.charAt(0);
    }
}
