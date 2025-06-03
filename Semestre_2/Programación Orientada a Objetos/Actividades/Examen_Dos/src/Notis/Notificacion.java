package Notis;

public abstract class Notificacion {
    String destinatario;

    public Notificacion(String destinatario){
        this.destinatario = destinatario;
    }

    public abstract void enviar();
}
