public class EjecutarHerencia {
    public static void main(String[] args) {

        //Creación de los Objetos
        Trabajador objT1 = new Vendedor(1, "Cristiano", "Textiles", 20.0);
        Trabajador objT2 = new Vendedor(2, "Messi", "Electrodomésticos", 10.0);

        Trabajador objT3 = new Operario(3, "Byron", "Dulcería", 200);
        Trabajador objT4 = new Operario(4, "Harvin", "Comestibles", 230);

        System.out.println("Salario Vendedor: " + objT1.salario());
        System.out.println("Salario Operario: " + objT3.salario());

    }
} 
