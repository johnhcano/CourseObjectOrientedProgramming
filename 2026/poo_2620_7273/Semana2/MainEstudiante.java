public class MainEstudiante {
    public static void main(String[] args) {

       //Creación del objeto de la clase Estudiante
       Estudiante objEstudiante1 = new Estudiante();
       Estudiante objEstudiante2 = new Estudiante(); 

       objEstudiante1.id = 458967;
       objEstudiante1.nombre = "Jorge";
       objEstudiante1.nota = 4.5;

       objEstudiante2.id = 294501;
       objEstudiante2.nombre = "Fernanda";
       objEstudiante2.nota = 4.8;

       //Mostrar la información del objeto 1 (objEstudiante1)
       System.out.println(objEstudiante1.id);
       System.out.println(objEstudiante1.nombre);
       System.out.println(objEstudiante1.nota);

       //Mostrar la información del objeto 2 (objEstudiante2)
       System.out.println(objEstudiante2.id);
       System.out.println(objEstudiante2.nombre);
       System.out.println(objEstudiante2.nota);
    }    
}
