public class Fusil extends Arma {

    private String calibre;
    
    public Fusil(String nombre, int afectacion, String calibre){
        super(nombre, afectacion);
        this.calibre = calibre;
    }

    public String getCalibre() {
        return calibre;
    }

}