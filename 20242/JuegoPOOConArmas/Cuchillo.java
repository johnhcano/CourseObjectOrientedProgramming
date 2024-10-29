public class Cuchillo extends Arma {

    private String tipo;
    
    public Cuchillo(String nombre, int afectacion, String tipo){
        super(nombre, afectacion);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

}
