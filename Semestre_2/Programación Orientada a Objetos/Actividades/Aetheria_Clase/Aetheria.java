import java.util.Random;
import javax.swing.JOptionPane;

public class Aetheria {
    CriaturaMagica[] criaturines = new CriaturaMagica[5];

    public Aetheria() {
        for (int i = 0; i < criaturines.length; i++) {
            switch (i) {
                case 0 ->
                    criaturines[0] = new Elfo("Arwen", 1, 100);
                case 1 ->
                    criaturines[1] = new Orco("Zuluhed el Demente", 1, 100);
                case 2 ->
                    criaturines[2] = new Hada("Titania", 1, 100, criaturines.length - 2);
                case 3 ->
                    criaturines[3] = new Dragon("Ryujin", 1, 100);
                case 4 ->
                    criaturines[4] = new Gigante("Goliath", 1, 100);
            }
        }
    }

    String muestraArreglo() {
        String salida = "";
        for (CriaturaMagica criaturine : criaturines) {
            if (criaturine != null) {
                salida += criaturine.getNombre() + "\n";
            }
        }
        return salida;
    }

    boolean hayVida() {
        int c = 0;
        for (CriaturaMagica criaturine : criaturines) {
            if (criaturine != null) {
                c++;
            }
        }
        return (c > 1);
    }

    String ganador() {
        String win = "";
        for (CriaturaMagica criaturine : criaturines) {
            if (criaturine != null) {
                win = criaturine.getNombre();
            }
        }
        return win;
    }

    public void batalla() {
        // batalla a muerte
        Random rnd = new Random();
        System.out.println(" Las criaturas mágicas que participaran son " + muestraArreglo());
        while (hayVida()) {
            int a, b;
            do {
                do {
                    a = rnd.nextInt(0, 5);
                    b = rnd.nextInt(0, 5);
                } while (a == b);
            } while (criaturines[a] == null || criaturines[b] == null);
            boolean vida = true;
            while (vida) {
                criaturines[a].atacar(criaturines[b]);
                if (criaturines[a].getEnergia() <= 0) {
                    System.out.println("ha muerto " + criaturines[a].getNombre());
                    criaturines[a] = null;
                    vida = false;
                    criaturines[b].subirNivel();
                } else if (criaturines[b].getEnergia() <= 0) {
                    System.out.println("ha muerto " + criaturines[b].getNombre());
                }
            }
            criaturines[b] = null;
            vida = false;
            criaturines[a].subirNivel();
        }
        JOptionPane.showMessageDialog(null, "El ganador de la batalla a muerte es " + ganador());
        System.out.println();
    }

    public static void main(String[] args) {
        new Aetheria().batalla();
    }
}
