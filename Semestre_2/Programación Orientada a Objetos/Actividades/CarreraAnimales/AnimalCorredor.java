abstract class AnimalCorredor {
    protected String nombre;
    protected int velocidad;
    protected int resistencia;
    protected int energia;
    protected int distanciaRecorrida = 0;

    public AnimalCorredor(String nombre, int velocidad, int resistencia) {
        this.nombre = nombre;
        this.velocidad = velocidad;
        this.resistencia = resistencia;
        this.energia = resistencia;
    }

    public abstract void correr();

    public int getDistanciaRecorrida() {
        return distanciaRecorrida;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean haLlegado(int meta) {
        return distanciaRecorrida >= meta;
    }
}
