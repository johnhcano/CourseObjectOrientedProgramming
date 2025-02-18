public class Button {
    
    private boolean illuminate = false;

    public Button(boolean illuminate) {
        this.illuminate = illuminate;
    }

    public boolean isIlluminate() {
        return illuminate;
    }

    public void illuminate(){
        this.illuminate = true;
    }

    public void cancelIlluminate(){
        this.illuminate = false;
    }

    public void status(){
        System.out.println("status");
    }

    @Override
    public String toString() {
        return "Button [illuminate=" + illuminate + "]";
    }

    
    
}
