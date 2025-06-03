package actividad;
// TODO - Añadir para tener más pedidos
// TODO - En esta clase se realizan los pedidos

import javax.swing.JOptionPane;

public class Cafecito {

    // Numero maximo de pedidos que se pueden hacer
    private final int MAX_MESAS = 10;
    boolean salir = false;

    private Mesa[] mesas = new Mesa[MAX_MESAS];

    public Cafecito() {
        for (int i = 0; i < MAX_MESAS; i++) {
            mesas[i] = new Mesa();
        }
    }

    public void menu() {
        while (!salir) {
            String[] totalMesas = new String[MAX_MESAS + 1];
            for (int i = 0; i < MAX_MESAS; i++)
                totalMesas[i] = "Mesa " + (i + 1);

            totalMesas[MAX_MESAS] = "Salir";
            int opcion = JOptionPane.showOptionDialog(null, "Todas las mesas", "Cafecito", 0,
                    JOptionPane.INFORMATION_MESSAGE, null, totalMesas, 0);

            if (opcion == MAX_MESAS)
                salir = true;
            else
                mesas[opcion].menu(totalMesas[opcion]);
        }
    }

    public static void main(String[] args) {
        Cafecito cafe = new Cafecito();
        cafe.menu();
    }
}