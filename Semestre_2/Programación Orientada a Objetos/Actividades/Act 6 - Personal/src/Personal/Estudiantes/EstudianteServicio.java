package Personal.Estudiantes;

public class EstudianteServicio extends Estudiante {

    private String horarioServicio;
    private String areaAscripcion;
    private String jefe;

    public EstudianteServicio(String nombre, char genero, int telefono, int numControl, String[] Materias,
            String horario, String horarioServicio, String areaAscripcion, String jefe) {
        super(nombre, genero, telefono, numControl, Materias, horario);

        this.areaAscripcion = areaAscripcion;
        this.horarioServicio = horarioServicio;
        this.jefe = jefe;
    }

    public String getHorarioServicio() {
        return horarioServicio;
    }

    public String getAreaAscripcion() {
        return areaAscripcion;
    }

    public String getJefe() {
        return jefe;
    }

    public void serHorarioServicio(String horarioServicio) {
        this.horarioServicio = horarioServicio;
    }

    public void setAreaAscripcion(String areaAscripcion) {
        this.areaAscripcion = areaAscripcion;
    }

    public void setJefe(String jefe) {
        this.jefe = jefe;
    }

    public String Info() {
        return super.Info() + "\nHorario de Servicio: " + horarioServicio + "\nJefe: " + jefe + "\nArea de ascripcion: "
                + areaAscripcion;
    }
}
