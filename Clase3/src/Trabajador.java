public class Trabajador {

    private int id;
    private String nombre;
    private String apellido;
    
    public Trabajador(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public double pagar(){
        return 0.0;
    }
}