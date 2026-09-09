public class Door {
    
    private boolean close = true;

    public Door(boolean close) {
        this.close = close;
    }

    public boolean isClose() {
        return close;
    }

    public void close(){
        this.close = true;
    }

    public void open(){
        this.close = false;
    }

    @Override
    public String toString() {
        return "Door [close=" + close + "]";
    }

    

}