package actividad;

public class Blog extends Publicacion{
    private String comentarios;

    public Blog(String titulo, String contenido, String autor, String comentarios){
        super(titulo, contenido, autor);
        this.comentarios = comentarios;
    }

    public String getBlog(){
        return "Blog\n" + super.getPublicacion() + "\nComentarios: " + comentarios;
    }
}
