import java.util.Random;

public class Raiden extends Personaje {

    public Raiden(String nombre) {
        super(nombre);
        this.puntosDeVida = 120; // Todos los Raiden comienzan con 120 puntos de vida
    }

    // Metodo para realizar un ataque a otro personaje
    public void atacar(Personaje oponente) {
        int dano = 0;
        Random rand = new Random();
        int op = rand.nextInt(( 3 - 1) + 1) + 1; // Opciones entre 1 y 3
        switch(op){
            case 1: dano = 50; //puño
                    break;
            case 2: dano = 20; //patada
                    break;
            case 3: dano = 10; //cabeza
                    break;
            default: System.out.println("Opción no valida");    
        }

        oponente.recibirDano(dano);
        System.out.println(this.nombre + " ataca a " + oponente.getNombre() + " causando " + dano + " puntos de dano.");
    }

}
