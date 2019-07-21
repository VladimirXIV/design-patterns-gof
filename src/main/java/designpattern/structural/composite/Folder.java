package designpattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder extends File {

    private String type = "folder";
    private List<File> files = new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    public void addFile(File file) {
        this.files.add(file);
    }

    public void removeFile(File file) {
        this.files.remove(file);
    }

    @Override
    public Double getSize() {
        return this.files.stream().mapToDouble(File::getSize).sum();
    }

    @Override
    public String getInfo() {
        return String.format("%s  %s  %s", this.type, this.name, this.getSize());
    }

    @Override
    public void showInfo() {
        System.out.println(this.getInfo());
        for (File file : this.files) {
            file.showInfo();
        }
    }
}
