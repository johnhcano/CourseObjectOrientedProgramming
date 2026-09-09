public class EjecutarBanco {
    
    public static void main(String[] args) {
        
        //Creación de los objetos

        Cuenta objCuenta = new Cuenta(1000235, 2345);

        Cliente objCliente = new Cliente(1117234567, "Izquierdo");

        System.out.println(objCuenta);

        System.out.println(objCliente);

        Banco objBanco = new Banco(1, "Mi Primer Ahorro", objCuenta);

        System.out.println(objBanco);

        objBanco.mostrarCliente(objCliente);

    }
}
