package Aetheria.Razas;

public class Hada extends CriaturaMagica {
    public Hada(String nombre, char nivel, int energia) {
        super(nombre, nivel, energia, "Hada", 50);
    }

    @Override
    public void habilidadEspecial(CriaturaMagica x) {
        if (energia < 50) {
            System.out.println(nombre + " no tiene energia para usar su habilidad especial");
            return;
        }

        System.out.println(nombre + " uso su habilidad especial 'Magia curativa'");

        recuperarEnergia(MAGIA);
        recuperarVida(MAGIA);
        
        if (party != null) {
            for (CriaturaMagica y : party)
                if (y != null) {
                    y.recuperarEnergia(MAGIA);
                    y.recuperarVida(MAGIA);
                }
        }

        energia -= 50;
        System.out.println(nombre + " pierde 50 energia, le quedan " + energia + " energia");
    }

    @Override
    public void getRazaInfo() {
        System.out.println("-------------------------------------------");
        System.out.println("La raza Hada son alegres y compasivas, con un vínculo especial con la naturaleza");
        System.out.println("-------------------------------------------");
    }
}
