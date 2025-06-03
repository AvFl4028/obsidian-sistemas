
// Clase base abstracta para todas las criaturas mágicas
import java.util.Random;

abstract class CriaturaMagica {
    protected String nombre;
    protected int nivel;
    protected int energia;

    public CriaturaMagica(String nombre, int nivel, int energia) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.energia = energia;
    }

    public void atacar(CriaturaMagica enemigo) {
        CriaturaMagica[] otros = new CriaturaMagica[5];
        Random rnd = new Random();
        int hEspecial = rnd.nextInt(1, 4);
        if (hEspecial == 2)
            enemigo.habilidadEspecial(otros, enemigo);
        else if (hEspecial == 1)
            habilidadEspecial(otros, enemigo);

        // generar aleatorio para activar habilidad especial
        if (rnd.nextInt(1000) % 2 != 0)

        { // enemigo gana
            this.energia -= rnd.nextInt(20);
            // enemigo.defender();
        } else {
            enemigo.energia -= rnd.nextInt(20);
            // this.defender();
        }
    }

    public void defender() {
        System.out.println(nombre + " se defiende del ataque enemigo.");
    }

    public void subirNivel() {
        nivel++;
        energia += 10;
        System.out.println(nombre + " ha subido al nivel " + nivel + " y recuperó energía.");
    }

    void agregaEnergia(int energia) {
        this.energia += energia;
    }

    int getEnergia() {
        return energia;
    }

    String getNombre() {
        return nombre;
    }

    // Método abstracto que será implementado por cada criatura
    public abstract void habilidadEspecial(CriaturaMagica[] colaterales, CriaturaMagica enemigo);
}
