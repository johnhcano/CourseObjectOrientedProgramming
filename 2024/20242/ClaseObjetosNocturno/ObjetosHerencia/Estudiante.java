public class Estudiante extends Persona{
    
    private int id;

    public Estudiante(String nombre, String apellido, int anioNacimiento, int id) {
        super(nombre, apellido, anioNacimiento);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String mostrarInfo(){
        return "Estudiante: [ nombre Completo: " + getNombre() + " "
                + getApellido() + " Año de Nacimiento: " + getAnioNacimiento()
                + " id: " + id + "]";
    }

}
