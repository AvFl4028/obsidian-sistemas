package Personal;

public abstract class Persona {
    protected String nombre;
    protected char genero;
    protected int telefono;
    protected int numControl;

    public Persona(String nombre, char Genero, int telefono, int numControl) {
        this.nombre = nombre;
        this.genero = Genero;
        this.telefono = telefono;
        this.numControl = numControl;
    }

    public String getNombre() {
        return nombre;
    }

    public char getGenero() {
        return genero;
    }

    public int getTelefono() {
        return telefono;
    }

    public int getNumControl() {
        return numControl;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String Info() {
        return "Nombre: " + nombre + "\nGenero: " + genero + "\nTelefono: " + telefono + "\nNumero de Control: "
                + numControl;
    };
}
