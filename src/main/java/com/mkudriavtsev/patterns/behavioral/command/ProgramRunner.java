package main.java.com.mkudriavtsev.patterns.behavioral.command;

public class ProgramRunner {
    public static void main(String[] args) {
        Program program = new Program();
        UserInterface userInterface = new UserInterface(
                new DownloadCommand(program),
                new InstallCommand(program),
                new RunCommand(program)
        );
        userInterface.downloadProgram();
        userInterface.installProgram();
        userInterface.runProgram();
    }
}
