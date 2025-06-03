public abstract class Producto {
    private String nombre;
    private String fechaCaducidad;
    private String numeroLote;
    private String fechaEnvasado;
    private String paisOrigen;

    public Producto(String nombre, String fechaCaducidad, String numeroLote,
            String fechaEnvasado, String paisOrigen) {
        this.nombre = nombre;
        this.fechaCaducidad = fechaCaducidad;
        this.numeroLote = numeroLote;
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public String getNumeroLote() {
        return numeroLote;
    }

    public String getFechaEnvasado() {
        return fechaEnvasado;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public abstract String getDetalles();

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", fechaCaducidad='" + fechaCaducidad + '\'' +
                ", numeroLote='" + numeroLote + '\'' +
                ", fechaEnvasado='" + fechaEnvasado + '\'' +
                ", paisOrigen='" + paisOrigen + '\'' +
                '}';
    }
}
