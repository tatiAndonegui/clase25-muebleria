import java.util.ArrayList;

public class Producto {


    private ArrayList<Producto>stock;
    private String nombreDeProducto;
    private double precioDeProducto;
    private int codigoDeProducto;
    private boolean reservado;

    Producto (String nombreDeProducto,
              double precioDeProducto,
              int codigoDeProducto,
              int stockDeProducto,boolean reservado ){
        setNombreDeProducto(nombreDeProducto);
        setPrecioDeProducto(precioDeProducto);
        setCodigoDeProducto(codigoDeProducto);
        setStock (new ArrayList<Producto>());
        setReservado(reservado);
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


    public boolean isReservado() {
        return reservado;
    }

    public void setReservado(boolean reservado) {
        this.reservado = reservado;
    }

    public ArrayList<Producto> getStock() {
        return stock;
    }

    public void setStock(ArrayList<Producto> stock) {
        this.stock = stock;
    }
}
