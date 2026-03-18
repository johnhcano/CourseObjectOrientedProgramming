public class Gato extends Animal {
    
    private int vidas;

    public Gato(String nombre, int edad, int vidas) {
        super(nombre, edad);
        this.vidas = vidas;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " dice: ¡Miau!");
    }

    public void ronronear() {
        System.out.println(getNombre() + " está ronroneando...");
    }

    @Override
    public String toString() {
        return "Gato[ " + super.toString() + ", Vidas=" + vidas + "]";
    }

}