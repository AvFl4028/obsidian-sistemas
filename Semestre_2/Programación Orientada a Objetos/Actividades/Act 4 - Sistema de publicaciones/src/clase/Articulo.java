package clase;

public class Articulo extends Publicacion{
    private String revisores;
    private boolean aprobado;

    public Articulo(String titulo, String contenido, String autor, String revisores, boolean aprobado){
        super(titulo, contenido, autor);
        this.revisores = revisores;
        this.aprobado = aprobado;
    }

    @Override
    public String getInfo(){
        return "Articulo\n" + "Titulo: " + titulo + "\nAutor" + autor + "\nContenido" + contenido + "\nRevisores: " + revisores + "\nAprobado: " + (aprobado ? "Si": "No");
    }
}
