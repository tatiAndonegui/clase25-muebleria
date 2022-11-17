public class Producto {

    private String nombreDeProducto;
    private double precioDeProducto;
    private int codigoDeProducto;
    private int stockDeProducto;

    Producto (String nombreDeProducto,
              double precioDeProducto,
              int codigoDeProducto,
              int stockDeProducto ){
        setNombreDeProducto(nombreDeProducto);
        setPrecioDeProducto(precioDeProducto);
        setCodigoDeProducto(codigoDeProducto);
        setStockDeProducto(stockDeProducto);
    }

    public String getNombreDeProducto() {
        return nombreDeProducto;
    }

    public void setNombreDeProducto(String nombreDeProducto) {
        this.nombreDeProducto = nombreDeProducto;
    }

    public double getPrecioDeProducto() {
        return precioDeProducto;
    }

    public void setPrecioDeProducto(double precioDeProducto) {
        this.precioDeProducto = precioDeProducto;
    }

    public int getCodigoDeProducto() {
        return codigoDeProducto;
    }

    public void setCodigoDeProducto(int codigoDeProducto) {
        this.codigoDeProducto = codigoDeProducto;
    }

    public int getStockDeProducto() {
        return stockDeProducto;
    }

    public void setStockDeProducto(int stockDeProducto) {
        this.stockDeProducto = stockDeProducto;
    }
}
