package Personal.Estudiantes;

public class EstudiantePostgrado extends Estudiante {

    private String temaTesis;
    private String asesor;

    public EstudiantePostgrado(String nombre, char genero, int telefono, int numControl, String[] Materias,
            String horario, String temaTesis, String asesor) {
        super(nombre, genero, telefono, numControl, Materias, horario);
        this.temaTesis = temaTesis;
        this.asesor = asesor;
    }

    public String getTemaTesis() {
        return temaTesis;
    }

    public String getAsesor() {
        return asesor;
    }

    public void setTemaTesis(String temaTesis) {
        this.temaTesis = temaTesis;
    }

    public void setAsesor(String asesor) {
        this.asesor = asesor;
    }

    public String Info() {
        return super.Info() + "\nTema de Tesis: " + temaTesis + "\nAsesor: " + asesor;
    }
}
