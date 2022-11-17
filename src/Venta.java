public class Venta {

    private int numeroDeCuotas;
    private double descuento;
    private Producto producto;

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

}

