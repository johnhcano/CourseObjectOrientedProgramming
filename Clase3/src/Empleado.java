public class Empleado extends Trabajador {
    
    //Declaración de una Constante
    private static final double SALARIO = 20000;

    //Atributo de la clase
    private double porcentaje;

    //Constructor de la clase
    public Empleado(int id, String nombre, String apellido, double porcentaje) {
        super(id, nombre, apellido);
        this.porcentaje = porcentaje;
    }

    public double getPorcentaje(){
        return porcentaje;
    }

    //Implementación del método pagar.
    public double pagar(){
        return SALARIO * ((porcentaje / 100) + 1);
    }

}
