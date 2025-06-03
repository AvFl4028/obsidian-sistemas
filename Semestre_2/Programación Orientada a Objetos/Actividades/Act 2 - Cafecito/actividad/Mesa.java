package actividad;

import javax.swing.JOptionPane;

public class Mesa {
    private final int MAX_PEDIDOS = 5;

    private Pedidos[] pedidos = new Pedidos[MAX_PEDIDOS];

    public void menu(String mesa_nombre) {
        String[] opciones = { "Añadir pedido", "Cerrar Pedidos", "Editar Pedidos", "Eliminar Pedido", "Salir" };
        boolean salir = false;

        while (!salir) {
            int opcion = JOptionPane.showOptionDialog(null, mesa_nombre, mesa_nombre, 0,
                    JOptionPane.INFORMATION_MESSAGE, null,
                    opciones, 0);
            switch (opcion) {
                case 0:
                    this.darAltaPedido();
                    break;
                case 1:
                    this.listarPedidos();
                    break;

                case 2:
                    this.editarPedidos();
                    break;

                case 3:
                    this.eliminarPedido();
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    break;
            }
        }
    }

    private void darAltaPedido() {
        for (int i = 0; i < MAX_PEDIDOS; i++)
            if (pedidos[i] == null) {
                pedidos[i] = new Pedidos();
                System.out.println(pedidos[i].cuenta());
                break;
            }
    }

    private void listarPedidos() {
        String todosLosPedidos = obtenerPedidosCuenta();
        System.out.println(todosLosPedidos);
        if (todosLosPedidos == "")
            JOptionPane.showMessageDialog(null, "No hay pedidos disponibles", "Todos los pedidos",
                    JOptionPane.DEFAULT_OPTION);
        else
            JOptionPane.showMessageDialog(null, todosLosPedidos, "Todos los pedidos", JOptionPane.DEFAULT_OPTION);
    }

    private String obtenerPedidosCuenta() {
        String pedidosCuentas = "";
        for (int i = 0; i < MAX_PEDIDOS; i++) {
            if (pedidos[i] != null)
                pedidosCuentas += pedidos[i].cuenta() + "\n";
        }
        System.out.println(pedidosCuentas);
        return pedidosCuentas;
    }

    private void eliminarPedido() {
        int[] pedidosDisponibles = this.obtenerPedidosDisponibles();
        String opcionesPedidos[] = new String[pedidosDisponibles.length];
        if (pedidosDisponibles.length == 0) {
            JOptionPane.showMessageDialog(null, "No hay pedidos disponibles");
            return;
        }
        for (int i = 0; i < pedidosDisponibles.length; i++) {
            opcionesPedidos[i] = "Pedido Mesa: " + pedidosDisponibles[i] + "\n";
        }
        int opcion = JOptionPane.showOptionDialog(null, "Eliminar pedidos", "Eliminar pedidos", 0,
                JOptionPane.DEFAULT_OPTION, null, opcionesPedidos, 0);
        this.pedidos[pedidosDisponibles[opcion]] = null;
    }
    // Funcion main

    private int[] obtenerPedidosDisponibles() {
        int x = 0;
        for (int i = 0; i < MAX_PEDIDOS; i++)
            if (pedidos[i] != null)
                x++;

        int[] z = new int[x];
        x = 0;
        for (int i = 0; i < MAX_PEDIDOS; i++) {
            if (pedidos[i] != null) {
                z[x] = i;
                x++;
            }
        }
        return z;
    }

    private void editarPedidos() {
        boolean salir = false;
        int[] pedidosDisponibles = obtenerPedidosDisponibles();
        int largo = pedidosDisponibles.length + 1;
        String[] opciones = new String[largo];
        opciones[pedidosDisponibles.length] = "Salir";

        for (int i = 0; i < pedidosDisponibles.length; i++){
            opciones[i] = "" + pedidosDisponibles[i];
            System.out.println(opciones[i]);
        }

        while (!salir) {
            int opcion = JOptionPane.showOptionDialog(null, "Editar pedidos", "Editar pedidos", 0,
                    JOptionPane.INFORMATION_MESSAGE, null, opciones, 0);
            if (opcion == pedidosDisponibles.length) {
                salir = true;
            } else
                pedidos[pedidosDisponibles[opcion]].editarPedidos();
            ;
        }
    }
}
