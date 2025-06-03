package Personal;

public class Docentes extends Persona {
    private String perfilAcademico;
    private String grupoColegialo;

    public Docentes(String nombre, char genero, int telefono, int numControl, String perfilAcademico,
            String grupoColegialo) {
        super(nombre, genero, telefono, numControl);
        this.perfilAcademico = perfilAcademico;
        this.grupoColegialo = grupoColegialo;
    }

    public String getPerfilAcademico() {
        return perfilAcademico;
    }

    public String getGrupoColegialo() {
        return grupoColegialo;
    }

    public void setPerfilAcademico(String perfilAcademico) {
        this.perfilAcademico = perfilAcademico;
    }

    public void setGrupoColegialo(String grupoColegialo) {
        this.grupoColegialo = grupoColegialo;
    }

    public String Info() {
        return super.Info() + "\nPerfil Academico: " + perfilAcademico + "\nGrupo Colegialo: " + grupoColegialo;
    }
}
