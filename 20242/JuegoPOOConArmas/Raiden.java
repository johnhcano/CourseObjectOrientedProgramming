import java.util.Random;

public class Raiden extends Personaje {

    public Raiden(String nombre) {
        super(nombre);
        this.puntosDeVida = 120; // Todos los Raiden comienzan con 120 puntos de vida
        this.arma = new Pistola("Pistola", 10, "Beretta");
    }

    // Metodo para realizar un ataque a otro personaje
    public void atacar(Personaje oponente) {
        String ataque = "";
        int dano = 0;
        Random rand = new Random();
        int op = rand.nextInt(( 4 - 1 ) + 1) + 1; // Opciones entre 1 y 3
        switch(op){
            case 1: dano = 50; //puño
                    ataque = " puño ";
                    break;
            case 2: dano = 20; //patada
                    ataque = " patada ";
                    break;
            case 3: dano = 10; //cabeza
                    ataque = " cabeza ";
                    break;
            case 4: dano = arma.getAfectacion();
                    ataque = arma.getNombre();
                    break;
            default: System.out.println("Opción no valida");    
        }

        oponente.recibirDano(dano);
        System.out.println(this.nombre + " ataca a " + oponente.getNombre() + " causando " + dano + " puntos de dano con " + ataque);
    }

}
