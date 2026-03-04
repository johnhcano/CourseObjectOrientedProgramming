public class Celular {

    // Atributos
    String marca;
    String modelo;
    int bateria = 100;

    // Método
    /*
     * Firma del método
     * público
     * void --> no retorna
     * el método tiene como nombre "llamar"
     * tiene un parémetro y es de tipo entero
     */
    public void llamar(String numero) {
        System.out.println("Llamando al " + numero + "....");
        this.bateria -= 5;
    }
}
