/*
Habilidad especial: golpe sísmico(), que le permite golpear el suelo con fuerza y causar temblores.
Personalidad: Tranquilo y reflexivo, con una gran conexión con la tierra.
*/
class Gigante extends CriaturaMagica {
public Gigante(String nombre, int nivel, int energia) {
super(nombre, nivel, energia);
}
@Override
public void habilidadEspecial(CriaturaMagica []colaterales, CriaturaMagica enemigo) {
System.out.println( nombre + " usa Golpe Sísmico y sacude el suelo, causando temblores.");
energia -= 15;
}
}
