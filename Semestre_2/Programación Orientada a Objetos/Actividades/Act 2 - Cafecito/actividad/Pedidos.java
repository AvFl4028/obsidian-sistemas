package actividad;
// En esta clase se declaran los pedidos por mesa

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

import javax.swing.JOptionPane;

public class Pedidos {
    private final int MAX_PLATOS = 10;
    // Descuentos disponibles
    private final float DESCUENTO_GENERAL = 0.03f;
    private final float DESCUENTO_CONSUMOS = 0.1f;

    // Variables para saber el precio total de todos los pedidos y que tipo de
    // descuento
    private float tipoDescuento = 0;
    private float precioTotal = 0;

    // Arreglo de todos los pedidos hechos y no hechos
    private Plato[] platillos = new Plato[MAX_PLATOS];

    public Pedidos() {
        this.addPedido();
    }

    public void addPedido() {
        for (int i = 0; i < MAX_PLATOS; i++) {
            System.out.println("-------------------------------");
            System.out.println(platillos[i]);
            System.out.println("-------------------------------");

            if (platillos[i] == null) {
                String _nombre = JOptionPane.showInputDialog("Ingrese el platillo");
                int _categoria = JOptionPane.showOptionDialog(null, "Seleccione una categoria", "Categoria",
                        0, JOptionPane.INFORMATION_MESSAGE, null, Plato.CATEGORIAS, 0);
                float _precio = Float.parseFloat(JOptionPane.showInputDialog("Inserte el precio"));

                platillos[i] = new Plato(_nombre, _categoria, _precio);

                break;
            }
        }
    }

    public String cuenta() {
        Plato[] x = obtenerPlatillos();
        String todosLosPlatillos = "";

        for (Plato platillo : x) {
            todosLosPlatillos += platillo.toString() + "\n\n";
            precioTotal += platillo.getPrecio();
        }

        if (tieneDescuento())
            todosLosPlatillos = "Todos los platillos son:\n" + todosLosPlatillos + "Precio: " + precioTotal + "\n"
                    + getTipoDescuento() + "\nDía: " + getDia() + "\nTotal a pagar: " + precioConDescuento() + "\n";
        else
            todosLosPlatillos = "Todos los platillos son:\n" + todosLosPlatillos + "\nDía: " + getDia()
                    + "\nTotal a pagar: " + precioTotal
                    + "\n";
        this.precioTotal = 0;
        return todosLosPlatillos;
    }

    private String getDia() {
        LocalDate fechaActual = LocalDate.now();
        String diaEnEspañol = fechaActual.getDayOfWeek().getDisplayName(TextStyle.FULL, new Locale("es", "ES"));

        // System.out.println("Hoy es: " + diaEnEspañol); // Ejemplo: miércoles
        return diaEnEspañol;
    }

    private boolean tieneDescuento() {
        if (this.precioTotal > 2000) {
            this.tipoDescuento = DESCUENTO_CONSUMOS;
            return true;
        }
        String dia = getDia();
        if (dia.equals("miércoles")) {
            this.tipoDescuento = DESCUENTO_GENERAL;
            return true;
        }

        return false;
    }

    private float precioConDescuento() {
        if ((int) (tipoDescuento * 100) == (int) (DESCUENTO_CONSUMOS * 100))
            return this.precioTotal * (1 - DESCUENTO_CONSUMOS);

        if ((int) (tipoDescuento * 100) == (int) (DESCUENTO_GENERAL * 100))
            return this.precioTotal * (1 - DESCUENTO_GENERAL);

        return this.precioTotal;
    }

    private String getTipoDescuento() {
        String descuento = "";
        switch ((int) (tipoDescuento * 100)) {
            case (int) (DESCUENTO_CONSUMOS * 100):
                descuento = "Descuento del 3% por consumir mas de $2000";
                break;
            case (int) (DESCUENTO_GENERAL * 100):
                descuento = "Descuento del 10% por ser miercoles";
                break;
            default:
                descuento = "";
                break;
        }
        return descuento;
    }

    public Plato[] obtenerPlatillos() {
        int totalPlatos = 0;
        for (int i = 0; i < MAX_PLATOS; i++)
            if (platillos[i] != null)
                totalPlatos++;

        if (totalPlatos == 0)
            return new Plato[] {};

        Plato[] x = new Plato[totalPlatos];
        int i = 0;

        for (Plato plato : platillos)
            if (plato != null) {
                x[i] = plato;
                i++;
            }
        return x;
    }

    private int[] getPedidosId() {
        int totalPedidos = 0;
        for (int i = 0; i < MAX_PLATOS; i++)
            if (platillos[i] != null)
                totalPedidos++;

        int[] x = new int[totalPedidos];
        totalPedidos = 0;
        for (int i = 0; i < MAX_PLATOS; i++) {
            if (platillos[i] != null) {
                x[totalPedidos] = i;
                totalPedidos++;
            }
        }
        return x;
    }

    public void eliminarPedidos() {
        Plato[] x = this.obtenerPlatillos();
        String[] opciones_pedidos = new String[x.length];
        int[] ids = this.getPedidosId();
        for (int i = 0; i < x.length; i++) {
            opciones_pedidos[i] = x[i].getNombre();
        }

        if (opciones_pedidos.length <= 0) {
            JOptionPane.showMessageDialog(null, "No hay pedidos para eliminar");
            return;
        }

        int opcion = JOptionPane.showOptionDialog(null, "Seleccione pedido a eliminar", "Eliminar", 0,
                JOptionPane.INFORMATION_MESSAGE, null, opciones_pedidos, 0);
        for (int i = 0; i < opciones_pedidos.length; i++)
            if (i == opcion) {
                this.precioTotal -= platillos[ids[i]].getPrecio();
                platillos[ids[i]] = null;
                break;
            }
    }

    public void editarPedidos() {
        int[] platillos_disponibles = getPedidosId();
        String[] opciones = new String[platillos_disponibles.length];
        for (int i = 0; i < platillos_disponibles.length; i++) {
            opciones[i] = platillos[i].getNombre();
        }
        int option = JOptionPane.showOptionDialog(null, "Selecciona el platillo a editar", "Editar", 0,
                JOptionPane.DEFAULT_OPTION, null, opciones, 0);
    }
}
