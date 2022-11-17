public class Main {
    public static void main(String[] args) {

        Producto silla = new Producto("silla",100,402,2);
        Cliente julieta = new Cliente("Julieta", "tarjeta");
        Venta ventaAJulieta = new Venta(3,0.5,silla,julieta);
        Vendedor felipe = new Vendedor("felipe",ventaAJulieta,true);


    }
}
