public class ProductoFresco extends Producto {
    public ProductoFresco(String nombre, String fechaCaducidad, String numeroLote,
            String fechaEnvasado, String paisOrigen) {
        super(nombre, fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen);
    }

    @Override
    public String getDetalles() {
        return "Producto Fresco";
    }
}
