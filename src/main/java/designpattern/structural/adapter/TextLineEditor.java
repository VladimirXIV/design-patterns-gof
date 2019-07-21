package designpattern.structural.adapter;

public class TextLineEditor extends Editor {

    NewLineFormatter formatter;

    public TextLineEditor(NewLineFormatter formatter) {
        this.formatter = formatter;
    }

    @Override
    public String edit(String text) {
        return formatter.format(text);
    }
}
