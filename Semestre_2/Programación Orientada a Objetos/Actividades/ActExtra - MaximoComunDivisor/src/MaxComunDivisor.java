public class MaxComunDivisor {
    private int num1;
    private int num2;

    public MaxComunDivisor(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public int comunDivisor(){
        int residuo = num1 % num2;

        if (residuo != 0) {
            num1 = num2;
            num2 = residuo;
            comunDivisor();
        }

        return num2;
    }
}
