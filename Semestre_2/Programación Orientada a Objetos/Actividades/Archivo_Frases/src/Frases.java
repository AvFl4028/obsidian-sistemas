import java.io.*;
import javax.swing.JOptionPane;

/**
 * Crear un menu que cree un archivo frases.txt, que se puedan añadir frases,
 * leer frases, buscar frases por palabras, crear un frases-copia.txt como copia
 * de seguridad.
 * 
 * Metodo que diga cuantas lineas tiene el archivo | listo
 * Metodo que numero cada linea del archivo, va a modificar el archivo original
 * | listo
 * 
 * Metodo escribir frase | listo
 * Metodo Copiar archivo frases | listo
 * Metodo Buscar palabras en frases | listo
 * Metodo Mostrar frases | listo
 * agregar al menu una seccion que sea contar las vocales que hay en el archivo | listo
 * Salir
 */

public class Frases {
    private final File archivo;
    private final File archivo_copia;

    public Frases(String archivo) {
        this.archivo = new File(archivo + ".txt");
        this.archivo_copia = new File(archivo + "-copia.txt");
    }

    public String leerArchivo() {
        String lectura = "";
        FileReader archivo_lectura = null;
        try {
            if (archivo.exists())
                archivo_lectura = new FileReader(archivo);
            else if (archivo_copia.exists())
                archivo_lectura = new FileReader(archivo_copia);
            else
                return "Archivo no existe";
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try (BufferedReader doc = new BufferedReader(archivo_lectura)) {
            String read = "";
            while ((read = doc.readLine()) != null)
                lectura += read + "\n";
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return lectura;
    }

    public void escribir(String frase) {
        try (BufferedWriter doc = new BufferedWriter(new FileWriter(archivo, true))) {
            if (!frase.isEmpty())
                doc.write(frase + "\n");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void escribir(String frase, boolean append) {
        try (BufferedWriter doc = new BufferedWriter(new FileWriter(archivo, append))) {
            if (!frase.isEmpty())
                doc.write(frase + "\n");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void copiaSeguridad() {
        try (BufferedReader original = new BufferedReader(new FileReader(archivo));
                BufferedWriter copia = new BufferedWriter(new FileWriter(archivo_copia, true))) {
            String frase = "";
            while ((frase = original.readLine()) != null)
                copia.write(frase + "\n");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public String buscarPalabra(String msg) {
        String frases[] = leerArchivo().toLowerCase().split("\n");
        String palabras[] = null;
        String frases_encontradas = "";

        for (String frase : frases) {
            palabras = frase.split(" ");
            for (String palabra : palabras)
                if (palabra.equals(msg.toLowerCase()))
                    frases_encontradas += frase + "\n";
        }

        if (frases_encontradas.isEmpty()) {
            frases_encontradas = "No hubo frases encontradas";
        }

        return frases_encontradas;
    }

    public int numLineas() {
        return leerArchivo().split("\n").length;
    }

    public void numerarLineas() {
        int count = 0;
        String result = "";
        String[] frases = leerArchivo().split("\n");
        for (String frase : frases) {
            result += (++count) + " - " + frase;
            if (count < frases.length)
                result += "\n";
        }

        escribir(result, false);
    }

    public void limpiarArchivos() {
        archivo.delete();
        archivo_copia.delete();
    }

    public int contarVocales() {
        char[] vocales = "AEIOUÁÉÍÓÚaeiouáéíóú".toCharArray();
        int count = 0;
        for (char letra : leerArchivo().toCharArray())
            for (char c : vocales)
                if (letra == c)
                    count++;
        return count;
    }

    public void menu() {
        boolean salir = false;
        String[] opciones = { "Escribir Frase", "Mostrar Frases", "Copiar Archivo", "Buscar Palabra",
                "Número de Frases", "Numerar Frases", "Limpiar Archivos", "Contar Vocales", "Salir" };
        String frase = "";
        while (!salir) {
            int opcion = JOptionPane.showOptionDialog(null, "", "Frases", 0, JOptionPane.INFORMATION_MESSAGE, null,
                    opciones,
                    null);

            switch (opcion) {
                case 0:
                    frase = JOptionPane.showInputDialog("Frase a escribir");
                    escribir(frase);
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null, leerArchivo());
                    break;
                case 2:
                    copiaSeguridad();
                    JOptionPane.showMessageDialog(null, "Copia de frases hecha!");
                    break;
                case 3:
                    frase = JOptionPane.showInputDialog("Palabra a buscar");
                    JOptionPane.showMessageDialog(null, buscarPalabra(frase));
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Número de frases: " + numLineas());
                    break;
                case 5:
                    numerarLineas();
                    JOptionPane.showMessageDialog(null, "Se numero el archivo de frases");
                    break;
                case 6:
                    if (JOptionPane.showConfirmDialog(null, "Seguro que quieres borrar los archivos?") == 0)
                        limpiarArchivos();
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, "Total vocales: " + contarVocales());
                    break;
                case 8:
                    salir = true;
                    break;
                default:
                    break;
            }
        }
    }
}
