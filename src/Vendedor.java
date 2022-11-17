import java.util.ArrayList;

public class Vendedor {

    private String nombre;
    private ArrayList<Producto>productos;
    //agregar array de lista de stock
    //agregar array de  lista de vendidos


    Vendedor(String nombre){
        setNombre(nombre);
        setProductos(new ArrayList<Producto>());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public void vender(Producto productoVendido){
        // agregar metodo remove de lista de producto en stock a vendidos
    }

    public void reservar(Producto productoReservado) {
        productoReservado.setReservado(true);
    }
}
