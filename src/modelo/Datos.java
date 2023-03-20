package modelo;

public class Datos {
    private ListaCliente lista;

    public Datos() {
    }

    public Datos(ListaCliente lista) {
        this.lista = lista;
    }

    public ListaCliente getLista() {
        return lista;
    }

    public void setLista(ListaCliente lista) {
        this.lista = lista;
    }
}
