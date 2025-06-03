import java.util.Scanner;

public class Restaurante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pedido pedido = new Pedido();

        // Crear platos del menú
        Plato plato1 = new Plato("Pizza Margarita", 15.0, "Plato Fuerte");
        Plato plato2 = new Plato("Ensalada César", 9.0, "Entrada");
        Plato plato3 = new Plato("Tarta de Chocolate", 6.0, "Postre");
        Plato plato4 = new Plato("Sopa de Verduras", 7.5, "Entrada");

        // Mostrar menú
        System.out.println("--- Menú ---");
        System.out.println("1. Pizza Margarita - 15.0€");
        System.out.println("2. Ensalada César - 9.0€");
        System.out.println("3. Tarta de Chocolate - 6.0€");
        System.out.println("4. Sopa de Verduras - 7.5€");
        System.out.println("5. Aplicar descuento");
        System.out.println("6. Cerrar pedido");

        int opcion;
        do {
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    pedido.agregarPlato(plato1);
                    break;
                case 2:
                    pedido.agregarPlato(plato2);
                    break;
                case 3:
                    pedido.agregarPlato(plato3);
                    break;
                case 4:
                    pedido.agregarPlato(plato4);
                    break;
                case 5:
                    System.out.print("Ingrese el porcentaje de descuento: ");
                    double porcentaje = scanner.nextDouble();
                    pedido.aplicarDescuento(porcentaje);
                    break;
                case 6:
                    pedido.cerrarPedido();
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 6);

        scanner.close();
    }
}