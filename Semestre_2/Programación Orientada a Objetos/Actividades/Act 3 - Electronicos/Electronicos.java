public class Electronicos {
    protected String nombre;
    protected float precio;

    public Electronicos(String nombre, float precio) {
        this.precio = precio;
        this.nombre = nombre;
    }

    public void mostrarInfo(){
        System.out.println("Nombre: " + this.nombre + "\nPrecio: $" + this.precio);
    }
}
