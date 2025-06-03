package clase;

public class Blog extends Publicacion {
    private boolean permiteComentarios;
    private Comentarios comentarios = new Comentarios();

    public Blog(String titulo, String contenido, String autor, boolean comentarios) {
        super(titulo, contenido, autor);
        this.permiteComentarios = comentarios;
    }

    @Override
    public String getInfo() {
        return "Blog\n" + "Titulo: " + titulo + "\nAutor" + autor + "\nContenido" + contenido + "\nComentarios: "
                + showComentarios();
    }

    public void anadirComentario(String comentario) {
        if (permiteComentarios) {
            comentarios.addComentario(comentario);
        }
    }

    private String showComentarios() {
        String allComentarios = "\n";
        for (String comentario : comentarios.getComentarios())
            if (comentario != null)
                allComentarios += comentario + "\n";
        return allComentarios;
    }
}
