import java.util.Random;

// Perro: equilibrio entre velocidad y resistencia
class Perro extends AnimalCorredor {
    public Perro(String nombre) {
        super(nombre, 8, 6);
    }

    @Override
    public void correr() {
        if (energia > 0) {
            distanciaRecorrida += velocidad;
            energia--;
            System.out.println(nombre + " corre de forma constante. Distancia: " + distanciaRecorrida);
        } else {
            System.out.println(nombre + " está cansado y se recupera un poco.");
            energia = resistencia / 2;
        }
    }
}

class Tortuga extends AnimalCorredor {
    public Tortuga(String nombre) {
        super(nombre, 3, 100); // resistencia muy alta
    }

    @Override
    public void correr() {
        distanciaRecorrida += velocidad;
        System.out.println(nombre + " avanza paso a paso. Distancia: " + distanciaRecorrida);
    }
}
