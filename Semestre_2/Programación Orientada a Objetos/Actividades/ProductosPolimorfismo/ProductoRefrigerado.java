public class ProductoRefrigerado extends ProductoCongelado {
    private String codigoOSA;

    public ProductoRefrigerado(String nombre, String fechaCaducidad, String numeroLote,
            String fechaEnvasado, String paisOrigen,
            float tempMantenimientoRecomendada, String codigoOSA) {
        super(nombre, fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen,
                tempMantenimientoRecomendada);
        this.codigoOSA = codigoOSA;
    }

    @Override
    public String getDetalles() {
        return "Producto Refrigerado - Código OSA: " + codigoOSA;
    }
}
