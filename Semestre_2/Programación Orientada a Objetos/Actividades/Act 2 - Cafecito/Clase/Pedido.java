import java.util.ArrayList;
import java.util.List;

public class Pedido {
    List<Plato> platos;
    int contadorPlatos;

    public Pedido() {
        platos = new ArrayList<>();
        contadorPlatos = 0;
    }

    public void agregarPlato(Plato plato) {
        if (plato != null) {
            platos.add(plato);
            contadorPlatos++;
        } else {
            System.out.println("No se puede agregar un plato nulo.");
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (Plato plato : platos) {
            if (plato != null) {
                total += plato.getPrecio();
            }
        }
        return total;
    }

    public void mostrarPedido() {
        if (platos.isEmpty()) {
            System.out.println("El pedido está vacío.");
            return;
        }

        System.out.println("Pedido actual:");
        for (Plato plato : platos) {
            if (plato != null) {
                System.out.println("- " + plato.getNombre() + " (" + plato.getPrecio() + "€)");
            }
        }
    }

    public void vaciarPedido() {
        platos.clear();
        contadorPlatos = 0;
        System.out.println("Pedido vaciado.");
    }

    public void cerrarPedido() {
        if (platos.isEmpty()) {
            System.out.println("No hay productos en el pedido.");
            return;
        }

        mostrarPedido();
        System.out.println("Total a pagar: " + String.format("%.2f", calcularTotal()) + "€");
        System.out.println("Pedido cerrado. ¡Gracias por su compra!");
        // vaciarPedido(); // Opcional: vaciar el pedido después de cerrarlo
    }

    public void aplicarDescuento(double porcentaje) {
    }
}
