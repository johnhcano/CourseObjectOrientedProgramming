public class EjecutarHerencia {
    public static void main(String[] args) {
        
        final int ANIO_ACTUAL = 2024;
        //Creación de objetos
        Persona objP1 = new Estudiante("Cristiano", "Ronaldo", 1990, 264532);
        Persona objP2 = new Estudiante("Lio", "Messi", 1991, 345621);

        Persona objP3 = new Profesor("Carlo", "Ancheloti", 1960, "Técnico de Futbol");
        Persona objP4 = new Profesor("Néstor", "Lorenzo", 1970, "Preparador de Jugadores");

        System.out.println(objP1.calcularEdad(ANIO_ACTUAL));
        System.out.println(objP3.calcularEdad(ANIO_ACTUAL));

        System.out.println(objP2.mostrarInfo());
        System.out.println(objP4.mostrarInfo());
        
        //Creación de un arreglo de Personas(objetos)
        Persona[] p = new Persona[4];

        p[0] = objP1;
        p[1] = objP3;
        p[2] = objP2;
        p[3] = objP4;

        for (int i = 0; i < p.length; i++){
            System.out.println(p[i].calcularEdad(ANIO_ACTUAL) + " - " + p[i].mostrarInfo());
        }
    }
}