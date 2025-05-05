public class Reader {

    private String element;
    private Converter converter; //Composición

    public Reader(String element, Converter converter){
        this.element = element;
        this.converter = converter;
    }

    public String getElement() {
        return element;
    }

    public void parseInput(){
        switch(element){
            case "LINE":
                converter.makeLine();
                break;
            case "PARAGRAPH":
                converter.makeParagraph();
                break;
            case "TABLE":
                converter.makeTable();
                break;
            default:
                System.out.println("Opción no válida");
        }
    }

}
