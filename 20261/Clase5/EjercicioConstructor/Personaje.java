public class Personaje {
    
    //Atributos
    String nombre;
    int nivel;
    
    // Constructor que obliga a dar un nombre al crear el personaje
    public Personaje(String nombre, int nivel) {
        this.nombre = nombre;
        this.nivel = nivel; // Todos empiezan en nivel 1 por defecto
    }

    public void mostrarInfo() {
        System.out.println(" Heroe : " + nombre + " | Nivel : " + nivel);
    }
}
