package Aetheria.Razas;

public class Gigante extends CriaturaMagica {
    public Gigante(String nombre, char nivel, int energia) {
        super(nombre, nivel, energia, "Gigante", 500);
    }

    @Override
    public void habilidadEspecial(CriaturaMagica x) {
        if (energia < 50) {
            System.out.println(nombre + " no tiene energia para usar su habilidad especial");
        } else {
            System.out.println(nombre + " uso su habilidad especial 'Golpe sísmico'");
            x.asumirDanio(230);
        }
    }

    @Override
    public void getRazaInfo() {
        System.out.println("-------------------------------------------");
        System.out.println("La raza Gigante son tranquilos y reflexivos, con una gran conexión con la tierra.");
        System.out.println("-------------------------------------------");
    }
}
