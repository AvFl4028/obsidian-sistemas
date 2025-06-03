package Aetheria.Razas;

public class Elfo extends CriaturaMagica {
    public Elfo(String nombre, char nivel, int energia) {
        super(nombre, nivel, energia, "Elfo", 150);
    }

    @Override
    // TODO - Habilidad del elfo del codigo de la maestra
    public void habilidadEspecial(CriaturaMagica x) {
        if (energia < 50) {
            System.out.println(nombre + " no tiene energia para usar su habilidad especial");
        } else {
            System.out.println(nombre + " uso su habilidad especial: 'Agilidad Sobrenatural'");
            x.asumirDanio(200);
        }
    }

    @Override
    public void getRazaInfo() {
        System.out.println("-------------------------------------------");
        System.out.println("La raza Elfo son astutos y sigilosos, expertos en camuflaje en la naturaleza.");
        System.out.println("-------------------------------------------");
    }
}
