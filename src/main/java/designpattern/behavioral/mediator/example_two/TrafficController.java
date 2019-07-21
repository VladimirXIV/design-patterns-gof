package designpattern.behavioral.mediator.example_two;

public interface TrafficController {

    public void registerRunway(Runway runway);

    public void registerFlight(Flight flight);

    public boolean isLandingOk();

    public void setLandingStatus(boolean status);

}
