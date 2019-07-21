package designpattern.behavioral.mediator.example_two;

import designpattern.behavioral.mediator.example_one.Chat;
import designpattern.behavioral.mediator.example_one.ChatMember;
import designpattern.behavioral.mediator.example_one.ChatRoom;
import designpattern.behavioral.mediator.example_one.Member;

public class Application {

    public static void main(String[] args) {

        TrafficController trafficController = new AirTrafficController();

        Flight sparrowFourteen = new Flight(trafficController);
        Runway mainRunway = new Runway(trafficController);

        trafficController.registerFlight(sparrowFourteen);
        trafficController.registerRunway(mainRunway);

        sparrowFourteen.getReady();
        mainRunway.land();
        sparrowFourteen.land();

    }

}
