package Notis;

public class SMS extends Notificacion {
    String telefono;

    public SMS(String destinatario, String telefono){
        super(destinatario);
        this.telefono = telefono;
    }

    @Override
    public void enviar(){
        System.out.println("Se envio un SMS al destinario " + destinatario + " con telefono " + telefono);
    }
}
