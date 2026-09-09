import java.util.Random;

public class KungLao extends Personaje {

    public KungLao(String nombre) {
        super(nombre);
        this.puntosDeVida = 80; // Todos los KungLao comienzan con 80 puntos de vida
        this.arma = new Cuchillo("Cuchillo", 5, "Pata e Cabra");
    }

   // Metodo para realizar un ataque a otro personaje
    public void atacar(Personaje oponente) {
        String ataque = "";
        int dano = 0;
        Random rand = new Random();
        int op = rand.nextInt((4 - 1) + 1) + 1; // Opciones entre 1 y 4
        switch(op){
            case 1: dano = 10; //puño
                    ataque = " puño ";
                    break;
            case 2: dano = 20; //patada
                    ataque = " patada ";
                    break;
            case 3: dano = 50; //cabeza
                    ataque = " cabeza ";
                    break;
            case 4: dano = arma.getAfectacion();
                    ataque = arma.getNombre();
                    break;
            default: System.out.println("Opción no valida");    
        }

        oponente.recibirDano(dano);
        System.out.println(this.nombre + " ataca a " + oponente.getNombre() + " causando " + dano + " puntos de dano, con " + ataque);
    }


}
