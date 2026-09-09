public class App {
    public static void main(String[] args) {
        
        Trabajador[] trabajadores = new Trabajador[6];

        trabajadores[0] = new Consultor(1, "Peter", "Maison", 4);
        trabajadores[1] = new Empleado(2, "Byron", "Cano", 10);
        trabajadores[2] = new Empleado(3, "Harvin", "Beltran", 33);
        trabajadores[3] = new Consultor(4, "Patricia", "Girón", 11.2);
        trabajadores[4] = new Consultor(5, "Blanca", "Girón", 3.4);
        trabajadores[5] = new Empleado(6, "Mercedes", "Fonseca", 15);

        for (Trabajador t: trabajadores){
            System.out.println(t.getNombre() + "-" + t.getClass() + " Gana: $" + t.pagar());
        }
        
    }
}
