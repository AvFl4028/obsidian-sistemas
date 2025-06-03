package metodos;

// Codigo mio

public class Producto {
  private String nombre;
  private int stock;
  private float precio;
  private String descripcion;
  private String departamento;
  public Producto(
      String nombre,
      String descripcion,
      String departamento,
      float precio,
      int stock) {
    this.precio = precio;
    this.descripcion = descripcion;
    this.departamento = departamento;
    this.nombre = nombre;
    this.stock = stock;
  }

  public Producto() {

  }

  public boolean vender(int stock) {
    if (stock > this.stock || stock < 0)
      return false;

    this.stock -= stock;
    return true;
  }

  public boolean reponer(int stock) {
    if (stock < 0)
      return false;

    this.stock += stock;
    return true;
  }

  public String mostrarProducto() {
    return "Nombre: " + this.nombre + "\nPrecio: " + this.precio
        + "\nDescripción: " + this.descripcion + "\nStock: "
        + this.stock + "\nDepartamento: " + this.departamento;
  }

  public String getNombre() {
    return this.nombre;
  }

  public boolean setNombre(String nombre) {
    if (nombre.length() < 3)
      return false;

    this.nombre = nombre;
    return true;
  }

  public String getDepartamento() {
    return this.departamento;
  }

  public boolean setDepartamento(String departamento) {
    if (departamento.length() < 3) {
      return false;
    }
    this.departamento = departamento;
    return true;
  }

  public String getDescripcion() {
    return this.descripcion;
  }

  public boolean setDescripcion(String departamento) {
    if (departamento.length() < 3)
      return false;
    this.departamento = departamento;
    return true;
  }

  public float getPrecio() {
    return this.precio;
  }

  public boolean setPrecio(int precio) {
    if (precio < 0) {
      return false;
    }
    this.precio = precio;
    return true;
  }

  public boolean setPrecio(float precio) {
    if (precio < 0) {
      return false;
    }
    this.precio = precio;
    return true;
  }

  public boolean setPrecio(double precio) {
    if (precio < 0) {
      return false;
    }
    this.precio = (float) precio;
    return true;
  }

  public boolean setStock(int stock) {
    if (stock < 0)
      return false;
    this.stock = stock;
    return true;
  }

  public int getStock(){
    return this.stock;
  }
}
