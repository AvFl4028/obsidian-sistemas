import javax.swing.JOptionPane;

public class Cadena {

    public static String getCadena(String msg) throws CadenaException {
        String result = JOptionPane.showInputDialog(msg);
        if (result == null)
            throw new CadenaException("Error, la cadena no puede ser null");
        
        if (result.isEmpty()) {
            throw new CadenaException("Error, la cadena no puede estar vacia");
        }
        return result;
    }

    public static int frecuenciaCaracter(char caracter, String msg) {
        int counter = 0;
        for (int i = 0; i < msg.length(); i++)
            if (msg.toCharArray()[i] == caracter)
                counter++;

        return counter;
    }

    public static String eliminarCaracteresNoAlfabeticos(String msg) {
        String result = "";

        char[][] char_alfabeticos = {
                { ' ' },
                {
                        'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
                        'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
                },
                {
                        'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
                        'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
                },
                {
                        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'
                }
        };

        for (int i = 0; i < msg.length(); i++)
            for (char[] cs : char_alfabeticos)
                for (char cs2 : cs)
                    if (msg.toCharArray()[i] == cs2)
                        result += msg.toCharArray()[i];

        return result;
    }

    public static int contarPalabras(String msg) {
        return msg.split(" ").length;
    }

    public static String inicialesPalabra(String msg) {
        String result = "";

        for (String palabra : msg.split(" "))
            result += palabra.toCharArray()[0];

        return result;
    }

    public static boolean sonAnagramas(String msg1, String msg2) {
        if (msg1.length() != msg2.length())
            return false;

        int numCaracteres = msg1.length();
        int count = 0;

        msg1 = msg1.toLowerCase();
        msg2 = msg2.toLowerCase();

        for (char caracter : msg1.toCharArray())
            for (char caracterDos : msg2.toCharArray())
                if (caracter == caracterDos)
                    count++;

        return (count == numCaracteres);
    }

}
