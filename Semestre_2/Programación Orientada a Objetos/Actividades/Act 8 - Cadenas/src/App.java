import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println(Cadena.frecuentaCaracter('l', "Hello world"));
        // System.out.println(Cadena.eliminarCaracteresNoAlfabeticos("Nó sé"));
        // System.out.println(Cadena.contarPalabras("No se y tu"));
        // System.out.println(Cadena.inicialesPalabra("No se que hacer y tu?"));
        // System.out.println(Cadena.sonAnagramas("amor", "roma"));

        String frase = "";
        String[] opciones = { "Frecuencia de Caracter", "Eliminar Caracteres No Alfabeticos", "Contar Palabras",
                "Iniciales de Palabras", "¿Es Anagrama?", "Salir" };

        boolean salir = false;
        while (!salir) {
            int opcion = JOptionPane.showOptionDialog(null, "Opciones", "Opciones", 0, JOptionPane.INFORMATION_MESSAGE,
                    null, opciones, null);
            switch (opcion) {
                case 0:
                    try {
                        frase = Cadena.getCadena("Frase");
                        char caracter = Cadena.getCadena("Ingrese un caracter").charAt(0);
                        JOptionPane.showMessageDialog(null, "Frecuencia del caracter '" + caracter + "': "
                                + Cadena.frecuenciaCaracter(caracter, frase));
                    } catch (CadenaException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage());
                    }
                    break;

                case 1:
                    try {
                        frase = Cadena.getCadena("Frase");
                        JOptionPane.showMessageDialog(null, "Cadena sin caracteres no alfabeticos: "
                                + Cadena.eliminarCaracteresNoAlfabeticos(frase));
                    } catch (CadenaException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage());
                    }
                    break;

                case 2:
                    try {
                        frase = Cadena.getCadena("Frase");
                        JOptionPane.showMessageDialog(null, "Número de palabras: " + Cadena.contarPalabras(frase));
                    } catch (CadenaException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage());
                    }
                    break;

                case 3:
                    try {
                        frase = Cadena.getCadena("Frase");
                        JOptionPane.showMessageDialog(null,
                                "Iniciales de cada palabra: " + Cadena.inicialesPalabra(frase));
                    } catch (CadenaException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage());
                    }
                    break;

                case 4:
                    try {
                        frase = Cadena.getCadena("Frase");
                        String frase2 = Cadena.getCadena("Frase");
                        JOptionPane.showMessageDialog(null,
                                Cadena.sonAnagramas(frase, frase2) ? "Es anagrama" : "No es anagrama");
                    } catch (CadenaException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage());
                    }
                    break;

                case 5:
                    salir = true;
                    break;

                default:
                    break;
            }
        }
    }
}
