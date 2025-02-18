public class FloorButton extends Button {
    
    private int floorNum;
    private boolean direction;
    
    public FloorButton(boolean illuminate, int floorNum, boolean direction) {
        super(illuminate);
        this.floorNum = floorNum;
        this.direction = direction;
    }

    public int getFloorNum() {
        return floorNum;
    }

    public boolean isDirection() {
        return direction;
    }

    @Override
    public String toString() {
        return "FloorButton [direction=" + direction + ", floorNum=" + floorNum + "]";
    }
    
}
