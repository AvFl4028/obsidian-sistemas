import java.util.Random;

class Gato extends AnimalCorredor {
    private Random rand = new Random();

    public Gato(String nombre) {
        super(nombre, 10, 4);
    }

    @Override
    public void correr() {
        if (rand.nextDouble() < 0.3) {
            System.out.println(nombre + " se distrajo mirando una mariposa 🦋.");
            return;
        }
        if (energia > 0) {
            distanciaRecorrida += velocidad;
            energia--;
            System.out.println("🐱" + nombre + " corre ágilmente. Distancia: " + distanciaRecorrida);
        } else {
            System.out.println("🐱" + nombre + " se estira y descansa un momento.");
            energia = resistencia / 2;
        }
    }
}
