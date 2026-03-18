public class Animal {
    
    private String nombre;
    private int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() { 
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void comer() {
        System.out.println(nombre + " está comiendo.");
    }

    public void hacerSonido() {
        System.out.println(nombre + " hace un sonido genérico.");
    }

    public String toString() {
        return "Animal[ nombre=" + nombre + ", Edad=" + edad + "]";
    }
}
