public class App {
    public static void main(String[] args) throws Exception {
        
        //Passenger pressed ElevatorButton
        Button elevatorButton = new ElevatorButton(true, 5);
        System.out.println("Pressed --> " + elevatorButton);
        //Update
        Elevator elevator = new Elevator(true, 5);
        System.out.println("Update --> " + elevator);
        //illuminate
        System.out.println("Illuminate --> " + elevatorButton.isIlluminate());
        //move
        System.out.print(" --> ");
        elevator.move();
    }
}
