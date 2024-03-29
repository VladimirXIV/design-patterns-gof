package designpattern.behavioral.mediator.example_two;

public class AirTrafficController implements TrafficController {

    private Flight flight;
    private Runway runway;
    public boolean land;

    @Override
    public void registerRunway(Runway runway) {
        this.runway = runway;
    }

    @Override
    public void registerFlight(Flight flight) {
        this.flight = flight;
    }

    @Override
    public boolean isLandingOk() {
        return land;
    }

    @Override
    public void setLandingStatus(boolean status) {
        this.land = status;
    }
}
