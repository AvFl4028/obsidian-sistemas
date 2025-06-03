package Notis;

public class Correo extends Notificacion {
    String correoElectronico;

    public Correo(String destinatario, String correoElectronico) {
        super(destinatario);
        this.correoElectronico = correoElectronico;
    }

    @Override
    public void enviar() {
        System.out.println("Se envio un correo a " + correoElectronico + " con destinario de " + destinatario);
    }
}
