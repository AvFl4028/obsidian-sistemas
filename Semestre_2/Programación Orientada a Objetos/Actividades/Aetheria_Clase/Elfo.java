/*
 Criatura: Elfo
Habilidad especial: agilidad sobrenatural(), que le permite moverse con rapidez y atacar a
distancia con su arco encantado.
Personalidad: Astuto y sigiloso, experto en camuflaje en la naturaleza.
*/

import java.util.Random;

class Elfo extends CriaturaMagica {
    public Elfo(String nombre, int nivel, int energia) {
        super(nombre, nivel, energia);
    }

    @Override
    public void habilidadEspecial(CriaturaMagica[] colaterales, CriaturaMagica enemigo) {
        Random prob = new Random();
        System.out.println("🏹 " + nombre + " usa Agilidad Sobrenatural y dispara una flecha encantada.");

        if (prob.nextInt(0, 100) > 75) {
            enemigo.energia -= (int) ((float) enemigo.energia * 0.5);
            System.out.println("La flecha dio de lleno al enemigo " + enemigo.getNombre());
        } else {
            System.out.println("Al parecer " + nombre + " tiene miopia porque falló la flecha");
            int ramdom_num = prob.nextInt(0, colaterales.length - 1);
            colaterales[ramdom_num].energia -= (int) ((float) colaterales[ramdom_num].energia * 0.5);
            System.out.println("La flecha dio al colaterial " + colaterales[ramdom_num].getNombre());
        }

        energia -= 10;
    }
}
