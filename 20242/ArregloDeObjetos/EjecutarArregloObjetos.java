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

        //Se crea el arreglo de objetos (Producto)
        Producto[] p = new Producto[3];
        //Se guardan los objetos creados en el arreglo de tipo Producto
        p[0] = objP1;
        p[1] = objP2;
        p[2] = objP3;
        
        //Calcular el precio total de todos los productos que estan dentro
        // del arreglo

        double precioTotal = 0.0;
        for(int i = 0; i < p.length; i++){
            precioTotal += p[i].getPrecio();
            System.out.printf("%d\t %s\t %10.2f\t \n", p[i].getId(), p[i].getNombre(), p[i].getPrecio());
        }

    System.out.println("La factura está por: " + precioTotal);


    }
}