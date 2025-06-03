import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static String posicionArreglo(String[] arr, int position) {
        try {
            estaDesbordado(arr, position);
            return arr[position];
        } catch (DesbordamientoException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return "";
    }

    public static void estaDesbordado(String[] arr, int position) throws DesbordamientoException {
        if (!(arr.length > position)) {
            throw new DesbordamientoException("El numero es mas grande que las posiciones disponibles");
        }
    }

    public static void numeroGrande(int num) throws InputMismatchException {
        if (num > 100000) {
            throw new InputMismatchException("El numero es demasiado grande");
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int num = 0;
        try {
            num = input.nextInt();
            numeroGrande(num);
        } catch (InputMismatchException x) {
            System.out.println("El numero es demasiado grande");
        }
        String[] arr = { "no se", "n", "m", "x", "x" };
        System.out.println(posicionArreglo(arr, num));
        input.close();
    }
}
