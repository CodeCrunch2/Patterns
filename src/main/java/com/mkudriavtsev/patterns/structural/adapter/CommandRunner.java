package main.java.com.mkudriavtsev.patterns.structural.adapter;

public class CommandRunner {
    public static void main(String[] args) {
        LinuxTerminal linuxTerminal = new AdapterLinuxTerminalToWindowsCMD();
        linuxTerminal.bash();
        linuxTerminal.env();
        linuxTerminal.clear();
        linuxTerminal.cp();
    }
}
