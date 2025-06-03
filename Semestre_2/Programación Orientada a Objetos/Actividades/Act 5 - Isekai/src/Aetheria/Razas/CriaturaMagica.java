package Aetheria.Razas;

import java.util.Random;
import Resources.Card;
import Resources.Console;

public abstract class CriaturaMagica {
    protected String nombre;

    protected char nivel;

    protected int energia;
    private final int MAX_ENERGIA;
    private final int MAX_VIDA;
    protected int vida;
    protected int ataque;

    private boolean estaVivo = true;

    protected CriaturaMagica[] party;
    protected int aliados = -1;

    public static final int DESCANSO = 0;
    public static final int MAGIA = 1;

    CriaturaMagica(String nombre, char nivel, int energia, String raza, int vida) {
        this.nombre = nombre + "(" + raza + ")";
        this.nivel = nivel;
        this.MAX_ENERGIA = energia;
        this.MAX_VIDA = vida;
        this.energia = energia;
        this.vida = vida;
        ataque = (energia + vida * nivel);
    }

    public void subirDeNivel() {
        ++nivel;
        energia = (int) (energia * (1.5));
        vida = (int) (vida * (2));
        Card.SimpleCard(nombre + " subio a nivel: " + (int) nivel + "\n" + nombre + " aumento de energia a " + energia);
    }

    public void atacar(CriaturaMagica x) {
        if (!esAliado(x)) {
            System.out.println(nombre + " ataco a " + x.getNombre());
            if (!x.estaVivo()) {
                System.out.println(x.getNombre() + " ya no esta con vida");
            } else if (!x.defender()) {
                x.asumirDanio(ataque);
                if (!x.estaVivo())
                    subirDeNivel();
            }
        } else
            System.out.println("No se puede atacar a un aliado");
    };

    private boolean esAliado(CriaturaMagica x) {
        if (party != null) {
            for (CriaturaMagica z : party)
                if (z == x)
                    return true;
        }
        return false;
    }

    protected void asumirDanio(int ataque) {
        Card.SimpleCard(nombre + " asumio un daño de " + ataque);

        if (ataque >= vida) {
            Card.SimpleCard(nombre + " a sido asesinado");
            vida = 0;
            estaVivo = false;
        } else {
            int vida_anterior = vida;
            vida -= ataque;
            Card.SimpleCard(nombre + " paso de tener " + vida_anterior + " vida a " + vida + " vida");
        }
    }

    public boolean defender() {
        Random prob = new Random();
        boolean prob_def = false;
        if (prob.nextInt(0, 100) > 65) {
            Card.SimpleCard(nombre + " se defendio del ataque");
            prob_def = true;
        }
        return prob_def;
    };

    public abstract void habilidadEspecial(CriaturaMagica x);

    public int getAtaque() {
        return ataque;
    }

    public void aliarse(CriaturaMagica x) {
        if (party == null)
            party = new CriaturaMagica[10];

        ++aliados;

        if (aliados < 10) {
            Card.SimpleCard(nombre + " se alio con " + x.getNombre());
            party[aliados] = x;
        } else {
            Card.SimpleCard(nombre + " ¡alcanzo el máximo de aliados permitos!\n" + nombre + " no pudo aliarse con "
                    + x.getNombre());
        }
    }

    public void recuperarEnergia(int metodo) {
        switch (metodo) {
            case DESCANSO:
                if (energia < MAX_ENERGIA)
                    energia += 10;
                if (energia > MAX_ENERGIA)
                    energia = MAX_ENERGIA;
                System.out.println("Se recupero energía por descanzo a " + nombre);
                System.out.println("Ahora tiene " + energia);
                break;
            case MAGIA:
                energia = MAX_ENERGIA;
                System.out.println("Se recupero energía por magia a " + nombre);
                System.out.println("Ahora tiene " + energia);
                break;
            default:
                break;
        }
    }

    public void recuperarVida(int metodo) {
        estaVivo = true;
        switch (metodo) {
            case DESCANSO:
                if (vida < MAX_VIDA)
                    vida += 10;
                if (vida > MAX_VIDA)
                    vida = MAX_VIDA;
                System.out.println("Se recupero vida por descanzo a " + nombre);
                System.out.println("Ahora tiene " + vida);
                break;
            case MAGIA:
                vida = MAX_VIDA;
                System.out.println("Se recupero vida por magia a " + nombre);
                System.out.println("Ahora tiene " + vida);
                break;
            default:
                break;
        }
    }

    public void explorar() {
        String eventos[] = { nombre + " encontro una reliquia magica", nombre + " se cayo",
                nombre + " encontro unas ruinas antiguas", nombre + " tiene sueño" };
        Random x = new Random();
        Card.SimpleCard(eventos[x.nextInt(0, eventos.length - 1)]);
    }

    public String getNombre() {
        return nombre;
    }

    public void getInfo() {
        Card.SimpleCard(
                "Nombre: " + nombre + "\nAtaque: " + ataque + "\nEnergia: " + energia + "\nNivel: " + (int) nivel);
    }

    public abstract void getRazaInfo();

    public boolean estaVivo() {
        return this.estaVivo;
    }

    public void new_stats(char nivel){
        for (int i = (int)this.nivel; i < (int)nivel; i++) {
            subirDeNivel();
            Console.Wait(5);
        }
    }
}