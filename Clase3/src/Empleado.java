public class Empleado extends Trabajador {
    
    //Declaración de una Constante
    private static final double SALARIO = 20000;

    //Atributo de la clase
    private String area;

    //Constructor de la clase
    public Empleado(int id, String nombre, String apellido, String area) {
        super(id, nombre, apellido);
        this.area = area;
    }

    public String getArea(){
        return area;
    }

    //Implementación del método pagar.
    public double pagar(){
        return SALARIO * 1.19;
    }

}
