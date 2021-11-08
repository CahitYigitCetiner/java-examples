package designpattern.behavioral.command.receiver;

/**
 * Receiver class
 */
public class TextFile {

    private String name;

    public TextFile(String name) {
        this.name = name;
    }


    public String open() {
        return "opening file: " + name;
    }

    public String save() {
        return "saving file: " + name;
    }
}
