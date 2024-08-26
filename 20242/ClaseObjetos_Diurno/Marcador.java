public class Marcador {

    //Atributos de la clase
    private String nombre;
    private String color;
    private double diametro;
    private boolean esBorrable;

    //Método Constructor
    public Marcador(String nombre, String color, double diametro, boolean esBorrable){
        this.nombre = nombre;
        this.color = color;
        this.diametro = diametro;
        this.esBorrable = esBorrable;
    }

    //Métodos de la clase
    
    /*
     * Firma del método
     * público
     * el nombre del método es "rayar"
     * no retorna valores
     * no tiene parámetros o argumentos
     */
    public void rayar(){
        System.out.println("Marcador rayando...");
    }

    /*
     * Firma del método
     * público
     * el nombre del método es "recargar"
     * retorna un valor tipo String
     * recibe 1 parámetro o argumento de tipo real(double)
     */
    public String recargar(double cantidad){
        return "El marcador se recargó con " + cantidad + "ml";
    }



}