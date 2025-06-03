public class CtrlProductos {
    public static void main(String[] args) {
        ListaProductos lista = new ListaProductos();
        String[] opciones = { "Agregar", "Eliminar", "Buscar", "Listar", "Salir" };
        String[] tipos = { "Fresco", "Congelado", "Refrigerado" };
        while (true) {
            String op = Tools.menu("Menú Principal", opciones);
            if (op.equals("Salir"))
                break;
            switch (op) {
                case "Agregar": {
                    String tipo = Tools.menu("Tipo de Producto", tipos);
                    Producto p = null;
                    String nombre = Tools.input("Nombre");
                    String cad = Tools.input("Fecha caducidad");
                    String lote = Tools.input("Número de lote");
                    String env = Tools.input("Fecha envasado");
                    String origen = Tools.input("País origen");
                    if (tipo.equals("Fresco")) {
                        p = new ProductoFresco(nombre, cad, lote, env, origen);
                    } else if (tipo.equals("Congelado")) {
                        float temp = Float.parseFloat(Tools.input("Temp recomendada"));
                        p = new ProductoCongelado(nombre, cad, lote, env, origen, temp);
                    } else if (tipo.equals("Refrigerado")) {
                        float temp = Float.parseFloat(Tools.input("Temp recomendada"));
                        String osa = Tools.input("Código OSA");
                        p = new ProductoRefrigerado(nombre, cad, lote, env, origen, temp, osa);
                    }
                    if (lista.agregarProducto(p)) {
                        Tools.output("Producto agregado correctamente");
                    } else {
                        Tools.output("No hay espacio disponible");
                    }
                    break;
                }
                case "Eliminar": {
                    String nombre = Tools.input("Nombre del producto a eliminar");
                    if (lista.eliminarProductoPorNombre(nombre)) {
                        Tools.output("Producto eliminado");
                    } else {
                        Tools.output("Producto no encontrado");
                    }
                    break;
                }
                case "Buscar": {
                    String nombre = Tools.input("Nombre del producto a buscar");
                    Producto p = lista.buscarProductoPorNombre(nombre);
                    if (p != null) {
                        Tools.output(p.toString() + "\n" + p.getDetalles());
                    } else {
                        Tools.output("Producto no encontrado");
                    }
                    break;
                }
                case "Listar": {
                    String tipo = Tools.menu("Tipo de Producto", new String[] { "Todos", "Frescos",
                            "Congelados", "Refrigerados" });
                    if (tipo.equals("Todos")) {
                        lista.listarTodos();
                    } else if (tipo.equals("Frescos")) {
                        lista.listarPorTipo(ProductoFresco.class);
                    } else if (tipo.equals("Congelados")) {
                        lista.listarPorTipo(ProductoCongelado.class);
                    } else if (tipo.equals("Refrigerados")) {
                        lista.listarPorTipo(ProductoRefrigerado.class);
                    }
                    break;
                }
            }
        }
        Tools.output("Programa finalizado");
    }
}
