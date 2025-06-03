package Aetheria.System;

import Resources.Console;
import Resources.Screens;
import Aetheria.Razas.*;
import Resources.Card;

public class SOLO {
    private CriaturaMagica player;

    public SOLO() {
        createPlayer();
    }

    public void acciones(CriaturaMagica x) {
        Console.WaitLine();
        Console.clean();
        Screens.title();
        Card.SimpleCard("Acciones disponibles");
        String accion[] = { "Atacar", "Explorar", "Descansar", "Habilidad Especial" };
        switch (Card.InputOpcionCard(accion)) {
            case 1:
                player.atacar(x);
                break;
            
            case 2:
                player.explorar();
                break;
            case 3:
                player.recuperarEnergia(CriaturaMagica.DESCANSO);
                player.recuperarVida(CriaturaMagica.DESCANSO);
                break;
            case 4:
                player.habilidadEspecial(x);
                break;

            default:
                break;
        }
    }

    public CriaturaMagica getPlayer() {
        return player;
    }

    public void createPlayer() {
        String nombre = Card.InputCard("Escribe un nombre para tu jugador");
        int opcion = Integer.parseInt(Card.InputCard(
                "Escoje una raza para tu jugador:\n" +
                        "1. Elfo                                 2. Orco\n" +
                        "3. Dragon                               4. Gigante\n" +
                        "5. Hada\n"));
        switch (opcion) {
            case 1:
                player = new Elfo(nombre, (char) 0, 300);
                break;
            case 2:
                player = new Orco(nombre, (char) 0, 100);
                break;
            case 3:
                player = new Dragon(nombre, (char) 0, 1000);
                break;
            case 4:
                player = new Gigante(nombre, (char) 0, 50);
                break;
            case 5:
                player = new Hada(nombre, (char) 0, 500);
                break;

            default:
                Card.SimpleCard("Escribe un número aceptable");
                createPlayer();
                break;
        }
        player.getInfo();
        Card.SimpleCard("Bienvenido Jugador o deberia llamarte " + player.getNombre() + "?");
    }

    public void habilidadSSS(){
        player.recuperarEnergia(CriaturaMagica.MAGIA);
        player.recuperarVida(CriaturaMagica.MAGIA);
        player.new_stats((char)200);
    }
}
