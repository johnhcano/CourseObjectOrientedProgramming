public class ElevatorButton extends Button {

    private int floorNum;

    public ElevatorButton(boolean illuminate, int floorNum) {
        super(illuminate);
        this.floorNum = floorNum;
    }

    public int getFloorNum() {
        return floorNum;
    }

    @Override
    public String toString() {
        return "ElevatorButton [floorNum=" + floorNum + "]";
    }   
    
}