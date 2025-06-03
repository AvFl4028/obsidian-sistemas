/**
 * Elaborar un programa con un metodo que
 */

public class App {
    public static void main(String[] args) throws Exception {
        Matricula matr = new Matricula();
        System.out.println("TEST");
        String matricula = "333aaa";
        System.out.println("Matricula: " + matricula);
        System.out.println(matr.revisar(matricula));
        System.out.println();

        matricula = "ABC123";
        System.out.println("Matricula: " + matricula);
        System.out.println(matr.revisar(matricula));
        System.out.println();

        matricula = "A1C321";
        System.out.println("Matricula: " + matricula);
        System.out.println(matr.revisar(matricula));
        System.out.println();

        matricula = "312ABD";
        System.out.println("Matricula: " + matricula);
        System.out.println(matr.revisar(matricula));
        System.out.println();

        matricula = "AAA3";
        System.out.println("Matricula: " + matricula);
        System.out.println(matr.revisar(matricula));
    }
}
