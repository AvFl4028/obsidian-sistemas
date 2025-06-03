package actividad;

public class Noticia extends Publicacion{
    private String fechaDePublicacion;
    private String fuente;
    
    public Noticia(String titulo, String contenido, String autor, String fechaDePublicacion, String fuente){
        super(titulo, contenido, autor);
        this.fechaDePublicacion = fechaDePublicacion;
        this.fuente = fuente;
    }

    public String getNoticia(){
        return "Noticia\n" + super.getPublicacion() + "\nFecha de Publicación: " + fechaDePublicacion + "\nFuente: " + fuente;
    }
}
