public class Perro extends Animal {
    
    private String raza;

    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " dice: ¡Guau!");
    }

    public void buscarPelota() {
        System.out.println(getNombre() + " fue a buscar la pelota.");
    }

    @Override
    public String toString() {
        return "Perro[ " + super.toString() + ", Raza=" + raza + "]";
    }
    
}
