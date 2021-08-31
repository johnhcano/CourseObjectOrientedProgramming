public class Cliente {
    
    private String cedula;
    private String nombre;
    private int puntos;
    
    public Cliente(String cedula, String nombre, int puntos) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.puntos = puntos;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    @Override
    public String toString() {
        return "Cliente [cedula=" + cedula + ", nombre=" + nombre + ", puntos=" + puntos + "]";
    }

}
