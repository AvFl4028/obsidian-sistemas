package Aetheria.Razas;

public class Dragon extends CriaturaMagica {
    public Dragon(String nombre, char nivel, int energia) {
        super(nombre, nivel, energia, "Dragon", 1000);
    }

    @Override
    public void habilidadEspecial(CriaturaMagica x) {
        if (energia < 50) {
            System.out.println(nombre + " no tiene energia para usar su habilidad especial");
        } else {
            System.out.println(nombre + " uso su habilidad especial 'Escupir fuego'");
            x.asumirDanio(2000);
        }
    }

    @Override
    public void getRazaInfo() {
        System.out.println("-------------------------------------------");
        System.out.println("La raza Dragon son majestuosos y sabios, con un instinto protector hacia su territorio.");
        System.out.println("-------------------------------------------");
    }
}
