public class Password {
    public String checkPassword(String password) {
        String errores = "";
        try {
            passwordLength(password);
        } catch (LengthPasswordException e) {
            errores += e.getMessage() + "\n";
        }

        try {
            tieneNumero(password);
        } catch (NoTieneNumeroException e) {
            errores += e.getMessage() + "\n";
        }

        try {
            tieneCaracterEspecial(password);
        } catch (SpecialCharacterException e) {
            errores += e.getMessage() + "\n";
        }

        try {
            tieneMayuscula(password);
        } catch (NoIniciaMayusculaException e) {
            errores += e.getMessage() + "\n";
        }
        return (errores.length() != 0) ?  errores : "Contraseña Correcta";
    }

    private void tieneNumero(String password) throws NoTieneNumeroException {
        char[] numeros = "0123456789".toCharArray();
        boolean tieneNumero = false;

        for (char numero : numeros)
            for (char letra : password.toCharArray())
                if (numero == letra) {
                    tieneNumero = true;
                    break;
                }
        if (!tieneNumero)
            throw new NoTieneNumeroException("La contraseña no tiene número");
    }

    private void tieneCaracterEspecial(String password) throws SpecialCharacterException {
        char[] caracteresEspeciales = {
                '!', '@', '#', '$', '%', '^', '&', '*', '(', ')',
                '-', '_', '+', '=', '{', '}', '[', ']', ':', ';',
                '"', '\'', '<', '>', ',', '.', '?', '/', '\\', '|', '~'
        };
        for (char especial : caracteresEspeciales)
            for (char letra : password.toCharArray())
                if (letra == especial)
                    throw new SpecialCharacterException("No se pueden tener caracteres especiales: " + especial);
    }

    private void tieneMayuscula(String password) throws NoIniciaMayusculaException {
        char[] letrasMayusculas = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ".toCharArray();

        for (char caracter : letrasMayusculas)
            if (password.toCharArray()[0] == caracter)
                return;

        throw new NoIniciaMayusculaException("La contraseña no inicia con mayuscula");
    }

    private boolean passwordLength(String password) throws LengthPasswordException {
        if (password.length() < 8)
            throw new LengthPasswordException("La contraseña es corta");
        return true;
    }
}
