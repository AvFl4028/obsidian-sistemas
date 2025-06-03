// Simulación de carrera
public class CarreraAnimales {
    public static void main(String[] args) {
        int meta = 100;
        AnimalCorredor[] corredores = {
                new Perro("Callie"),
                new Gato("Pancho"),
                new Liebre("Lola la trailera"),
                new Tortuga("rapida y furiosa")
        };
        boolean carreraTerminada = false;
        int turno = 1;
        System.out.println(" ¡Comienza la carrera de animales!\n");
        while (!carreraTerminada) {
            System.out.println("=== Turno " + turno + " ===");
            for (AnimalCorredor corredor : corredores) {
                corredor.correr();
            }
            System.out.println();

            for (AnimalCorredor corredor : corredores) {
                if (corredor.haLlegado(meta)) {
                    System.out.println(corredor.getNombre() + " ha cruzado la meta con " +
                            corredor.getDistanciaRecorrida() + " metros!");
                    carreraTerminada = true;
                }
            }
            turno++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
        System.out.println("\n ¡Carrera finalizada!");
    }
}
