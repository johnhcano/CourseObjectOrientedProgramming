public class Banco {

    //Atributos
    private String NIT;
    private String razonSocial;
    private Cuenta cuenta;
    
    public Banco(String NIT, String razonSocial, Cuenta cuenta) {
        this.NIT = NIT;
        this.razonSocial = razonSocial;
        this.cuenta = cuenta;
    }

    public String getNIT() {
        return NIT;
    }

    public void setNIT(String NIT) {
        this.NIT = NIT;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public String toString() {
        return "Banco [NIT=" + NIT + ", razonSocial=" + razonSocial + ", cuenta=" + cuenta + "]";
    }

    public boolean esCliente(Cliente cliente){
        boolean flag = false;
        if (cliente instanceof Cliente){
            flag = true;
        }
        return flag;
    }

}