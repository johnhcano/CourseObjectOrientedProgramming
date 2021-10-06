public class ElevatorController {

    private int floorId;
    private int position;
    private boolean direction;
    private Elevator elevator;
    private Door door;
    private Button button;

    public ElevatorController(int floorId, int position, boolean direction, Elevator elevator, Door door,
            Button button) {
        this.floorId = floorId;
        this.position = position;
        this.direction = direction;
        this.elevator = elevator;
        this.door = door;
        this.button = button;
    }

    public int getFloorId() {
        return floorId;
    }

    public int getPosition() {
        return position;
    }

    public boolean isDirection() {
        return direction;
    }

    public Elevator getElevator() {
        return elevator;
    }

    public Door getDoor() {
        return door;
    }

    public Button getButton() {
        return button;
    }

    @Override
    public String toString() {
        return "ElevatorController [button=" + button + ", direction=" + direction + ", door=" + door + ", elevator="
                + elevator + ", floorId=" + floorId + ", position=" + position + "]";
    }
    
    

}
