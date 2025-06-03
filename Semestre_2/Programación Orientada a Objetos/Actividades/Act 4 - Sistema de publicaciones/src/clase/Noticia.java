package clase;

public class Noticia extends Publicacion{
    private String fechaDePublicacion;
    private String fuente;
    
    public Noticia(String titulo, String contenido, String autor, String fechaDePublicacion, String fuente){
        super(titulo, contenido, autor);
        this.fechaDePublicacion = fechaDePublicacion;
        this.fuente = fuente;
    }
    @Override
    public String getInfo(){
        return "Noticia\n" + "Titulo: " + titulo + "\nAutor" + autor + "\nContenido" + contenido + "\nFecha de Publicación: " + fechaDePublicacion + "\nFuente: " + fuente;
    }
}
