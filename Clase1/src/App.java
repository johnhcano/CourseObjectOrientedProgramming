public class App {
    public static void main(String[] args) {
        
        Persona objPersona1 = new Persona("123","Byron","Cano",36,70.5);
        Persona objPersona2 = new Persona("5432","Harvin","Beltrán",35,91.5);
        
        Persona objPersona3 = new Persona();
        objPersona3.setCedula("98765");
        objPersona3.setNombre("Camila");
        objPersona3.setApellido("Cano");
        objPersona3.setEdad(12);
        objPersona3.setPeso(40.5);


        System.out.println(objPersona1.getNombre());
        System.out.println(objPersona2.getNombre());
        System.out.println(objPersona3.getNombre());
        System.out.println(objPersona1);
        System.out.println(objPersona2);
        System.out.println(objPersona3);
        
        System.out.println(objPersona1.jugar("Fútbol"));
        objPersona3.comer();
        objPersona2.comer();
        System.out.println(objPersona1.caminar(12.3));

        //--------------Arreglo de Objetos-------------
        Persona[] personas = new Persona[4];
        personas[0] = new Persona("1", "J", "C", 41, 75.0);
        personas[1] = new Persona("2", "H", "B", 5, 65.1);
        personas[2] = new Persona("3", "B", "F", 6, 78.9);
        personas[3] = new Persona("4", "K", "M", 18, 45.6);
        
        for(int i = 0; i < personas.length; i++){
            System.out.println(personas[i]);
        }

        System.out.println("--------");

        for(int i = 0; i < personas.length; i++){
            System.out.print(personas[i]);
            if(personas[i].getEdad() < 18){
                System.out.println(" ==> Menor de Edad....");
            }else{
                System.out.println(" ==> Mayor de Edad....");
            }
        }
        
    }

}
