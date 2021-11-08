package designpattern.behavioral.command.client;

import designpattern.behavioral.command.commandclass.OpenTextFileOperation;
import designpattern.behavioral.command.commandclass.SaveTextFileOperation;
import designpattern.behavioral.command.invoker.TextFileOperationExecutor;
import designpattern.behavioral.command.receiver.TextFile;

public class CommandPatternMain {

    public static void main(String[] args) {

        TextFileOperationExecutor textFileOperationExecutor = new TextFileOperationExecutor();

        String resultOpen = textFileOperationExecutor.executeOperation(new OpenTextFileOperation(new TextFile("file1.txt")));

        String resultSave = textFileOperationExecutor.executeOperation(new SaveTextFileOperation(new TextFile("file2.txt")));

        System.out.println(resultOpen + resultSave);
    }
}
