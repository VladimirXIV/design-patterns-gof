package designpattern.structural.adapter;

public class TabFormatter {

    String format(String text) {
        return text.replace(".", "\t");
    }

}
