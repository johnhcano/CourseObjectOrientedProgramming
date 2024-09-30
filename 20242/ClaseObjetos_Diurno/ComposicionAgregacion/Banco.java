public class Banco {

    //Atributos
    private String NIT;
    private String razonSocial;

    //constructor
    public Banco(String NIT, String razonSocial){
        this.NIT = NIT;
        this.razonSocial = razonSocial;
    }

    //Métodos
    public String getNIT() {
        return NIT;
    }

    public void setNIT(String nIT) {
        NIT = nIT;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    @Override
    public String toString() {
        return "Banco [NIT=" + NIT + ", razonSocial=" + razonSocial + "]";
    }
    
    

}