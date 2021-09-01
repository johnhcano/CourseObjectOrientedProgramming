public class Supermercado {
    
    private String nombre;
    private String direccion;
    private Trabajador trabajador;
    
    
    public Supermercado(String nombre, String direccion, Trabajador trabajador) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.trabajador = trabajador;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getDireccion() {
        return direccion;
    }
    
    public Trabajador getTrabajador() {
        return trabajador;
    }

    public int totalPuntos(Cliente cliente){
        return cliente.getPuntos();
    }

}
