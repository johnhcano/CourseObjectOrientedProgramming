public class Cuenta {

    private int numeroCuenta;
    private double saldo;

    public Cuenta(int numeroCuenta, double saldo){
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public String toString(){
        return "Cuenta { numeroCuenta: " + numeroCuenta + " Saldo: " + saldo + " }";
    }

}