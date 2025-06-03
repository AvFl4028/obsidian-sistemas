import java.util.InputMismatchException;
import java.util.Scanner;

// Simular un cajero automatico que no permita retirar mas dinero del disponible de la cuenta, cuando eso suceda debera lanzar una excepcion que muestre saldo insuficiente

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        Cajero caj = new Cajero(100000);

        System.out.println("Saldo disponible: " + caj.getSaldo());
        try {
            System.out.println("Cuando desea retirar");
            caj.retirar(in.nextDouble());
        } catch (InputMismatchException e) {
            System.out.println("Error en el input");
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Saldo disponible: " + caj.getSaldo());

        in.close();
    }
}
