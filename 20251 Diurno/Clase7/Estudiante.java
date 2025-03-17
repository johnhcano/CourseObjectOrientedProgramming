public class Estudiante {
    //Atributos
    private int id;
    private String nombre;
    private String apellido;
    private int edad;
    private String facultad;

    //Constructor de la clase: permite inicializar la clase
    //this --> autoreferencia a los atributos de la clase
    public Estudiante(int id, String nombre, String apellido, int edad, String facultad){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.facultad = facultad;
    }
    //Métodos
    public void matricularCursos(String curso){
        System.out.println("Curso: " + curso + " Matriculado!!.");
    }
    
    public String verificarCreditos(int creditos){
        String cad = "";
        if(creditos < 10){
            cad = "No puede matricular menos de 10 créditos";
        }else{
            cad = "Sus créditos cumplen con lo requerido";
        }
        return cad;
    }
}