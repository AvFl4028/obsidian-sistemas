public class ProductoCongelado extends Producto {
    private float tempMantenimientoRecomendada;

    public ProductoCongelado(String nombre, String fechaCaducidad, String numeroLote,
            String fechaEnvasado, String paisOrigen, float tempMantenimientoRecomendada) {
        super(nombre, fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen);
        this.tempMantenimientoRecomendada = tempMantenimientoRecomendada;
    }

    public float getTempMantenimientoRecomendada() {
        return tempMantenimientoRecomendada;
    }

    @Override
    public String getDetalles() {
        return "Producto Congelado - Temp Recomendada: " + tempMantenimientoRecomendada;
    }
}
