import Personal.Estudiantes.EstudianteServicio;

public class App {
    public static void main(String[] args) throws Exception {
        String[] materias = {"8"};
        EstudianteServicio jos = new EstudianteServicio("Jos", 'M', 27130040, 28102, materias, "7-12", "12-13", "No se", "Yo");
        System.out.println(jos.Info());
    }
}
