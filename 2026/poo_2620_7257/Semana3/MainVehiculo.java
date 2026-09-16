public class MainVehiculo {
    public static void main(String[] args) {
        
        //Una constante es un valor que no cambia durante la ejecución y debe ir 
        //en Mayúscula Sostenida
        final int ANIO_ACTUAL = 2026;

        Vehiculo objVehiculo1 = new Vehiculo(2025, "FIAT", "Azul", 980.5, "Sedan");
        Vehiculo objVehiculo2 = new Vehiculo(1956, "Chevrolet", "Rojo", 1300.7, "Buick");
        
        System.out.println(objVehiculo1.calcularAntiguedadVehiculo(ANIO_ACTUAL));
        System.out.println(objVehiculo2.calcularAntiguedadVehiculo(ANIO_ACTUAL));
       
    }    

}
