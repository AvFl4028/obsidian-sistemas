package Notis;

public class Push extends Notificacion {
    String dispositivo;

    public Push(String destinatario, String dispositivo){
        super(destinatario);
        this.dispositivo = dispositivo;
    }

    @Override
    public void enviar(){
        System.out.println("(Notificacion Push) Se esta acabando la bateria en el dispositivo " + dispositivo + " de " + destinatario);
    }
}
