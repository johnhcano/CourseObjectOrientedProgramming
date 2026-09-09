public class Elevator {

    private boolean direction;
    private int currentFloor;
    
    public Elevator(boolean direction, int currentFloor) {
        this.direction = direction;
        this.currentFloor = currentFloor;
    }

    public boolean isDirection() {
        return direction;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void move(){
        System.out.println("move");
    }

    public void stop(){
        System.out.println("stop");
    }
    
    public void status(){
        System.out.println("status");
    }

    @Override
    public String toString() {
        return "Elevator [currentFloor=" + currentFloor + ", direction=" + direction + "]";
    }

}