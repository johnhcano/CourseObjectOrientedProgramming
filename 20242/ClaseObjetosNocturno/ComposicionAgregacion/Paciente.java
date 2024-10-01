public class Paciente {
    
    private int identificacion;
    private String nombreCompleto;
    private int edad;
    private String EPS;
    private char genero;
    private Cita cita;
    
    public Paciente(int identificacion, String nombreCompleto, int edad, String ePS, char genero, Cita cita) {
        this.identificacion = identificacion;
        this.nombreCompleto = nombreCompleto;
        this.edad = edad;
        EPS = ePS;
        this.genero = genero;
        this.cita = cita;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEPS() {
        return EPS;
    }

    public void setEPS(String ePS) {
        EPS = ePS;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public Cita getCita() {
        return cita;
    }

    public void setCita(Cita cita) {
        this.cita = cita;
    }

    @Override
    public String toString() {
        return "Paciente [identificacion=" + identificacion + ", nombreCompleto=" + nombreCompleto + ", edad=" + edad
                + ", EPS=" + EPS + ", genero=" + genero + ", cita=" + cita + "]";
    }

    public String verHistoriaClinica(HistoriaClinica historiaClinica){
        return historiaClinica.toString();
    }
}
