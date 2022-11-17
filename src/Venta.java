public class Venta {

    private int numeroDeCuotas;
    private double descuento;
    private Producto producto;
    private Cliente cliente;
    private Vendedor vendedor;

    Venta(int numeroDeCuotas,
          double descuento,
          Producto producto,
          Cliente cliente,
          Vendedor vendedor){
        setNumeroDeCuotas(numeroDeCuotas);
        setDescuento(descuento);
        setProducto(producto);
        setCliente(cliente);
        setVendedor(vendedor);
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

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }
}

