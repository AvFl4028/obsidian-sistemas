import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese contraseña a revisar: ");
        String password = input.nextLine();
        Password pass = new Password();
        System.out.println(pass.checkPassword(password));
        input.close();
    }
}
