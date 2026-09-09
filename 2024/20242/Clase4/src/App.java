public class App {
    public static void main(String[] args) {
        
        Trabajador objTrabajador1 = new Trabajador(1, "Jhon", "Cano");
        Trabajador objTrabajador2 = new Trabajador(2, "Byron", "Beltran");

        Cliente objCliente1 = new Cliente("31257077", "Patricia Beltran", 234);
        Cliente objCliente2 = new Cliente("14646345", "Arles Cano", 450);

        Supermercado OXXO = new Supermercado("OXXO", "Calle 5ta", objTrabajador1);
        System.out.println(OXXO);
        System.out.println(OXXO.totalPuntos(objCliente1) + " " + objCliente1.getNombre());
        System.out.println(OXXO.totalPuntos(objCliente2) + " " + objCliente2.getNombre());

        Supermercado JUMBO = new Supermercado("JUMBO", "Calle 100", objTrabajador2);
        System.out.println(JUMBO);
        System.out.println(JUMBO.totalPuntos(objCliente1) + " " + objCliente1.getNombre());

    }
}
