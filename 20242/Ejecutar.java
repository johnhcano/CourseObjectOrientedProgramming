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
         * 3. Diseñe un algoritmo que convierta de grados centígrados a grados fahrenheit y  viceversa 
         * 4. Diseñe un algoritmo para calcular el salario de un empleado. 
         *    salarioNeto = (salarioBruto - deducciones) + comisión 
         * 5. Diseñe un algoritmo para convertir pesos a dolares y pesos a euros 
         * 6. Diseñe un algoritmo para calcular el pago de un parqueadero por horas. 
         *    Valor de  la hora $2000 también se debe discriminar el IVA del 20% que se paga. 
         */

         /* Solución ejercicio 1.
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


    }
}