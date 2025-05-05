public class ASCIIConverter extends Converter {

    private String rutaArchivo;

    public ASCIIConverter(String document, String rutaArchivo){
        super(document);
        this.rutaArchivo = rutaArchivo;
    }

    public void makeLine(){
        System.out.println("makeLine ASCII");
    }

    public void makeParagraph(){
        System.out.println("makeParagraph ASCII");
    }

    public void makeTable(){
        System.out.println("makeTable ASCII");
    }

}
