package Personal.Estudiantes;

import Personal.Persona;

public class Estudiante extends Persona {
    protected String[] Materias;
    protected String horario;

    public Estudiante(String nombre, char genero, int telefono, int numControl, String[] Materias, String horario) {
        super(nombre, genero, telefono, numControl);
        this.Materias = Materias;
        this.horario = horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public void setMaterias(String[] Materias) {
        this.Materias = Materias;
    }

    public String getMaterias() {
        String todasMaterias = "";

        if (Materias == null)
            return "No hay materias registradas";

        for (String materia : Materias)
            if (materia != null)
                todasMaterias += materia + ", ";
                
        return todasMaterias;
    }

    public String getHorario() {
        return horario;
    }

    public String Info() {
        return super.Info() + "\nHorario: " + horario + "\nMaterias: " + getMaterias();
    }
}
