package Personal.Estudiantes;

public class EstudianteResidencia extends Estudiante {

    private String nombreProyecto;
    private String asesor;

    public EstudianteResidencia(String nombre, char genero, int telefono, int numControl, String Materia,
            String horario, String nombreProyecto, String asesor) {
        super(nombre, genero, telefono, numControl, null, horario);

        this.nombreProyecto = nombreProyecto;
        this.asesor = asesor;

        String Materias[] = { Materia };

        super.setMaterias(Materias);
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public String getAsesor() {
        return asesor;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    public void setAsesor(String asesor) {
        this.asesor = asesor;
    }

    public String Info() {
        return super.Info() + "\nProyecto: " + nombreProyecto + "\nAsesor: " + asesor;
    }
}
