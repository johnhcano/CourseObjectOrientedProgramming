public class Ejecutar {
    
    public static void main(String[] args) {
        
        //Creación de los objetos de la clase Vehiculo

        //Forma1
        Vehiculo objVehiculo1 = new Vehiculo("Toyota", "Blanco", 4500.0, "TS3456WE", 2.3, "150HP");

        //Forma2
        Vehiculo objVehiculo2;
        objVehiculo2 = new Vehiculo("Ferrari", "Rojo", 5000.0, "SEWR567UY", 1.8, "450HP");

        //Mostrar la marca del objeto vehículo
        System.out.println(objVehiculo1.getMarca());

        //Se va modificar la marca del vehículo del objeto objVehiculo1
        objVehiculo1.setMarca("Chevrolet");

        //Mostrar todo objeto
        System.out.println(objVehiculo1.toString());
        System.out.println(objVehiculo2);


    }
}