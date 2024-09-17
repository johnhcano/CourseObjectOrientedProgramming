public class Profesor extends Persona{
    
    private String profesion;

    public Profesor(String nombre, String apellido, int anioNacimiento, String profesion) {
        super(nombre, apellido, anioNacimiento);
        this.profesion = profesion;
    }

    public String getProfesion() {
        return profesion;
    }

    public String mostrarInfo(){
        return "Profesor: [ nombre Completo: " + getNombre() + " "
                + getApellido() + " Año de Nacimiento: " + getAnioNacimiento()
                + " Profesión: " + profesion + "]";
    }

}
