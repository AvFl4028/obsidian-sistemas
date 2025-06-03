package clase;

public class Comentarios {
    private String comentarios[] = new String[20];
    private int cantidadDeComentarios = -1;

    public void addComentario(String comentario) {
        if (comentario != null || comentario != "")
            comentarios[++cantidadDeComentarios] = comentario;
    }

    public boolean isFull(){
        return (cantidadDeComentarios == comentarios.length-1) ? true: false;
    }

    public boolean isEmpty(){
        return (cantidadDeComentarios < 0) ? true: false;
    }

    public String[] getComentarios(){
        return comentarios;
    }
}
