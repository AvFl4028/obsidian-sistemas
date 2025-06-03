/*
Criatura: Hada
Habilidad especial: magia curativa(), que le permite restaurar la salud de sus aliados con
polvo de estrellas.
Personalidad: Alegre y compasiva, con un vínculo especial con la naturaleza.
*/
class Hada extends CriaturaMagica {
CriaturaMagica []aliados;
public Hada(String nombre, int nivel, int energia, int nAliados) {
super(nombre, nivel, energia);
aliados=new CriaturaMagica[nAliados];
}
@Override
public void habilidadEspecial(CriaturaMagica []colaterales, CriaturaMagica enemigo) {
for (CriaturaMagica aliado : aliados) {
aliado.agregaEnergia(13);
}
System.out.println( nombre + " usa Magia Curativa y restaura la energía de sus aliados.");
}
}
