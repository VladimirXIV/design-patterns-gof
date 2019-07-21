package designpattern.behavioral.mediator.example_one;

public interface Chat {

    public void sendMessage(String message, Member member);

    public void addMember(Member member);
}
