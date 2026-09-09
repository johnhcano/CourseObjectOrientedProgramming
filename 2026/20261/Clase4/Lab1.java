import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
         * 4.7 Se desea realizar una estadística de los pesos de los alumnos
         * de un colegio de acuerdo con la siguiente tabla:
         * Alumnos de menos de 40 kg.
         * Alumnos entre 40 y 50 kg.
         * Alumnos de más de 50 kg y menos de 60 kg.
         * Alumnos de más o igual a 60 kg.
         */
        int rango1 = 0, rango2 = 0, rango3 = 0, rango4 = 0;

        System.out.print("Cuántos alumnos: ");
        int cantidad = sc.nextInt();

        for (int i = 1; i <= cantidad; i++) {
            
            System.out.print("Digite el peso del alumno " + i + ": ");
            int peso = sc.nextInt();

            if (peso < 40) {
                rango1++; //acumulador
            } else {
                if (peso >= 40 && peso < 50) {
                    rango2++;
                } else {
                    if (peso >= 50 && peso < 60) {
                        rango3++;
                    } else {
                        rango4++;
                    }
                }
            }
        }

        System.out.println("menos de 40 kg => " + rango1);
        System.out.println("entre 40 y 50 kg => " + rango2);
        System.out.println("más de 50 kg y menos de 60 kg => " + rango3);
        System.out.println("más o igual a 60 kg => " + rango4);
        
        sc.close();
    }
}
