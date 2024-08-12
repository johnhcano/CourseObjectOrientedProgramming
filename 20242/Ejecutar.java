public class Ejecutar {
    public static void main(String[] args){

        //Comentario de una sola línea

        /*
         * Comentario de
         * varias 
         * líneas
         */

        //JAVA la asignación es con el = (igual)
        // a = 5 -> a la variable (a) le asignamos un 5
        // b = 10 --> a la variable (b) le asignamos un 10
        // nombre = "Cristiano" --> a la variable nombre le asignamos el texto "Cristiano"
        // == (igual igual, doble igual) --> es de comparación
        // Tener cuidado que las variables tienen un tipo de dato

        //https://www.dit.upm.es/~pepe/libros/vademecum.pdf

        //https://docs.oracle.com/javase/tutorial/tutorialLearningPaths.html

        /*
         * Tipos de datos en JAVA
         * Numéricos --> (enteros) int, long (reales) float, double
         * Lógicos --> boolean
         * Cadena --> char, String
         */

        /*
         * Ejercicios: 
         * 1. Diseñe un algoritmo que calcule el área de un cuadrado, 
         *    teniendo uno de sus lados. areaCuadrado = b^2 
         * 2. Diseñe un algoritmo que calcule el área de un círculo. areaCirculo = π r^2 
         * 3. Diseñe un algoritmo que convierta de grados centígrados a grados fahrenheit y 
         *    viceversa. C = F * (9/5) + 32    --   F = C - 32  * (5/9) 
         * 4. Diseñe un algoritmo para calcular el salario de un empleado. 
         *    salarioNeto = (salarioBruto - deducciones) + comisión 
         * 5. Diseñe un algoritmo para convertir pesos a dolares y pesos a euros.
         * 6. Diseñe un algoritmo para calcular el pago de un parqueadero por horas. 
         *    Valor de  la hora $2000 también se debe discriminar el IVA del 20% que se paga. 
         */

         /* 
          * Solución ejercicio #1.
          * Entrada: lado del cuadrado -> b
          * Proceso: areaCuadrado = b * b
          * Salida: areaCuadrado
        */
        //inicializar las variables
        int b = 0; 
        int areaCuadrado = 0;  
        
        b = 2; // Asignación de la variable
        areaCuadrado = b * b; // Fórmula para hallar el área de un cuadrado
        System.out.println("Área del Cuadrado = " + areaCuadrado); //Mensaje de salida

        //Para concatenar texto con variables se utiliza el signo (+)

        /*
         * Solución ejercicio #2
         * Entrada: radio del círculo, PI(constante)
         * Proceso: areaCirculo = PI*(r*r)
         * Salida: areaCirculo
         */
        double r = 0.0; //variable
        final double PI = 3.1416; //constante
        double areaCirculo = 0.0;

        r = 3;
        //areaCirculo = PI * (r * r);
        areaCirculo = Math.PI * Math.pow(r,2);

        System.out.println("El área del círculo es: " + areaCirculo);
        /*
         * Solución ejercicio #3
         * Entrada: Grados Centígrados (C), Grados Farenheit (F)
         * Proceso: Calcular las formulas C = F * (9/5) + 32    --   F = C - 32  * (5/9)
         * Salida: la conversion entre los grados Centígrados y Farenheit
         */
        
        double C = 0.0;
        double F = 0.0;

        //valores de las temperaturas
        C = 1;
        F = 1;

        double gradosCentigrados = ((F - 32.0) / (9.0/5.0));
        double gradosFarenheit = C * (9.0/5.0) + 32.0;

        System.out.println(F + " °F a °C: " + gradosCentigrados);
        System.out.println(C + " °C a °F: " + gradosFarenheit);

        /*
         * Actividad Independiente
         * Métodos en JAVA
         * Los ejercicios anterires implementarlos con métodos.
         * Tener en cuenta el concepto de la firma del método.
         */

    }
}