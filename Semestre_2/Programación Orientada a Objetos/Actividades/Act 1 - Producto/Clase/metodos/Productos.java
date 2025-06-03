// Codigo de clase

package metodos;

public class Productos {
  private String nombre;
  private float precio;
  private int cantidadStock;

  @Override

  public String toString() {
    return "Producto(" + "Nombre" + nombre + ", precio=" + precio + ", Stock=" + cantidadStock;
  }

  public Productos(String nombre, float precio, int cantidadStock) {
    this.nombre = nombre;
    this.precio = precio;
    this.cantidadStock = cantidadStock;
  }

  public Productos(String nombre, float precio) {
    this.nombre = nombre;
    this.precio = precio;
  }

  public Productos(float precio, String nombre) {
    this.precio = precio;
    this.nombre = nombre;
  }

  Productos() {
  }

  public boolean vender(int cantidad) {
    boolean venta = true;
    if (cantidadStock >= cantidad) {
      cantidadStock -= cantidad;
    } else {
      venta = false;
    }
    return venta;
  }

  public void reponer(int cantidad) {
    if (cantidad > 0) {
      cantidadStock = cantidadStock + cantidad;
    }
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public float getPrecio() {
    return precio;
  }

  public void setPrecio(float precio) {
    this.precio = precio;
  }

  public int getCantidadStock() {
    return cantidadStock;
  }

  public void setCantidadStock(int cantidadStock) {
    this.cantidadStock = cantidadStock;
  }
}
