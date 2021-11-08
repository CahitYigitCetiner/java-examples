package designpattern.behavioral.command.invoker;

import designpattern.behavioral.command.commandclass.TextFileOperation;

import java.util.ArrayList;
import java.util.List;

/**
 * invoker class
 */
public class TextFileOperationExecutor {

    private final List<TextFileOperation> textFileOperations = new ArrayList<>();

    public String executeOperation(TextFileOperation textFileOperation) {
        textFileOperations.add(textFileOperation);
        return textFileOperation.execute();
    }

}
