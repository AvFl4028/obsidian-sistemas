import java.util.Random;

class Liebre extends AnimalCorredor {
    private Random rand = new Random();

    public Liebre(String nombre) {
        super(nombre, 12, 5);
    }

    @Override
    public void correr() {
        if (rand.nextDouble() < 0.2) {
            System.out.println(nombre + " decidió descansar por confianza...");
            return;
        }
        if (energia > 0) {
            distanciaRecorrida += velocidad;
            energia--;
            System.out.println("🐰" + nombre + " salta velozmente. Distancia: " + distanciaRecorrida);
        } else {
            System.out.println("🐰" + nombre + " está cansada y se relaja.");
            energia = resistencia / 2;
        }
    }
}
