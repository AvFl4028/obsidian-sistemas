package Inv;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Random;
import java.util.Scanner;

public class Inv implements Serializable {
    Scanner sc = new Scanner(System.in);
    private Producto[] productos;
    private final File data;

    public Inv() {
        data = new File("inventario.dat");
        productos = new Producto[100];
        if (data.exists()) {
            cargarProductos();
        } else {
            try {
                data.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void menu() {
        boolean pepe = false;
        int opcion = 0;

        do {
            System.out.println("\n*********MENU DE OPCIONES*********");
            System.out.println("1- Agregar producto.");
            System.out.println("2- Lista de productos. ");
            System.out.println("3- Editar producto. ");
            System.out.println("4- Eliminar productos. ");
            System.out.println("5- Mostar productos vencidos.");
            System.out.println("6- Salir.");

            System.out.print("seleccione una opcion: ");

            try {
                opcion = Integer.parseInt(sc.nextLine());

                switch (opcion) {
                    case 1: // Agregar producto
                        createProducto();
                        break;
                    case 2: // Lista de productos
                        System.out.println(listarProductos());
                        break;
                    case 3: // Editar producto
                        try {
                            editarProducto();
                        } catch (ProductoNoExisteException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 4: // Eliminar productos
                        System.out.println("Codigo del producto a eliminar: ");
                        try {
                            eliminarProducto(sc.nextLine());
                        } catch (ProductoNoExisteException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 5:// Mostar productos por vencer
                        System.out.println(productosVencidos());
                        break;
                    case 6: // Salir
                        System.out.println("Fin c:");
                        guardarProductos();
                        pepe = true;
                        break;
                    default:
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        } while (!pepe);
    }

    public void guardarProductos() {
        try {
            FileOutputStream file = new FileOutputStream(data);
            ObjectOutputStream productos = new ObjectOutputStream(file);
            productos.writeObject(this.productos);
            productos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addProducto(Producto p) {
        for (int i = 0; i < productos.length; i++) {
            if (productos[i] == null) {
                productos[i] = p;
                break;
            }
        }
    }

    private void cargarProductos() {
        try {
            FileInputStream file = new FileInputStream(data);
            ObjectInputStream productos = new ObjectInputStream(file);
            this.productos = (Producto[]) productos.readObject();
            productos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String listarProductos() {
        String listaProductos = "";

        for (Producto producto : productos) {
            if (producto != null)
                listaProductos += producto.toString() + "\n";
        }

        return listaProductos.isEmpty() ? "No hay productos registrados.\n" : listaProductos;
    }

    public void eliminarProducto(String codigo) throws ProductoNoExisteException {
        boolean eliminado = false;
        for (int i = 0; i < productos.length; i++) {
            if (productos[i] != null) {
                if (productos[i].getCodigo().equals(codigo)) {
                    productos[i] = null;
                    eliminado = true;
                    break;
                }
            }
        }

        if (!eliminado) {
            throw new ProductoNoExisteException();
        }
    }

    private String productosVencidos() {
        String p = "";
        LocalDate hoy = LocalDate.now();
        LocalDate productoTime;
        for (Producto producto : productos) {
            if (producto != null) {
                productoTime = producto.getFechaVencimiento();
                if (hoy.equals(productoTime) || hoy.isAfter(productoTime)) {
                    p += producto.toString() + "\n";
                }
            }
        }

        return p;
    }

    private void editarProducto() throws ProductoNoExisteException {
        boolean encontrado = false;

        System.out.println("Ingresa el código del producto a editar:");
        String codigo = sc.nextLine();

        for (Producto producto : productos) {
            if (producto != null && producto.getCodigo().equals(codigo)) {
                encontrado = true;

                System.out.println("Cambiar nombre (dejar vacío si no se requiere):");
                String nombre = sc.nextLine();
                if (!nombre.isEmpty()) {
                    producto.setNombre(nombre);
                }

                System.out.println("Nueva fecha de vencimiento (formato yyyy-MM-dd, dejar vacío si no se requiere):");
                String fecha = sc.nextLine();
                if (!fecha.isEmpty()) {
                    try {
                        LocalDate date = LocalDate.parse(fecha);
                        producto.setFechaVencimiento(date);
                    } catch (DateTimeParseException e) {
                        System.out.println(
                                "⚠️ Error: La fecha ingresada es inválida. No se aplicaron cambios a la fecha.");
                    }
                }

                System.out.println("Nueva cantidad (dejar vacío si no se requiere):");
                String cantidad = sc.nextLine();
                if (!cantidad.isEmpty()) {
                    try {
                        int cant = Integer.parseInt(cantidad);
                        producto.setCantidad(cant);
                    } catch (NumberFormatException e) {
                        System.out.println("⚠️ Error: La cantidad debe ser un número entero válido.");
                    }
                }

                break; // Ya se encontró y editó el producto
            }
        }

        if (!encontrado) {
            throw new ProductoNoExisteException();
        }
    }

    private void createProducto() {
        try {
            System.out.println("Código del producto:");
            String codigo = sc.nextLine();

            if (productoExiste(codigo)) {
                System.out.println("⚠️ El producto con ese código ya existe.");
                return;
            }

            System.out.println("Nombre del producto:");
            String nombre = sc.nextLine();

            System.out.println("Fecha de caducidad (formato yyyy-MM-dd):");
            String fecha = sc.nextLine();
            LocalDate fechaVencimiento;
            try {
                fechaVencimiento = LocalDate.parse(fecha);
            } catch (DateTimeParseException e) {
                System.out.println("⚠️ Error: La fecha ingresada no es válida (ej: 2024-02-30). Producto no agregado.");
                return;
            }

            System.out.println("Cantidad del producto:");
            int cantidad;
            try {
                cantidad = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("⚠️ Error: La cantidad debe ser un número entero válido. Producto no agregado.");
                return;
            }

            addProducto(new Producto(codigo, nombre, cantidad, fechaVencimiento));
            System.out.println("✅ Producto agregado correctamente.");

        } catch (Exception e) {
            System.out.println("❌ Error inesperado al agregar el producto.");
            e.printStackTrace();
        }
    }

    public void limpiarProductos() {
        productos = new Producto[100];
    }

    private boolean productoExiste(String codigo) {

        for (Producto producto : productos) {
            if (producto != null) {
                if (producto.getCodigo().equals(codigo))
                    return true;
            }
        }

        return false;
    }

    public void addProductosTest() {
        Random rd = new Random();
        LocalDate dia = LocalDate.ofEpochDay(rd.nextInt(0, 100000));
        limpiarProductos();
        Producto nose = new Producto(null, null, 0, dia);
        // System.out.println(nose.toString());
        int testAdd = 0;
        while (testAdd < 10) {
            nose = new Producto(null, (testAdd + "- si"), testAdd, dia);
            nose.setCodigo(testAdd + "");
            dia = LocalDate.ofEpochDay(rd.nextInt(0, 100000));
            addProducto(nose);
            testAdd++;
        }
        guardarProductos();
    }
}