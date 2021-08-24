public class Trabajador {

    //Atributos de la clase
    private int id;
    private String nombre;
    private String apellido;
    
    //Método constructor
    public Trabajador(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    //Métodos get
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    //Método pagar que será implementado en las clases hijas
    public double pagar(){
        return 0.0;
    }
}