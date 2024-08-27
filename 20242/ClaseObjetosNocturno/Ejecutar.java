public class Ejecutar {

    public static void main(String[] args) {

        Computador objComputador1;
        objComputador1 = new Computador("HP", "Negro", "MLX738", 6412148, 21.0);

        Computador objComputador2 = new Computador("LENOVO", "Gris", "LMN580", 0014127, 15.0);

        System.out.println(objComputador1);
        System.out.println(objComputador2);
        objComputador1.reubicar("Ingeniería");
        objComputador2.asignar("David");


    }

}
