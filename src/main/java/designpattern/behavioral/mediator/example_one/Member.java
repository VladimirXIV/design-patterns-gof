package designpattern.behavioral.mediator.example_one;

import java.util.Objects;

public abstract class Member {

    protected Chat chat;
    protected String name;


    public Member(Chat chat, String name) {
        this.chat = chat;
        this.name = name;
    }

    public abstract void send(String message);

    public abstract void receive(String message);

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return Objects.equals(chat, member.chat) &&
                Objects.equals(name, member.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chat, name);
    }
}
