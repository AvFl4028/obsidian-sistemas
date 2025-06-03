
import MatriculaException.MatriculaSizeException;
import MatriculaException.NoTieneLetrasException;
import MatriculaException.NoTieneNumerosException;

public class Matricula {
    private final int MATRICULA_SIZE = 6;

    public String revisar(String msg) {
        String err = "";

        try {
            matriculaSize(msg);
        } catch (MatriculaSizeException e) {
            err += e.getMessage() + "\n";
        }

        try {
            tieneLetras(msg);
        } catch (NoTieneLetrasException e) {
            err += e.getMessage() + "\n";
        }

        try {
            tieneNumeros(msg);
        } catch (NoTieneNumerosException e) {
            err += e.getMessage() + "\n";
        }

        if (!err.isEmpty())
            return err;
        return "La matricula es correcta";
    }

    private void matriculaSize(String msg) throws MatriculaSizeException {
        if (msg.length() > MATRICULA_SIZE)
            throw new MatriculaSizeException("La matricula esta muy larga");
        if (msg.length() < MATRICULA_SIZE)
            throw new MatriculaSizeException("La matricula esta muy corta");
    }

    private void tieneNumeros(String msg) throws NoTieneNumerosException {
        char[] numeros = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
        if (msg.length() < MATRICULA_SIZE)
            throw new NoTieneNumerosException("No tiene numeros en la posicion correcta");
        boolean valido = false;

        for (int i = 3; i < MATRICULA_SIZE; i++) {
            for (char c : numeros) {
                if (c == msg.toCharArray()[i]) {
                    valido = true;
                    break;
                } else
                    valido = false;
            }
            if (!valido)
                throw new NoTieneNumerosException("No tiene los 3 numeros o no estan en la posicion adecuada");
        }
    }

    private void tieneLetras(String msg) throws NoTieneLetrasException {
        if (msg.length() < MATRICULA_SIZE)
            throw new NoTieneLetrasException("No tiene las letras en MAYUSCULA en posicion adecuada ");

        char[] letrasMayusculas = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ".toCharArray();
        boolean valido = false;
        for (int i = 0; i < 3; i++) {
            for (char c : letrasMayusculas) {
                if (c == msg.toCharArray()[i]) {
                    valido = true;
                    break;
                } else
                    valido = false;
            }
            if (!valido)
                throw new NoTieneLetrasException(
                        "No tiene las suficientes letras en MAYUSCULA o no estan en la posicion adecuada");
        }
    }
}
