public class Ejecutar {

    public static void main(String[] args){
        //Creación del objeto
        Marcador objMarcador1 = new Marcador("edding", "rojo", 1.2, true);
        System.out.println(objMarcador1.toString());
        objMarcador1.rayar();
        System.out.println(objMarcador1.recargar(10.0));
    }
    
}
