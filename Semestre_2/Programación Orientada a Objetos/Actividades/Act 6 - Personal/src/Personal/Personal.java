package Personal;

public class Personal extends Persona {
    private String areaLimpieza;

    public Personal(String nombre, char genero, int telefono, int numControl, String areaLimpieza) {
        super(nombre, genero, telefono, numControl);
        this.areaLimpieza = areaLimpieza;
    }

    public String getAreaLimpieza() {
        return areaLimpieza;
    }

    public void setAreaLimpieza(String areaLimpieza) {
        this.areaLimpieza = areaLimpieza;
    }

    public String Info() {
        return super.Info() + "\nArea de Limpieza: " + areaLimpieza;
    }
}
