import java.io.*;
import javax.swing.*;

public class Coincidencias {
    private final File coincidenciasFile;
    private final File tempFile;
    private String[][] texto;

    public Coincidencias(String fileName) {
        this.coincidenciasFile = new File(fileName);
        this.tempFile = new File("temp.txt");

        try {
            if (!this.coincidenciasFile.exists()) {
                this.coincidenciasFile.createNewFile();
            }

            if (!this.tempFile.exists()) {
                this.tempFile.createNewFile();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void reemplazarCoincidencias() {
        String data = leerFile(coincidenciasFile);
        String palabrasRepetida = "";
        String textoSinCoincidencias = "";
        for (String linea : data.split("\n")) {
            String[] palabras = linea.split(" ");

            for (String palabra : palabras) {

                // System.out.println(palabra);
                boolean repetida = palabraRepetida(palabra, palabrasRepetida);

                if (!repetida) {
                    textoSinCoincidencias += palabra + " ";
                    palabrasRepetida += palabra + " ";
                } else {
                    textoSinCoincidencias += " ";
                }
            }
            textoSinCoincidencias += "\n";
        }
        escribirFile(tempFile, textoSinCoincidencias);
    }

    private boolean palabraRepetida(String palabra, String line) {
        for (String palabraRep : line.split(" ")) {
            if (esCoincidencia(palabra, palabraRep)) {
                return true;
            }
        }
        return false;
    }

    public void reemplazarCoincidenciaPosicion(int linea_, int posicion) {
        String data[][] = getTextMatrix();
        try {
            data[linea_][posicion] = " ";
        } catch (Exception e) {
            System.out.println(e.getMessage());
            ;
        }
        String info = "";
        for (String[] linea : data) {
            for (String palabra : linea) {
                if(palabra != null)
                    info += palabra + " ";
            }
            info += "\n";
        }
        escribirFile(tempFile, info);
    }

    private boolean esCoincidencia(String palabra1, String palabra2) {
        if (palabra1.trim().equalsIgnoreCase(palabra2.trim())) {
            return true;
        }
        return false;
    }

    private void escribirFile(File fl, String cadena) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fl, true))) {
            bw.write(cadena);
            bw.newLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private String leerFile(File fl) {
        String text = "";
        try (BufferedReader br = new BufferedReader(new FileReader(fl))) {
            String line;
            while ((line = br.readLine()) != null) {
                text += line + "\n";
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return text;
    }

    public boolean[][] posicionesPalabraCoincidencia() {
        String palabrasRepetidas = "";
        int numLines = numLineas();
        int numPalabra[] = new int[numLines];
        String data = leerFile(coincidenciasFile);
        int prevalue = 0;

        for (int i = 0; i < numLines; i++) {
            numPalabra[i] = numPalabras(data.split("\n")[i]);
            System.out.println(i);
        }

        for (int i : numPalabra) {
            if (i > prevalue) {
                prevalue = i;
            }
        }
        System.out.println(numLines);

        boolean[][] resultado = new boolean[numLines][prevalue];
        for (int i = 0; i < numLines; i++) {
            String[] palabras = data.split("\n")[i].split(" ");
            for (int j = 0; j < palabras.length; j++) {
                if (!palabraRepetida(palabras[j], palabrasRepetidas)) {
                    palabrasRepetidas += palabras[j] + " ";
                    resultado[i][j] = false;
                } else
                    resultado[i][j] = true;
            }
        }
        return resultado;
    }

    public String[][] getTextMatrix() {
        int numLines = numLineas();
        int numPalabra[] = new int[numLines];
        String data = leerFile(coincidenciasFile);
        int prevalue = 0;

        for (int i = 0; i < numLines; i++) {
            numPalabra[i] = numPalabras(data.split("\n")[i]);
            //System.out.println(i);
        }

        for (int i : numPalabra) {
            if (i > prevalue) {
                prevalue = i;
            }
        }
        //System.out.println(numLines);

        String[][] resultado = new String[numLines][prevalue];
        for (int i = 0; i < numLines; i++) {
            String[] palabras = data.split("\n")[i].split(" ");
            for (int j = 0; j < palabras.length; j++) {
                resultado[i][j] = palabras[j];
            }
        }
        return resultado;
    }

    private int numLineas() {
        return leerFile(coincidenciasFile).split("\n").length;
    }

    private int numPalabras(String linea) {
        return linea.split(" ").length;
    }

    private String[] obtenerCoincidencias() {
        String[][] texto = getTextMatrix();
        String palabrasRepetidas = "";
        String coincidenciasUnicas = "";

        for (int i = 0; i < texto.length; i++) {
            for (int j = 0; j < texto[i].length; j++) {
                String palabra = texto[i][j];
                if (palabra != null && !palabra.trim().equals("")) {
                    if (palabraRepetida(palabra, palabrasRepetidas)) {
                        if (!palabraRepetida(palabra, coincidenciasUnicas)) {
                            coincidenciasUnicas += palabra + " ";
                        }
                    } else {
                        palabrasRepetidas += palabra + " ";
                    }
                }
            }
        }

        String[] coincidenciasSplit = coincidenciasUnicas.trim().split(" ");
        int cantidad = coincidenciasSplit.length;
        String[] resultado = new String[cantidad];
        for (int i = 0; i < cantidad; i++) {
            resultado[i] = coincidenciasSplit[i];
        }

        return resultado;
    }

    public int contarCaracteres(){
        int numCaracteres = 0;
        String[][] palabras = getTextMatrix();
        for (String[]palabra : palabras) {
            for (String caracter : palabra) {
                if(caracter != null && !caracter.trim().isEmpty())
                    numCaracteres += caracter.length();
            }
        }
        return numCaracteres;
    }

    public int contarPalabras(){
        int numPalabras = 0;
        String[][] palabras = getTextMatrix();
        for (String[] palabra : palabras) {
            for (String caracter : palabra) {
                if(caracter != null && !caracter.trim().isEmpty())
                    numPalabras+=1;
            }
        }
        return numPalabras;
    }

    public void reemplazarUnaCoincidencia(){
        String[] coincidencias = obtenerCoincidencias();
        String[][] textoMatrix = getTextMatrix();
        int lineaPosition = 0;
        int palabraPosition = 0;
        boolean reemplazado = false;
        for (String coin: coincidencias)
            System.out.println(coin);

        for (String coincidencia: coincidencias)
        {
            for (String[] linea : textoMatrix) {
                for (String palabra : linea) {
                    if (esCoincidencia(palabra, coincidencia)) {
                        reemplazarCoincidenciaPosicion(lineaPosition, palabraPosition);
                        reemplazado = true;
                    }
                    if(reemplazado) break;
                    palabraPosition++;
                }
                if (reemplazado) break;
                lineaPosition++;
            }
            if (reemplazado) break;
        }
    }

    public void menu() {
        while (true) {
            String[] opciones = { "Reemplazar todas las coincidencias", "Reemplazar una coincidencia", "Contar palabras", "Contar Caracteres","Salir" };
            int seleccion = JOptionPane.showOptionDialog(null, "Selecciona una opción:", "Menú de Coincidencias",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

            switch (seleccion) {
                case 0: // Reemplazar todas
                    reemplazarCoincidencias();
                    JOptionPane.showMessageDialog(null, "Coincidencias reemplazadas.");
                    break;

                case 1:  // Reemplazar una
                    System.out.println("Coincidencias");
                    reemplazarUnaCoincidencia();
                    /**
                    String[] coincidencias = obtenerCoincidencias();
                    String seleccionCoincidencia = (String) JOptionPane.showInputDialog(
                            null,
                            "Selecciona la palabra a reemplazar:",
                            "Coincidencias encontradas",
                            JOptionPane.PLAIN_MESSAGE,
                            null,
                            coincidencias,
                            coincidencias[0]);

                    if (seleccionCoincidencia != null) {
                        boolean[][] posiciones = posicionesPalabraCoincidencia();
                        String[][] texto = getTextMatrix();
                        for (int i = 0; i < texto.length; i++) {
                            for (int j = 0; j < texto[i].length; j++) {
                                if (texto[i][j] != null
                                        && texto[i][j].trim().equalsIgnoreCase(seleccionCoincidencia.trim())) {
                                    reemplazarCoincidenciaPosicion(i, j);
                                }
                            }
                        }
                        JOptionPane.showMessageDialog(null,
                                "Coincidencia \"" + seleccionCoincidencia + "\" reemplazada.");
                    }*/
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Número de palabras: " + contarPalabras());
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Número de caracteres: " + contarCaracteres());
                    break;

                case 4: // Salir
                    coincidenciasFile.delete();
                    tempFile.renameTo(coincidenciasFile);
                    JOptionPane.showMessageDialog(null, "Archivo actualizado. Saliendo...");
                    return;

                default:
                    return;
            }
        }
    }
}
