public class EjecutarHerencia {
    
    public static void main(String[] args) {
        
        //Creación de los objetos (Instanciar)
        Trabajador objT1 = new Operario(1, "Pepito", "Puertas", 135.0);
        Trabajador objT2 = new Consultor(2, "Juan", "Islas", 10);

        System.out.println(objT1);
        System.out.println(objT2);

    }
}
