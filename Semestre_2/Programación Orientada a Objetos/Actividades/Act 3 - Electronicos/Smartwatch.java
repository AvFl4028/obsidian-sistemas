public class Smartwatch extends Electronicos {
    private int bateria;
    private float frecuenciaCardiaca;
    private int cantidadDePasos;

    Smartwatch(String nombre, float precio, float frecuenciaCardiaca, int cantidadDePasos, int bateria){
        super(nombre, precio);
        this.frecuenciaCardiaca = frecuenciaCardiaca;
        this.cantidadDePasos = cantidadDePasos;
        this.bateria = bateria;
    }

    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Frecuencia cardiaca: " + this.frecuenciaCardiaca + "\nPasos: " + this.cantidadDePasos + "\nBateria: " + this.bateria + "mA");
    }
}
