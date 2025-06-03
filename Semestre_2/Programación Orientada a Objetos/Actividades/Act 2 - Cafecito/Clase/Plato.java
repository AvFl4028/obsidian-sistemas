public class Plato {
    private String nombre;
    private double precio;
    private String categoria;

    public Plato(String nombre, double precio, String categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }

    public void aplicarDescuento(double porcentaje) {
        if (porcentaje > 0 && porcentaje <= 100) {
            this.precio -= this.precio * (porcentaje / 100);
        } else {
            System.out.println("Descuento inválido.");
        }
    }

    public void aplicarDescuento(int cantidadHijos) {
        if (cantidadHijos > 0) {
            this.precio -= cantidadHijos * 2; // Ejemplo: 2€ de descuento por hijo
        } else {
            System.out.println("Cantidad de hijos inválida.");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return nombre + " (" + String.format("%.2f", precio) + "€) - " + categoria;
    }
}