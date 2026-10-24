package Clase11.Tema1Ej2;

public class ListaEstatica {
    private int[] datos;
    private int cantidad;

    public ListaEstatica(int capacidad) {
        this.datos = new int[capacidad];
        this.cantidad = 0;
    }

    public void insertar(int valor) {
        if (cantidad >= datos.length) {
            throw new IllegalStateException("La lista está llena");
        }
        datos[cantidad] = valor;
        cantidad++;
    }

    public void insertarEnPosicion(int indice, int valor) {
        if (cantidad >= datos.length) {
            throw new IllegalStateException("La lista está llena");
        }
        if (indice < 0 || indice > cantidad) {
            throw new IndexOutOfBoundsException(" El indice está fuera de rango");
        }
        for (int i = cantidad - 1; i >= indice; i--) {
            datos[i + 1] = datos[i];
        }
        datos[indice] = valor;
        cantidad++;
    }

    public void eliminarEnPosicion(int indice) {
        if (indice < 0 || indice >= cantidad) {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }
        for (int i = indice; i < cantidad - 1; i++) {
            datos[i] = datos[i + 1];
        }
        cantidad--;
    }

    public int buscar(int valor) {
        for (int i = 0; i < cantidad; i++) {
            if (datos[i] == valor) {
                System.out.println("Valor numero: " + valor + " encontrado en el índice: ");
                return i;
            }
        }
        return -1;
    }

    public void mostrar() {
        for (int i = 0; i < cantidad; i++) {
            System.out.print(datos[i]+ " ");
    }
        System.out.println();
    }

    public static void main(String[] args) {
        ListaEstatica lista = new ListaEstatica(5);

        lista.insertar(5);
        lista.insertar(47);
        lista.insertar(3045);
        lista.insertar(42);

        lista.mostrar();

        System.out.println(lista.buscar(42));
        System.out.println(lista.buscar(4523));
    }
}