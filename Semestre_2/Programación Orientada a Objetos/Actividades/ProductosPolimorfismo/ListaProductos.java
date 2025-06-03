public class ListaProductos {
    private static final int MAX = 100;
    private Producto[] productos;
    private int contador;

    public ListaProductos() {
        productos = new Producto[MAX];
        contador = 0;
    }

    public boolean agregarProducto(Producto p) {
        if (contador < MAX) {
            productos[contador++] = p;
            return true;
        }
        return false;
    }

    public boolean eliminarProductoPorNombre(String nombre) {
        for (int i = 0; i < contador; i++) {
            if (productos[i] != null && productos[i].getNombre().equals(nombre)) {
                productos[i] = productos[--contador];
                productos[contador] = null;
                return true;
            }
        }
        return false;
    }

    public Producto buscarProductoPorNombre(String nombre) {
        for (int i = 0; i < contador; i++) {
            if (productos[i] != null && productos[i].getNombre().equals(nombre)) {
                return productos[i];
            }
        }
        return null;
    }

    public void listarPorTipo(Class<?> tipo) {
        for (int i = 0; i < contador; i++) {
            if (productos[i] != null && tipo.isInstance(productos[i])) {
                // if (productos[i] instanceof ProductoFresco)
                Tools.output(productos[i].toString() + " " + productos[i].getDetalles());
            }
        }
    }

    public void listarTodos() {
        for (int i = 0; i < contador; i++) {
            if (productos[i] != null) {
                Tools.output(productos[i].toString() + "\n" + productos[i].getDetalles());
            }
        }
    }
}
