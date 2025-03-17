public class Estudiante {
    //Atributos
    private int id;
    private String nombre;
    private String apellido;
    private int edad;
    private String facultad;

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