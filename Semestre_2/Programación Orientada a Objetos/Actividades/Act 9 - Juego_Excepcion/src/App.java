// Crear un juego donde un jugador intenta adivinar un numero secreto. El juego lanza 2 excepciones de retroalimentacion, la primera excepcion lanzada es de numero demasiado bajo y la segunda excepcion numero demasiado alto, el programa termina cuando el usuario adivina el numero secreto (aleatorio)

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Juego game = new Juego();
        Scanner input = new Scanner(System.in);
        boolean ganar = false;

        System.out.println("Numero secreto: Ingresa un numero del 1 al 10");

        while (!ganar) {
            try {
                ganar = game.revisarNumero(input.nextInt());
            } catch (ExcepcionJuego e) {
                System.out.println(e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("Ingresa un número valido");
            }
        }

        System.out.println("Ganaste!");
        input.close();
    }
}
