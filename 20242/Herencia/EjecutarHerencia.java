public class EjecutarHerencia {
    public static void main(String[] args) {

        //Creación de los Objetos
        Trabajador objT1 = new Vendedor(1, "Cristiano", "Textiles", 20.0);
        Trabajador objT2 = new Vendedor(2, "Messi", "Electrodomésticos", 10.0);

        Trabajador objT3 = new Operario(3, "Byron", "Dulcería", 200);
        Trabajador objT4 = new Operario(4, "Harvin", "Comestibles", 230);

        //System.out.println("Salario Vendedor: " + objT1.salario());
        //System.out.println("Salario Operario: " + objT3.salario());

        System.out.println(objT1 instanceof Vendedor); // prints true
        System.out.println(objT1 instanceof Trabajador); // prints true

        Trabajador[] t = new Trabajador[4];
        t[0] = objT1;
        t[1] = objT3;
        t[2] = objT2;
        t[3] = objT4;

        for(int i = 0; i < t.length; i++){
            System.out.println(t[i].getClass() + " - " + t[i].getNombre() + " " + t[i].salario());
        }
        
        
    }
} 
