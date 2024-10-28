import java.util.Random;

abstract class Personaje {

    protected String nombre;
    protected int puntosDeVida;

    private final int MAX_DANO = 30;
    private final int MIN_DANO = 10;

    // Constructor para inicializar los datos del personaje
    public Personaje(String nombre) {
        this.nombre = nombre;
        this.puntosDeVida = 100; // Todos comienzan con 100 puntos de vida
    }

    // Metodo para realizar un ataque a otro personaje
    abstract void atacar(Personaje oponente);

    // Metodo para recibir dano
    public void recibirDano(int dano) {
        this.puntosDeVida -= dano;
        if (this.puntosDeVida < 0) {
            this.puntosDeVida = 0; // No se puede tener menos de 0 puntos de vida
        }
    }

    // Verifica si el personaje sigue vivo
    public boolean estaVivo() {
        return this.puntosDeVida > 0;
    }

    // Devuelve el nombre del personaje
    public String getNombre() {
        return this.nombre;
    }

    // Devuelve los puntos de vida actuales
    public int getPuntosDeVida() {
        return this.puntosDeVida;
    }
}