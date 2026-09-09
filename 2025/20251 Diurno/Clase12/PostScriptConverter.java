public class PostScriptConverter extends Converter {

    private String rutaArchivo;

    public PostScriptConverter(String document, String rutaArchivo){
        super(document);
        this.rutaArchivo = rutaArchivo;
    }

    public void makeLine(){
        System.out.println("makeLine PostScript");
    }

    public void makeParagraph(){
        System.out.println("makeParagraph PostScript");
    }

    public void makeTable(){
        System.out.println("makeTable PostScript");
    }

}
