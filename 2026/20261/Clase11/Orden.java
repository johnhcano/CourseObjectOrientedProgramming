public class Orden {
    private int hora;
    private String mesero;
    private Cliente cliente;
    private Pago pago;
    
    public Orden(int hora, String mesero, Cliente cliente, Pago pago) {
        this.hora = hora;
        this.mesero = mesero;
        this.cliente = cliente;
        this.pago = pago;
    };

    public String agregarProductos(Bebida bebida, Platillo platillo){
        return "orden--> Bebida:" + bebida + " Platillo: " + platillo;
    }
    
}
