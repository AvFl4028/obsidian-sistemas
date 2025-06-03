import java.util.Random;

public final class Juego {
    private int numero;

    public Juego() {
        Random rd = new Random();
        numero = rd.nextInt(0, 10);
    }

    public boolean revisarNumero(int numero) throws ExcepcionJuego {
        if (this.numero > numero)
            throw new ExcepcionJuego("El número es menor que el número secreto");

        if (this.numero < numero)
            throw new ExcepcionJuego("El número es mayor que el número secreto");

        return true;
    }
}
