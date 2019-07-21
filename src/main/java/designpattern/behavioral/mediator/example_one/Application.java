package designpattern.behavioral.mediator.example_one;

public class Application {

    public static void main(String[] args) {

        Chat chat = new ChatRoom();

        Member memberOne = new ChatMember(chat, "Jonathan");
        Member memberTwo = new ChatMember(chat, "Brian");
        Member memberThree = new ChatMember(chat, "James");
        Member memberFour = new ChatMember(chat, "Ray");

        chat.addMember(memberOne);
        chat.addMember(memberTwo);
        chat.addMember(memberThree);
        chat.addMember(memberFour);

        memberFour.send("Hi everyone! Ray is here!");
        memberOne.send("Hello Ray! How are you?");
    }

}
