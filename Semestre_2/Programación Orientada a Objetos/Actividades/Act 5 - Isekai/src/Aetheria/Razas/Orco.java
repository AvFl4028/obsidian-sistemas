package Aetheria.Razas;

public class Orco extends CriaturaMagica {
    public Orco(String nombre, char nivel, int energia) {
        super(nombre, nivel, energia, "Orco", 200);
    }

    @Override
    public void habilidadEspecial(CriaturaMagica x) {
        if (energia < 50) {
            System.out.println(nombre + " no tiene energia para usar su habilidad especial");
        } else {
            System.out.println(nombre + " uso su habilidad especial: Berserk");
            x.asumirDanio(200);
        }
    }

    @Override
    public void getRazaInfo() {
        System.out.println("-------------------------------------------");
        System.out.println("La raza Orco son guerreros rudos y resistentes, con una gran lealtad hacia su clan.");
        System.out.println("-------------------------------------------");
    }
}
