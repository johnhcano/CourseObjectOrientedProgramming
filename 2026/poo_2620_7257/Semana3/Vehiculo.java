public class Vehiculo {
    
    //Atributos de la clase Vehiculo
    private int modelo;
    private String marca;
    private String color;
    private double peso;
    private String linea;

    //Constructor de la clase -> permite inicializar la clase
    public Vehiculo(int modelo, String marca, String color, double peso, String linea){
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.peso = peso;
        this.linea = linea;
    }

    public String toString(){
        return "Vehiculo [ modelo: " + modelo + " marca: " + marca + "color: " + color + 
                           " peso: " + peso + " linea: " + linea + " ]";
    }
}
