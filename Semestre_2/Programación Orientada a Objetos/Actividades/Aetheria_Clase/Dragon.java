/*
Criatura: Dragón
Habilidad especial: escupir fuego(), que le permite lanzar llamas ardientes a sus enemigos.
Personalidad: Majestuoso y sabio, con un instinto protector hacia su territorio.
*/
class Dragon extends CriaturaMagica {
    CriaturaMagica enemigo;

    public Dragon(String nombre, int nivel, int energia) {
        super(nombre, nivel, energia);
    }

    @Override
    public void habilidadEspecial(CriaturaMagica[] colaterales, CriaturaMagica enemigo) {
        System.out.println("🔥 " + nombre + " escupe fuego y quema a sus enemigos.");
        enemigo.energia = enemigo.energia - 78;
        energia -= 20;
    }
}