public class Persona {
    
    //Atributos de la clase
    private String cedula;
    private String nombre;
    private String apellido;
    private int edad;
    private double peso;

    //Constructor de la clase
    // - Permite inicializar la clase
    // - Tiene el mismo nombre de la clase

    public Persona(){
    }

    public Persona(String cedula, String nombre, String apellido, int edad, double peso){
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.peso = peso;
    }

    //Métodos getters y setters
    
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    //Métodos de clase
    public String caminar(double km){
        return "Usted caminó " + km + " Kilometros";
    }

    public void comer(){
        System.out.println(nombre + " está comiendo....");
    }

    public String jugar(String deporte){
        return "Para " + nombre + " el deporte favorito es " + deporte; 
    }

    @Override
    public String toString() {
        return "Persona [ cedula=" + cedula + " nombre=" + nombre + " apellido=" + apellido + " edad=" + edad + " peso=" + peso + " ]";
    }

}
