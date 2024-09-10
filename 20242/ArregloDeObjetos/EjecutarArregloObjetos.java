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

        //------------------ Arreglo de Objetos ------------------

        Producto objP1 = new Producto(1, "Pizza", 19900.0);
        Producto objP2 = new Producto(2, "Perrito Caliente", 15000.0);
        Producto objP3 = new Producto(3, "Hamburguesa", 25000.0);

        System.out.println(objP1);
        System.out.println(objP1.getNombre());
        objP1.setNombre("Pizza Mediana");
        System.out.println(objP1.getNombre());
        System.out.println(objP1);
        



    }
}