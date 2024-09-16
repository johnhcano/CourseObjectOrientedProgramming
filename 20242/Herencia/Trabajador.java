public class Trabajador {

    private int id;
    private String nombre;
    private String area;
    
    public Trabajador(int id, String nombre, String area) {
        this.id = id;
        this.nombre = nombre;
        this.area = area;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getArea() {
        return area;
    }

    @Override
    public String toString() {
        return "Trabajador [id=" + id + ", nombre=" + nombre + ", area=" + area + "]";
    }

    public double salario(){
        return 0.0;
    }
    
}