package clase;

public abstract class Publicacion {
    protected String contenido;
    protected String autor;
    protected String titulo;

    protected Publicacion(String titulo, String contenido, String autor){
        this.titulo = titulo;
        this.contenido = contenido;
        this.autor = autor;
    }

    protected abstract String getInfo();
}
