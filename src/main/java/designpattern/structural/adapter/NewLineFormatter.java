package designpattern.structural.adapter;

public class NewLineFormatter {

    String format(String text) {
        return text.replace(",", "\n");
    }

}
