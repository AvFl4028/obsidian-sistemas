package actividad;

public class Articulo extends Publicacion{
    private String revisores;
    private boolean aprobado;

    public Articulo(String titulo, String contenido, String autor, String revisores, boolean aprobado){
        super(titulo, contenido, autor);
        this.revisores = revisores;
        this.aprobado = aprobado;
    }

    public String getArticulo(){
        return "Articulo\n" + super.getPublicacion() + "\nRevisores: " + revisores + "\nAprobado: " + (aprobado ? "Si": "No");
    }
}
