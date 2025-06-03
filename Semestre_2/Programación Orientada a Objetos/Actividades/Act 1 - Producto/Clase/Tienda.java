// Codigo de clase

import javax.swing.JOptionPane;
import metodos.Productos;

public class Tienda {
  Productos p;

  void menu() {

    String menu = "1.-Altas producto\n 2.-Vender\n 3,- Reponer\n 4.- Mostrar\n 5.- Modificar\n  6.- salir";
    String op = JOptionPane.showInputDialog(menu);

    switch (op.substring(0, 1)) {
      case "1":
        p = altaProducto();
        break;
      case "2":
        ventas();
        break;
      case "3":
        String cuantos = JOptionPane.showInputDialog("Cuantoas productos");
        p.reponer(Integer.parseInt(cuantos));
        break;
      case "4":
        JOptionPane.showMessageDialog(null, p.toString());
        break;
      case "5":
        String opcion = JOptionPane.showInputDialog("Que desea modificar?  Stock o precio");
        opcion = opcion.toUpperCase();
        if (opcion.charAt(0) == 'S') {
          int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Da el numero que desaa modificar"));
          modificar(cantidad);
        } else if (opcion.charAt(0) == 'P') {
          float precio = Float.parseFloat(JOptionPane.showInputDialog("Da el numero que deseas modificar para precio"));
          modificar(precio);
        }
        float precio = Float.parseFloat(JOptionPane.showInputDialog("da un numero"));
        break;

      case "6":
        p = null;
        break;

      case "7":
        System.out.println("Saliendo del menu");

        break;
      default:
        System.out.println("Error");

    }
  }

  void modificar(int cantidad) {
    JOptionPane.showMessageDialog(null, "El objeto que vas a mofificares " + p.toString());
    p.setCantidadStock(cantidad);
  }

  void modificar(float precio) {
    JOptionPane.showMessageDialog(null, "El objeto que vas a modificar es " + p.toString());
    p.setPrecio(precio);
  }

  Productos altaProducto() {
    String nombre = JOptionPane.showInputDialog("Da un numero de producto");
    float precio = Float.parseFloat(JOptionPane.showInputDialog("Da el precio"));
    int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Da un stock"));
    Productos x = new Productos(nombre, precio, cantidad);
    return x;
  }

  void ventas() {
    String nombre = JOptionPane.showInputDialog("Que producto desea");
    int cuantas = Integer.parseInt(JOptionPane.showInputDialog("Cuantas piezas desea"));

    if (p.vender(cuantas) == (false))
      JOptionPane.showMessageDialog(null, "existencias vacias");
  }

  public static void main(String[] args) {
    Tienda obj = new Tienda();
    obj.menu();
  }
}
