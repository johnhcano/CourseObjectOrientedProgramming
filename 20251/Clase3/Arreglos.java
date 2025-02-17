public class Arreglos {
    public static void main(String[] args) {

        /*
         * Primera forma de declarar un arreglo:
         * int[] a = {8, 3, 10, 22, 1, 9};
         * 
         * Segunda forma de declarar un arreglo:
         * int[] a = new int[6];
         * El número hace referencia al tamaño del arreglo
         * tendremos que llenar el arreglo.
         */

        int[] a = { 8, 3, 10, 22, 1, 9 };

        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "]=" + a[i]);
        }
        
    }
}
