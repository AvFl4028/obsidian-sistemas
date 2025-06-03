package actividad;

import javax.swing.JOptionPane;

public class Plato {
    private float precio = 0;
    private String nombre = "";
    private int categoria = 0;

    public static final String[] CATEGORIAS = { "Entrada", "Plato Fuerte", "Postre" };

    public static final int ENTRADA = 0;
    public static final int FUERTE = 1;
    public static final int POSTRE = 2;

    public Plato(String nombre, int categoria, float precio) {
        this.precio = precio;
        this.categoria = categoria;
        this.nombre = nombre;
    }

    public Plato() {
    }

    @Override
    public String toString() {
        return "Platillo: " + this.nombre + "\nPrecio: " + this.precio + " $\nCategoria: " + this.categoriaTipo();
    }

    public String categoriaTipo() {
        String categoria = "";
        switch (this.categoria) {
            case ENTRADA:
                categoria = "Entrada";
                break;
            case FUERTE:
                categoria = "Plato Fuerte";
                break;
            case POSTRE:
                categoria = "Postre";
                break;
            default:
                break;
        }
        return categoria;
    }

    public float getPrecio() {
        return this.precio;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private void setPrecio(float precio) {
        this.precio = precio;
    }

    private void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public void editarPlato() {
        String[] opciones = new String[] { "Editar Nombre", "Editar Precio", "Editar Categoria" };
        String[] categorias = new String[] { "Entrada", "Plato Fuerte", "Postre" };
        boolean salir = false;
        int opcion = JOptionPane.showOptionDialog(null, "Editar platillo", "Editar platillo", 0,
                JOptionPane.DEFAULT_OPTION, null, opciones, 0);

        while (!salir) {
            switch (opcion) {
                case 0:
                    this.setNombre(JOptionPane.showInputDialog("Nuevo nombre"));
                    break;
                case 1:
                    this.setPrecio(Float.parseFloat(JOptionPane.showInputDialog("Nuevo precio")));
                    break;
                case 2:
                    this.setCategoria(JOptionPane.showOptionDialog(null, "Editar platillo", "Editar platillo", 0,
                            JOptionPane.DEFAULT_OPTION, null, categorias, 0));
                    break;
                default:
                    break;
            }
        }
    }

    public void eliminarPlato() {
    }
}
