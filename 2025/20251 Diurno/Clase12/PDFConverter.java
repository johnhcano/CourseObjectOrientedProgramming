public class PDFConverter extends Converter {

    private String rutaArchivo;

    public PDFConverter(String document, String rutaArchivo){
        super(document);
        this.rutaArchivo = rutaArchivo;
    }

    public void makeLine(){
        System.out.println("makeLine PDF");
    }

    public void makeParagraph(){
        System.out.println("makeParagraph PDF");
    }

    public void makeTable(){
        System.out.println("makeTable PDF");
    }

}
