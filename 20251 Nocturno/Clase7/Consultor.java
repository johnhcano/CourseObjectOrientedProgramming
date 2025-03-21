public class Consultor extends Trabajador {

    private double comision;
    public final double SALARIO_BASE = 3500.0; //Constante

    public Consultor(int idTrabajador, String nombre, String apellido, double comision){
        super(idTrabajador, nombre, apellido);
        this.comision = comision;
    }

    public double pagar(){
        return SALARIO_BASE + (SALARIO_BASE * (comision/100));
    }

    public String toString() {
        return "Consultor { idTrabajador: " + super.getIdTrabajador() +
                "Nombre: " + super.getNombre() +
                "Apellido: " + super.getApellido() +
                "Comisión: " + comision + "}";
    }

}
