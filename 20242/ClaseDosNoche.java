public class ClaseDosNoche {
    public static void main(String[] args) {
        
        //Comentarios de una sola línea

        /*
         * Comentarios de
         * varias
         * líneas
         */

        /*
         * Asignación (=)
         * Comparación (==)
         * a = 5
         * b= 10
         */

        /* 
         * Tipos de Datos
         * 
         * Numéricos -> Enteros (int, long), Reales (float, double)
         * Lógicos -> Booleanos (boolean) true/false  ---  1/0
         * Texto -> Cadenas (String), caracter (char)
         * 
         * Palabras reservadas del lenguaje JAVA
         * public, float, int, void, class, if, for, break, switch, while, return, String, ...
         * 
         * 
         * JAVA todas las variables deben ser declaradas antes de trabajar con ellas.
         * 
         */

        int a = 5;
        int b = 10;
        int c = a + b;
        //Para concatenar cadenas y variables se utiliza el operador (+)
        System.out.println("La suma entre " + a + " y " + b + " es: " + c);

        //Variables Auxiliares
        int aux = 0;

        System.out.println("a:" + a + " b:" + b);
        aux = a;
        a = b;
        b = aux;
        System.out.println("a:" + a + " b:" + b);

        /*
         * Reglas de Prioridad - PEMDAS
         * Paréntesis - Exponente - Multiplicación - División - Adición(Suma) - Sustracción(Resta) 
         */

        /*
         * 1. Diseñe un algoritmo que calcule el área de un cuadrado, teniendo uno de sus  lados.
         * A = lado^2 
         * 2. Diseñe un algoritmo que calcule el área de un círculo. A = π r^2 
         * 3. Diseñe un algoritmo que convierta de grados centígrados a grados fahrenheit 
         * y viceversa
         * 4. Diseñe un algoritmo para calcular el salario de un empleado. 
         * salarioNeto = (salarioBruto - deducciones) + comisión
         * 5. Diseñe un algoritmo para convertir pesos a dolares y pesos a euros
         * 6. Diseñe un algoritmo para calcular el pago de un parqueadero por horas. Valor de  la hora $2000 también se debe discriminar el IVA del 20% que se paga.
         */
        
        /*
         * Solución ejercicio #1
         * Entrada: lado del cuadrado
         * Proceso: areaCuadrado = b * b
         * Salida: Área del cuadrado --> areaCuadrado
         */

        double lado = 2.0;
        double areaCuadrado = lado * lado;
        System.out.println("El área del cuadrado es: " + areaCuadrado);

        /*
         * Solución ejercicio #2
         * Entrada: radio del círculo, PI
         * Proceso: areaCirculo = PI * (r * r)
         * Salida: Área del Círculo -> areaCirculo
         */

         double r = 3.5;
         final double PI = 3.1416; //Constante
         double areaCirculo = PI * (r * r);
         System.out.println("El área del círculo es: " + areaCirculo);

        /*
         * Solución ejercicio #3
         * Entrada: °C y °F
         * Proceso: °C = (°F - 32) * (5/9) , °F = (°C * (9/5)) + 32
         * Salida: °C -> °F , °F -> °C
         */

        double C = 0.0;
        double F = 0.0;
        double gradosFarenheit = 0.0;
        double gradosCentigrados = 0.0;
        
        C = 1.0; //33.8°F
        F = 1.0; //-17.2222
        gradosCentigrados = (F - 32.0) * (5.0/9.0);
        gradosFarenheit = (C * (9.0/5.0)) + 32.0;

        System.out.println(C + "°C equivale a " + gradosFarenheit + "°F");
        System.out.println(C + "°F equivale a " + gradosCentigrados + "°C");
        
    }
}