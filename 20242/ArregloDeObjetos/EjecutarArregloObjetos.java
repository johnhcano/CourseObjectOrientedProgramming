import java.util.*;

public class EjecutarArregloObjetos {
    public static void main(String[] args) {
        
        //Opción 1 -  Creación del arreglo de enteros definidos
        int[] a = {6, 20, 31, 16};
        for(int i = 0; i < a.length; i++){
            System.out.println("a["+ i + "] = " + a[i]);
        }        
        
        //Opción 2 Creación del arreglo con valores aleatorios
        int[] b = new int[4];
        Random r = new Random();
        for(int i = 0; i < b.length; i++){
            b[i] = r.nextInt(20) + 1;
            //Mostrar los elementos del arreglo
            System.out.println("b["+ i + "] = " + b[i]);
        }



    }
}