package actividad;

public class Publicacion {
    protected String contenido;
    protected String autor;
    protected String titulo;

    protected Publicacion(String titulo, String contenido, String autor){
        this.titulo = titulo;
        this.contenido = contenido;
        this.autor = autor;
    }

    protected String getPublicacion(){
        return "Titulo: " + titulo + "\nContenido: " + contenido + "\nAutor: " + autor;
    }
}
