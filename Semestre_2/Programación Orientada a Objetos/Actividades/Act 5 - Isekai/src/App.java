import Aetheria.*;
import Resources.Musica;
import Resources.Screens;

public class App {
    public static void main(String[] args) throws Exception {
        MundoMagico isekai = new MundoMagico();
        Musica.init();
        Screens.title();
        isekai.simulacion();
        // isekai.System();
    }
}
