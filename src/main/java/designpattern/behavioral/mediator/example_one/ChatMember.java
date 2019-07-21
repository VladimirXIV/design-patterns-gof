package designpattern.behavioral.mediator.example_one;

public class ChatMember extends Member {

    public ChatMember(Chat chat, String name) {
        super(chat, name);
    }


    @Override
    public void send(String message) {
        System.out.println(String.format("{} | sending message: {} \n ", this.name, message));
        chat.sendMessage(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println(String.format("{} | received message: {} \n ", this.name, message));
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
}
