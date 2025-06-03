package Aetheria;

import Resources.Card;
import Resources.Console;
import Resources.Screens;
import Aetheria.Razas.*;
import Aetheria.Razas.Campeones.CampeonDragon;
import Aetheria.System.SOLO;

import java.util.Random;
// import java.util.Scanner;
import java.util.Scanner;

public class MundoMagico {
    private final String[] BIOMAS = { "Bosque de Luthien 🌿🌳", "Montañas de Kragor 🏔️⚔️", "Bosque de Ilveris ✨🧚",
            "Tierras de Skar 🌋🔥", "Cumbres de Asgard ❄️🗻" };
    private Scanner wait = new Scanner(System.in);

    private Random x;

    private Elfo Elfos[];
    private Dragon Dragones[];
    private Hada Hadas[];
    private Orco Orcos[];
    private Gigante Gigantes[];
    private CriaturaMagica POBLACION[][];

    private final int MAX_POBLACION = 10;
    private final int RAZAS = 5;

    public MundoMagico() {

        x = new Random();

        Elfos = new Elfo[MAX_POBLACION];
        Dragones = new Dragon[MAX_POBLACION];
        Hadas = new Hada[MAX_POBLACION];
        Orcos = new Orco[MAX_POBLACION];
        Gigantes = new Gigante[MAX_POBLACION];
        POBLACION = new CriaturaMagica[RAZAS][MAX_POBLACION];

        POBLACION[0] = Elfos;
        POBLACION[1] = Dragones;
        POBLACION[2] = Hadas;
        POBLACION[3] = Orcos;
        POBLACION[4] = Gigantes;
    }

    public void simulacion() {

        int ticks = x.nextInt(0, 100);

        Card.SimpleCard("La simulación tendra una duración de " + ticks + " ticks");
        Card.SimpleCard("Generando población de la simulación...");
        generarPoblacion();

        Card.SimpleCard("Iniciando simulación...");

        while (ticks-- > 0) {
            acciones(x.nextInt(0, 4), POBLACION[x.nextInt(0, RAZAS - 1)][x.nextInt(0, MAX_POBLACION - 1)]);
            wait.nextLine();
        }
    }

    private void generarPoblacion() {
        for (int i = 0; i < MAX_POBLACION; i++) {
            Elfos[i] = new Elfo(generarNombres(), (char) 0, x.nextInt(1000));
            Dragones[i] = new Dragon(generarNombres(), (char) 0, x.nextInt(1000));
            Hadas[i] = new Hada(generarNombres(), (char) 0, x.nextInt(1000));
            Orcos[i] = new Orco(generarNombres(), (char) 0, x.nextInt(1000));
            Gigantes[i] = new Gigante(generarNombres(), (char) 0, x.nextInt(1000));
        }
        Card.WaitCard("Poblacion generada con exito");
    }

    private String generarNombres() {
        final int MAX_NOMBRE_LARGO = 10;
        String nombre = "";

        char[] abecedario = {
                'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
                'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
        };

        char[] abecedarioMinusculas = {
                'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
                'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
        };

        char[][] letras = { abecedario, abecedarioMinusculas };

        for (int i = 0; i < MAX_NOMBRE_LARGO; i++) {
            nombre += letras[x.nextInt(0, letras.length - 1)][x.nextInt(0, abecedario.length - 1)];
        }

        return nombre;
    }

    private CriaturaMagica getRandomEnemigo(CriaturaMagica excepcion) {
        Random x = new Random();
        CriaturaMagica enemigo = new Elfo("", (char) 0, 0);

        do {
            enemigo = POBLACION[x.nextInt(0, RAZAS - 1)][x.nextInt(0, MAX_POBLACION - 1)];
        } while (enemigo.getClass() == excepcion.getClass() && enemigo.estaVivo());
        return enemigo;
    }

    public void System() {
        SOLO system = new SOLO();
        CampeonDragon boss = new CampeonDragon();
        generarPoblacion();
        peleaPlayer(system, boss);
        if (system.getPlayer().estaVivo())
            Screens.Win();
        else {
            Card.SimpleCard("System: El jugador a muerto...");
            Console.WaitLine();
            Card.SimpleCard("System: ...o no?");
            Console.Wait(500);
            Card.SimpleCard("System: Se ha desbloqueado la habilidad clase SSS 'Corazón negro'");
            String opciones[] = { "Si", "No" };
            if (Card.InputOpcionCard("System: ¿Deseas activar la habilidad 'Corazón negro'?", opciones) - 1 == 0) {
                system.habilidadSSS();
                peleaPlayer(system, boss);
                if (system.getPlayer().estaVivo())
                    Screens.Win();
                else
                    Screens.Lose();
            }
        }
    }

    private void peleaPlayer(SOLO system, CriaturaMagica x) {
        while (system.getPlayer().estaVivo()) {
            // system.acciones(getRandomEnemigo(system.getPlayer()));
            system.acciones(x);
            if (x.estaVivo())
                x.atacar(system.getPlayer());
            else
                break;
        }

    }

    private void acciones(int x, CriaturaMagica y) {
        String bioma = "";
        if (y.getClass() == Elfo.class)
            bioma = BIOMAS[0];
        if (y.getClass() == Orco.class)
            bioma = BIOMAS[1];
        if (y.getClass() == Hada.class)
            bioma = BIOMAS[2];
        if (y.getClass() == Dragon.class)
            bioma = BIOMAS[3];
        if (y.getClass() == Gigante.class)
            bioma = BIOMAS[4];
        Card.SimpleCard("La acción se desarrolla en el bioma de " + bioma);
        switch (x) {
            case 0:
                y.atacar(getRandomEnemigo(y));
                break;
            case 1:
                y.habilidadEspecial(getRandomEnemigo(y));
                break;
            case 2:
                y.aliarse(getRandomEnemigo(y));
                break;
            case 3:
                y.recuperarEnergia(CriaturaMagica.DESCANSO);
                y.recuperarVida(CriaturaMagica.DESCANSO);
                break;
            case 4:
                Card.SimpleCard(y.getNombre() + " encontro un artefacto mágico");
            default:
                break;
        }
    }
}

// public class MundoMagico {
// private final String[] BIOMAS = { "Bosque de Luthien 🌿🌳", "Montañas de
// Kragor 🏔️⚔️", "Bosque de Ilveris ✨🧚",
// "Tierras de Skar 🌋🔥", "Cumbres de Asgard ❄️🗻" };
// private Scanner wait = new Scanner(System.in);
// public void simulacion() {
// Random x = new Random();
// int ticks = x.nextInt(0, 100);
// CriaturaMagica[] poblacion = new CriaturaMagica[10];
// CriaturaMagica[] razas = {
// new Elfo("" + x.nextInt(1000000000), (char) x.nextInt(0, 255), x.nextInt(0,
// 100)),
// new Orco("" + x.nextInt(1000000000), (char) x.nextInt(0, 255), x.nextInt(0,
// 100)),
// new Hada("" + x.nextInt(1000000000), (char) x.nextInt(0, 255), x.nextInt(0,
// 100)),
// new Dragon("" + x.nextInt(1000000000), (char) x.nextInt(0, 255), x.nextInt(0,
// 100)),
// new Gigante("" + x.nextInt(1000000000), (char) x.nextInt(0, 255),
// x.nextInt(0, 100))
// };
// System.out.println("-------------------------------------------");
// System.out.println("La simulación se hara en el bioma '" +
// BIOMAS[x.nextInt(0, BIOMAS.length - 1)] + "'");
// System.out.println(
// "La simulación va a durar " + ticks + " ticks o " + ticks * poblacion.length
// + " turnos generales");
// System.out.println("-------------------------------------------");
// for (int criatura = 0; criatura < poblacion.length; criatura++) {
// poblacion[criatura] = razas[x.nextInt(0, razas.length - 1)];
// // poblacion[criatura].getInfo();
// }
// System.out.println("Enter para continuar");
// wait.nextLine();
// while (ticks > 0) {
// for (int criatura = 0; criatura < poblacion.length; criatura++) {
// if (poblacion[criatura].estaVivo()) {
// acciones(
// x.nextInt(0, 5),
// poblacion[criatura],
// getEnemigo(poblacion, poblacion[criatura]));
// System.out.println("Enter para continuar");
// wait.nextLine();
// }
// // Solo funciona el thread cuando esta en la funcion main
// // Thread.sleep(1000);
// }
// ticks--;
// }
// }
// private CriaturaMagica getEnemigo(CriaturaMagica[] poblacion, CriaturaMagica
// excepcion) {
// Random x = new Random();
// CriaturaMagica enemigo = new Elfo("", (char) 0, 0);
// do {
// enemigo = poblacion[x.nextInt(0, poblacion.length - 1)];
// } while (enemigo == excepcion);
// return enemigo;
// }
// private void acciones(int x, CriaturaMagica y, CriaturaMagica z) {
// System.out.println("-----------------------------------------------");
// switch (x) {
// case 0:
// y.atacar(z);
// break;
// case 1:
// y.defender(z);
// case 2:
// y.habilidadEspecial();
// case 3:
// y.aliarse(z);
// case 4:
// y.recuperarEnergia(CriaturaMagica.DESCANSO);
// case 5:
// System.out.println(y.getNombre() + " encontro un artefacto mágico");
// default:
// break;
// }
// System.out.println("-----------------------------------------------");
// }
// }
