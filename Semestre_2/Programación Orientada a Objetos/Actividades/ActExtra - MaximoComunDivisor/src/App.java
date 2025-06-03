public class App {
    public static void main(String[] args) throws Exception {
        // Resultado esperado: 12
        MaxComunDivisor divisor = new MaxComunDivisor(1032, 180);
        System.out.println(divisor.comunDivisor());

        // Resultado esperado: 3
        divisor = new MaxComunDivisor(57, 12);
        System.out.println(divisor.comunDivisor());
    }
}
