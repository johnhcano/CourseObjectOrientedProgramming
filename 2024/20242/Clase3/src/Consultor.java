public class Consultor extends Trabajador {
    
    //Declaración de una constante
    private static final int VALOR_HORA = 1450;

    //Atributo
    private double horas;

    //Constructor
    public Consultor(int id, String nombre, String apellido, double horas) {
        super(id, nombre, apellido);
        this.horas = horas;
    }

    public double getHoras(){
        return horas;
    }

    public double pagar(){
        return VALOR_HORA * horas;
    }
}
