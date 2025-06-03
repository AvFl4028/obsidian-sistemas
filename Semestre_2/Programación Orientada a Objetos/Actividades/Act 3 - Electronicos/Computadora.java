public class Computadora extends Electronicos {
    protected String modelo;

    Computadora(String nombre, float precio, String modelo) {
        super(nombre, precio);
        this.modelo = modelo;
    }

    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println(modelo);
    }

}
