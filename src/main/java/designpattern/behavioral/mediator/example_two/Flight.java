package designpattern.behavioral.mediator.example_two;

public class Flight implements Command {

    private TrafficController airTrafficControl;


    public Flight(TrafficController airTrafficControl) {
        this.airTrafficControl = airTrafficControl;
    }

    @Override
    public void land() {
        if (airTrafficControl.isLandingOk()) {
            System.out.println("Landing done . . .");
            airTrafficControl.setLandingStatus(true);
        } else {
            System.out.println("Landing done . . .");
        }
    }

    public void getReady() {
        System.out.println("Getting ready . . .");
    }
}
