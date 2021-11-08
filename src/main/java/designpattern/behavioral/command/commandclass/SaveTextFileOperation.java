package designpattern.behavioral.command.commandclass;

import designpattern.behavioral.command.receiver.TextFile;

public class SaveTextFileOperation implements TextFileOperation{

    private TextFile textFile;

    public SaveTextFileOperation(TextFile textFile) {
        this.textFile = textFile;
    }

    @Override
    public String execute() {
        return textFile.save();
    }
}
