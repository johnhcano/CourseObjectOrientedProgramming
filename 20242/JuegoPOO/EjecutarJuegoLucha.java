import java.util.Scanner;

public class EjecutarJuegoLucha {
    // Metodo principal que ejecuta el juego
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.print(" Introduce el nombre del jugador 1: ");
        String nombre1 = leer.nextLine ();

        System.out.print (" Introduce el nombre del jugador 2: ");
        String nombre2 = leer.nextLine();
        
        JuegoLucha juego = new JuegoLucha(nombre1, nombre2);
        juego.iniciarPelea();

        leer.close();
    }

}
