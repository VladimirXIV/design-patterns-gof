package designpattern.behavioral.mediator.example_one;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements Chat {

    private List<Member> chatMembers;


    public ChatRoom() {
        this.chatMembers = new ArrayList<>();
    }


    @Override
    public void sendMessage(String message, Member member) {

        chatMembers.forEach(chatMember -> {

            if (!chatMember.equals(member)) {
                chatMember.receive(message);
            }

        });

    }

    @Override
    public void addMember(Member member) {
        this.chatMembers.add(member);
    }
}
