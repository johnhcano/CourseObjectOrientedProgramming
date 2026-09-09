public class EjecutarHerencia {
    public static void main(String[] args) {
        
        //Creación de un objeto tipo Perro
        Perro perro1 = new Perro("Chanel", 4, "Cocker Spaniel");
        System.out.println(perro1);
        perro1.hacerSonido();
        perro1.comer();
        perro1.buscarPelota();

        System.out.println();

        //Creación de un objeto tipo Gato
        Gato gato1 = new Gato("Elenor", 3, 7);
        System.out.println(gato1);
        gato1.hacerSonido();
        gato1.comer();
        gato1.ronronear();
    }
}
