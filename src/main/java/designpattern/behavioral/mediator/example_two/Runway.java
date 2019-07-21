package designpattern.behavioral.mediator.example_two;

public class Runway implements Command {

    private TrafficController airTrafficControl;

    public Runway(TrafficController airTrafficControl) {
        this.airTrafficControl = airTrafficControl;
        airTrafficControl.setLandingStatus(true);
    }

    @Override
    public void land() {
        System.out.println("Landing permission granted...");
        airTrafficControl.setLandingStatus(true);
    }

}
