public class Ejercicio2 {
    public static void main(String[] args) {
        
        /*
         * Se tienen N empleados de una compañía y se ha ideado llenar un arreglo 
         * lineal A con sueldos de los empleados, un arreglo B con las asignaciones 
         * totales de cada empleado, un arreglo C con las deducciones de cada uno. 
         * Crear un arreglo T que contenga el neto a pagar a cada empleado. 
         * (Neto a pagar= sueldo + asignaciones - deducciones)
         */

         //Tener en cuenta que los arreglos todos deben ser del mismo tamaño

         //Sueldos de los empleados
         double[] A = { 1000.0, 1350.0, 900.0 };
         //Asignaciones totales de cada empleado
         double[] B = { 100.0, 230.0, 150.0 };
         //Deducciones de cada empleado
         double[] C = { 20.0, 35.0, 10.0 };

         //Arreglo que almacena el neto a pagar de cada empleado Ej: A.length --> 3
         double[] T = new double[A.length];
        //Asignación de la formula a cada posición del arreglo T
         for(int i = 0; i < T.length; i++){
            T[i] = A[i] + B[i] - C[i];
         }

         //Mostrar el neto a pagar de los empleados
        for (int i = 0; i < T.length; i++) {
            System.out.println("T[" + i + "]=" + T[i]);
        }

    }
}
