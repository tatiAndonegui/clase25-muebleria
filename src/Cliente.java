public class Cliente {

    private String nombre;
    private String formaDePago;


    Cliente(String nombre,String formaDePago){
        setNombre(nombre);
        setFormaDePago(formaDePago);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFormaDePago() {
        return formaDePago;
    }

    public void setFormaDePago(String formaDePago) {
        this.formaDePago = formaDePago;
    }
}
