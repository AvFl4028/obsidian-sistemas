package actividad;
import javax.swing.JOptionPane;

// TODO - metodo para Añadir mas platos

class Platillo {
    private String[] categorias = { "Entrada", "Plato Fuerte", "Postre", "Salir" };
    public static final String[] CATEGORIAS = { "Entrada", "Plato Fuerte", "Postre"};
    private String[] menu_opciones = { "Levantar pedido", "Cerrar pedido", "Salir" };
    
    private boolean cerrar_menu = false;
    
    private final int PEDIDO = 0;
    private final int CERRAR_PEDIDO = 1;
    private final int SALIR = 2;

    private final float descuento_general = 0.9f; // Descuento del 10%
    private final float compras_superiores = 0.97f; // Descuento del 3%

    private float PRECIO_ENTRADA = 100;
    private float PRECIO_PLATO_FUERTE = 500;
    private float PRECIO_POSTRE = 100;

    private final int CONSUMOS_SUPERIORES = 2000;

    private float precio_final_entrada = 0;
    private float precio_final_plato_fuerte = 0;
    private float precio_final_postre = 0;
    private float precio_final_pedido = 0;

    private String nombre_entrada = null;
    private String nombre_plato_fuerte = null;
    private String nombre_postre = null;

    private float precio = 0;
    private String nombre = "";
    private int categoria = 0;

    private String DIA = "Lunes";
    // private String DIA = "Miercoles";

    public Platillo() {
        this.nombre_entrada = "Coctel de fruta";
        this.nombre_plato_fuerte = "Huevo con jamon";
        this.nombre_postre = "Café con pan";

        this.precio_final_entrada = 100;
        this.precio_final_plato_fuerte = 200;
        this.precio_final_postre = 300;
    }

    public Platillo(String nombre, int categoria, float precio) {
        switch (categoria) {
            case 0:
                this.nombre_entrada = nombre;
                this.PRECIO_ENTRADA = precio;
                break;
            case 1:
                this.nombre_plato_fuerte = nombre;
                this.PRECIO_PLATO_FUERTE = precio;
            case 2:
                this.nombre_postre = nombre;
                this.PRECIO_POSTRE = precio;
            default:
                break;
        }
    }

    public void menu() {
        while (!cerrar_menu) {
            int opciones = JOptionPane.showOptionDialog(null, "Restaurant 'Cafecito'\nMénu", "Restaurant 'Cafecito'", 0,
                    JOptionPane.INFORMATION_MESSAGE, null, menu_opciones, 0);
            switch (opciones) {
                case PEDIDO:
                    this.escoger_categoria();
                    break;
                case CERRAR_PEDIDO:
                    JOptionPane.showMessageDialog(null, pedido_total());
                    cerrar_menu = true;
                    break;
                case SALIR:
                    cerrar_menu = true;
                    break;
                default:
                    break;
            }
        }
    }

    private void escoger_categoria() {
        int categoria = JOptionPane.showOptionDialog(null, "Escoja una categoria", "Pedido", 0,
                JOptionPane.INFORMATION_MESSAGE, null, categorias, 0);
        switch (categoria) {
            case 0:
                if (nombre_entrada == null)
                    JOptionPane.showMessageDialog(null, "No hay platos de entrada disponibles");
                else
                    precio_final_entrada = Float
                            .parseFloat(JOptionPane.showInputDialog("Cantidad de " + nombre_entrada))
                            * PRECIO_ENTRADA;
                this.escoger_categoria();
                break;

            case 1:
                if (nombre_plato_fuerte == null)
                    JOptionPane.showMessageDialog(null, "No hay platos fuertes disponibles");
                else
                    precio_final_plato_fuerte = Float
                            .parseFloat(JOptionPane.showInputDialog("Cantidad de " + nombre_plato_fuerte))
                            * PRECIO_PLATO_FUERTE;
                this.escoger_categoria();
                break;

            case 2:
                if (nombre_postre == null)
                    JOptionPane.showMessageDialog(null, "No hay postres disponibles");
                else
                    precio_final_postre = Float.parseFloat(JOptionPane.showInputDialog("Cantidad de " + nombre_postre))
                            * PRECIO_POSTRE;
                this.escoger_categoria();
                break;
            default:
                break;
        }
    }

    public String pedido_total() {
        String entrada = "";
        String fuerte = "";
        String postre = "";

        if (nombre_entrada != null)
            entrada = "Entrada: " + nombre_entrada + ", Total: " + precio_final_entrada + "\n";

        if (nombre_plato_fuerte != null)
            fuerte = "Plato fuerte: " + nombre_plato_fuerte + ", Total: " + precio_final_plato_fuerte + "\n";

        if (nombre_postre != null)
            postre = "Postre: " + nombre_postre + ", Total: " + precio_final_postre + "\n";

        float precio_final_con_descuento;

        precio_final_pedido = precio_final_entrada + precio_final_plato_fuerte + precio_final_postre;

        if (DIA == "Miercoles") {
            precio_final_con_descuento = precio_final_pedido * descuento_general;
            return "Total del pedido:\n" + entrada + fuerte + postre
                    + "Total: " + precio_final_pedido + "\nTotal con descuento general del 10% por ser miercoles: "
                    + precio_final_con_descuento;
        }

        if (precio_final_pedido > CONSUMOS_SUPERIORES) {
            precio_final_con_descuento = precio_final_pedido * compras_superiores;
            return "Total del pedido:\n" + entrada + fuerte + postre
                    + "Total: " + precio_final_pedido + "\nTotal con descuento por compras superiores a 2000 pesos: "
                    + precio_final_con_descuento;
        }

        return "Total del pedido:\n" + entrada + fuerte + postre + "Total: " + precio_final_pedido;
    }
}
