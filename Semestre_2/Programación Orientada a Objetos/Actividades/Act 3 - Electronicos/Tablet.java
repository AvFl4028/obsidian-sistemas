public class Tablet extends Electronicos{
    private int tamanoPantalla;
    Tablet(String nombre, float precio, int tamanoPantalla){
        super(nombre, precio);
        this.tamanoPantalla = tamanoPantalla;
    }

    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Tamaño de pantalla: " + this.tamanoPantalla);
    }
}
