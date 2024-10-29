public class Arma {
    
    private String nombre;
    private int afectacion;
    
    public Arma(String nombre, int afectacion) {
        this.nombre = nombre;
        this.afectacion = afectacion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAfectacion() {
        return afectacion;
    }
    
}
