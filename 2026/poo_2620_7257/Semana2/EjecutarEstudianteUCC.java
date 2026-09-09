public class EjecutarEstudianteUCC {
    public static void main(String[] args) {
        
        //Creación del objeto ObjEstudiante1 que se crea a partir de la clase EstudianteUCC
        EstudianteUCC objEstudiante1 = new EstudianteUCC(569874, 1001256, "María", 
                                                         "Correa", 20, 1.60);
        EstudianteUCC objEstudiante2 = new EstudianteUCC(100200, 1001369, "Juan", 
                                                         "Perez", 25, 1.80);

        System.out.println(objEstudiante1); //Mostrar la información que tiene el objeto "objEstudiante1"
        System.out.println(objEstudiante2); //Mostrar la información que tiene el objeto "objEstudiante2"

        //promedio de las edades de los estudiantes.

    }    
}
