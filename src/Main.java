public class Main {
    public static void main(String[] args) {

        Producto silla = new Producto("silla",100,402,2,true);
        Producto mesa = new Producto("mesa",500,88,2,false);
        Cliente julieta = new Cliente("Julieta", "tarjeta");
        Venta ventaAJulieta = new Venta(3,0.5,silla,julieta);
        Vendedor felipe = new Vendedor("felipe");

        felipe.vender(silla);
        felipe.reservar(mesa);
        felipe.vender(mesa);
    }
}
