public class Banco {
    
    private int id;
    private String nombre;
    private Cuenta cuenta;

    public Banco(int id, String nombre, Cuenta cuenta){
        this.id = id;
        this.nombre = nombre;
        this.cuenta = cuenta;
    }

    public void mostrarCliente(Cliente cliente){
        System.out.println(cliente);
    }
    
}
