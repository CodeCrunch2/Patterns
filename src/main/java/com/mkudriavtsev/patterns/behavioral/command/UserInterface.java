package main.java.com.mkudriavtsev.patterns.behavioral.command;

public class UserInterface {
    Command download;
    Command install;
    Command run;

    public UserInterface(Command download, Command install, Command run) {
        this.download = download;
        this.install = install;
        this.run = run;
    }

    public void downloadProgram() {
        download.execute();
    }
    public void installProgram() {
        install.execute();
    }
    public void runProgram() {
        run.execute();
    }
}
