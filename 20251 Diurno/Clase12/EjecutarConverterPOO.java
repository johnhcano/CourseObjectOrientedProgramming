import java.nio.ReadOnlyBufferException;

public class EjecutarConverterPOO {
    
    public static void main(String[] args) {
        
        Converter objASCII = new ASCIIConverter("Libro", "c:libros");
        Converter objPostScript = new PostScriptConverter("Libro", "c:Libros");
        Converter objPDF = new PDFConverter("Libro", "c:libros");

        Reader objLector = new Reader("LINE", objPDF);

        System.out.println(objLector.parseInput());

    }
}
