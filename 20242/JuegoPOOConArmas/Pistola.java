public class Pistola extends Arma {

    private String calibre;
    
    public Pistola(String nombre, int afectacion, String calibre){
        super(nombre, afectacion);
        this.calibre = calibre;
    }

    public Pistola(){
        
    }

    public String getCalibre() {
        return calibre;
    }

    public String mostrarArma(){
        return getNombre();
    }

}