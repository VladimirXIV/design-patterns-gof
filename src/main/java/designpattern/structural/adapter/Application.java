package designpattern.structural.adapter;


public class Application {

    public static void main(String[] args) {

        NewLineFormatter formatter = new NewLineFormatter();
        Editor editor = new TextLineEditor(formatter);

        System.out.println(editor.edit(" Hey you, see me, picture is crazy . . ."));
    }

}