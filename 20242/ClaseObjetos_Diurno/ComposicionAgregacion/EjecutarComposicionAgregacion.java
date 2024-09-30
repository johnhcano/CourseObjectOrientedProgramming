public class EjecutarComposicionAgregacion {
    public static void main(String[] args) {
        
        Cliente objCliente1 = new Cliente(1008909765, "Pipe", "Perez");

        Cuenta objCuenta1 = new Cuenta("709876", "Ahorros", 0.0);

        Banco objBanco1 = new Banco("900345123", "Banco UCC", objCuenta1);

        System.out.println(objBanco1);

        System.out.println(objBanco1.esCliente(objCliente1));

        System.out.println("Transacción: " + objCuenta1.consignar(objCuenta1.getNroCuenta(), 150000.0));

        System.err.println(objCuenta1);


    }
}
