package modelo;

import java.util.ArrayList;

public class ListaCliente {
    ArrayList<Cliente> clientes = new ArrayList<>();

    public ListaCliente() {
    }

    public ListaCliente(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }


    public void addCliente(Cliente cliente){
        clientes.add(cliente);
    }
    public ArrayList<Cliente> getListaClientes(){
        return clientes;
    }
    public void eliminarCliente(int index){
        clientes.remove(index);
    }
}
