public class MainVehiculo {
    public static void main(String[] args) {
        
        Vehiculo objVehiculo1 = new Vehiculo(2025, "FIAT", "Azul", 980.5, "Sedan");
        Vehiculo objVehiculo2 = new Vehiculo(1956, "Chevrolet", "Rojo", 1300.7, "Buick");
        
        System.out.println(objVehiculo1.calcularAntiguedadVehiculo(2026));
        System.out.println(objVehiculo2.calcularAntiguedadVehiculo(2026));
        


    }    
}
