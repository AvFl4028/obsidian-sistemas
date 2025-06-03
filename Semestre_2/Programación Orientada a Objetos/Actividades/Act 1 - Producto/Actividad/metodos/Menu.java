package metodos;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JOptionPane;

// TODO - Metodo vender
// TODO - Buscar producto
// TODO - Cambiar lista por arreglos
// TODO - Metodo listar productos

public class Menu {
  private final int MAX_PRODUCTOS = 100;

  private final int CREAR = 0;
  private final int LEER = 1;
  private final int EDITAR = 2;
  private final int ELIMINAR = 3;
  private final int VENDER = 4;
  private final int BUSCAR = 5;
  private final int LISTAR = 6;
  private final int SALIR = 7;

  private boolean salir = false;

  private final int NOMBRE = 0;
  private final int DESCRIPCION = 1;
  private final int DEPARTAMENTO = 2;
  private final int PRECIO = 3;
  private final int STOCK = 4;
  private final int DESCUENTO = 5;

  private int productoSeleccionado;

  private String[] opciones = { "Nuevo Producto", "Leer Producto", "Editar Producto", "Eliminar Producto", "Vender",
      "Buscar", "Listar", "Salir" };
  private String[] editarOpciones = { "Nombre", "Descripcion", "Departamento", "Precio", "Stock", "Descuento" };

  // private List<Producto> ListaDeProductos = new ArrayList<Producto>();
  private Producto[] productos = new Producto[MAX_PRODUCTOS];
  private String[] ArregloDeProductos = new String[MAX_PRODUCTOS];
  // private List<Integer> descuento = new ArrayList<Integer>();
  // private List<Boolean> ListaDeDescuentos = new ArrayList<Boolean>();

  public void menu() {
    while (!salir) {
      int opcion = JOptionPane.showOptionDialog(null, "Opciones Productos", "Productos", 0,
          JOptionPane.INFORMATION_MESSAGE, null, opciones, 0);
      switch (opcion) {
        case CREAR:
          if (this.dar_alta_producto()) {
            JOptionPane.showMessageDialog(null, "Producto añadido");
          }
          break;

        case LEER:
          this.leerProducto();
          break;

        case EDITAR:
          this.seleccionarProducto(EDITAR);
          this.editarProductos();
          break;

        case ELIMINAR:
          this.seleccionarProducto(ELIMINAR);
          String productoNombre = this.ListaDeProductos.get(productoSeleccionado).getNombre();

          if (JOptionPane.showConfirmDialog(null, "Desea eliminar el producto: " + productoNombre) == 0) {
            this.ListaDeProductos.remove(productoSeleccionado);
            JOptionPane.showMessageDialog(null, "Producto eliminado");
          }
          break;

        case SALIR:
          this.salir = true;
          break;
        default:
          break;
      }
    }
  }

  private void leerProducto() {
    this.seleccionarProducto(LEER);
    this.comprobarStock();
    String descripcionProducto = "";
    if (ListaDeDescuentos.get(productoSeleccionado))
      descripcionProducto = this.ListaDeProductos.get(productoSeleccionado).mostrarProducto()
          + "\nTiene Descuento del: " + descuento.get(productoSeleccionado) + "%";
    else
      descripcionProducto = this.ListaDeProductos.get(productoSeleccionado).mostrarProducto();
    JOptionPane.showMessageDialog(null, descripcionProducto);

  }

  private boolean dar_alta_producto() {
      String _nombre = JOptionPane.showInputDialog("Nombre del producto");
      String _descripcion = JOptionPane.showInputDialog("Descripcion del producto");
      String _departamento = JOptionPane.showInputDialog("Departamento del producto");
      float _precio = Float.parseFloat(JOptionPane.showInputDialog("Precio del producto"));
      int _stock = Integer.parseInt(JOptionPane.showInputDialog("Número de stock"));

      if (_stock < 10) {
        _stock = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un stock valido mayor a 10"));
      }

      for (Producto x : productos)
        if (x != null) {
          x = new Producto(
              _nombre,
              _descripcion,
              _departamento,
              _precio,
              _stock);
          return true;
        }

      return false;
  }

  private String[] getProductosNombres() {
    int productosDisponibles = 0;
    for (Producto x: )
    String[] results = new String[this.ListaDeProductos.size()];

    for (int i = 0; i < this.ListaDeProductos.size(); i++)
      results[i] = this.ListaDeProductos.get(i).getNombre();

    return results;
  }

  private void seleccionarProducto(int opcion) {
    String opciones_seleccion = "";

    switch (opcion) {
      case CREAR:
        opciones_seleccion = "Selecciona un producto";
        break;
      case LEER:
        opciones_seleccion = "Selecciona un producto a leer";
        break;
      case EDITAR:
        opciones_seleccion = "Selecciona un producto a editar";
        break;
      case ELIMINAR:
        opciones_seleccion = "Seleccione un producto a eliminar";
        break;
      case VENDER:
        opciones_seleccion = "Seleccione producto a vender";

      default:
        break;
    }
    productoSeleccionado = JOptionPane.showOptionDialog(null, opciones_seleccion, "Productos", 0,
        JOptionPane.INFORMATION_MESSAGE, null, this.getProductosNombres(), 0);
  }

  public void editarProductos() {
    int opcion = JOptionPane.showOptionDialog(null, "Selecciona para editar", "Editar producto", 0,
        JOptionPane.INFORMATION_MESSAGE, null, editarOpciones, 0);

    switch (opcion) {
      case NOMBRE:
        String new_name = JOptionPane.showInputDialog("Nuevo nombre");
        this.ListaDeProductos.get(productoSeleccionado).setNombre(new_name);
        break;
      case DESCRIPCION:
        String new_descripcion = JOptionPane.showInputDialog("Nueva Descripcion");
        this.ListaDeProductos.get(productoSeleccionado).setDescripcion(new_descripcion);
        break;
      case DEPARTAMENTO:
        String new_departamento = JOptionPane.showInputDialog("Nuevo departamento");
        this.ListaDeProductos.get(productoSeleccionado).setDepartamento(new_departamento);
        break;
      case PRECIO:
        float new_precio = Float.parseFloat(JOptionPane.showInputDialog("Nuevo precio"));
        this.ListaDeProductos.get(productoSeleccionado).setPrecio(new_precio);
        break;
      case STOCK:
        int new_stock = Integer.parseInt(JOptionPane.showInputDialog("Nuevo stock"));
        this.ListaDeProductos.get(productoSeleccionado).setStock(new_stock);
        break;
      case DESCUENTO:
        int new_descuento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el descuento"));
        this.setDescuento(new_descuento);
      default:
        break;
    }
  }

  private void comprobarStock() {
    if (this.ListaDeProductos.get(productoSeleccionado).getStock() < 10) {
      JOptionPane.showMessageDialog(null, "El stock es menor que 10, reponga lo más rapido posible");
    }
  }

  private void setDescuento(int descuento) {
    this.descuento.set(productoSeleccionado, descuento);
    this.ListaDeDescuentos.set(productoSeleccionado, true);
    float _descuento = this.descuento.get(productoSeleccionado);
    float precio = ListaDeProductos.get(productoSeleccionado).getPrecio();
    ListaDeProductos.get(productoSeleccionado).setPrecio(precio * (1 - (_descuento / 100)));
  }

  public void addTestProductos() {
    Random random = new Random();

    String[] nombres = { "Laptop", "Mouse", "Teclado", "Monitor", "Audífonos", "Impresora", "Tablet", "Celular",
        "Cámara", "Smartwatch" };
    String[] descripciones = { "Alta calidad", "Económico", "Nuevo modelo", "Edición limitada", "Versión mejorada" };
    String[] departamentos = { "Electrónica", "Computación", "Hogar", "Juguetes", "Deportes" };

    for (int i = 0; i < 10; i++) {
      String nombre = nombres[random.nextInt(nombres.length)];
      String descripcion = descripciones[random.nextInt(descripciones.length)];
      String departamento = departamentos[random.nextInt(departamentos.length)];
      float precio = random.nextFloat() * 1000 + 100; // Precio entre 100 y 1100
      int stock = random.nextInt(100) + 10; // Stock entre 1 y 100

      ListaDeProductos.add(new Producto(nombre, descripcion, departamento, precio, stock));
      ListaDeDescuentos.add(false);
      descuento.add(0);
    }
  }
}
