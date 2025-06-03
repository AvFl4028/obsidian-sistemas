// Desarrolle un programa que envie diferentes tipos de notificaciones (SMS, correo electronico, push)
// Las notificaciones en general tienen destinario y un metodo polimorfico enviar
// Cada subclase debe agregar atributos adicionales por ejemplo: asunto, numero de telefono, dispositivo, etc.
// Cree un metodo llamado procesarNotificaciones (lista notificaciones) el metodo debera llamar al metodo enviar para cada uno (aplicando polimorfismo)

import Notis.*;

public class App {
    public static void main(String[] args) throws Exception {
        Notificacion[] notis = {
                new SMS("Juan", "2711343300"),
                new Correo("Juan", "juancho32@gmail.com"),
                new Push("Usuario", "Cubot P80") };

        procesarNotificaciones(notis);
    }

    public static void procesarNotificaciones(Notificacion[] notis) {
        for (Notificacion notificacion : notis) {
            notificacion.enviar();
        }
    }
}
