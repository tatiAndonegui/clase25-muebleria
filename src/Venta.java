public class Venta {

    private int numeroDeCuotas;
    private double descuento;
    private Producto producto;
    private Cliente cliente;

    Venta(int numeroDeCuotas,
          double descuento,
          Producto producto,
          Cliente cliente) {
        setNumeroDeCuotas(numeroDeCuotas);
        setDescuento(descuento);
        setProducto(producto);
        setCliente(cliente);
    }


    public Venta(int numeroDeCuotas) {
        this.numeroDeCuotas = numeroDeCuotas;
    }

    public int getNumeroDeCuotas() {
        return numeroDeCuotas;
    }

    public void setNumeroDeCuotas(int numeroDeCuotas) {
        this.numeroDeCuotas = numeroDeCuotas;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

}

