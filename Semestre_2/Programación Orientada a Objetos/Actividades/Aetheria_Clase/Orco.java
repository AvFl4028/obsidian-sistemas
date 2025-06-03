/*
Criatura: Orco
Habilidad especial: fuerza bruta(), que le permite realizar ataques devastadores con su
hacha de batalla.
Personalidad: Guerrero rudo y resistente, con una gran lealtad hacia su clan.
*/
public class Orco extends CriaturaMagica {
    public Orco(String nombre, int nivel, int energia) {
        super(nombre, nivel, energia);
    }

    @Override
    public void habilidadEspecial(CriaturaMagica[] colaterales, CriaturaMagica enemigo) {
        System.out.println(nombre + " usa Fuerza Bruta y golpea con su hacha de batalla.");
        energia -= 15;
    }
}