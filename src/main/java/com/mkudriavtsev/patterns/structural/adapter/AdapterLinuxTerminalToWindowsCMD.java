package main.java.com.mkudriavtsev.patterns.structural.adapter;

public class AdapterLinuxTerminalToWindowsCMD extends WindowsCMD implements LinuxTerminal {
    @Override
    public void bash() {
        cmd();
    }

    @Override
    public void env() {
        path();
    }

    @Override
    public void clear() {
        cls();
    }

    @Override
    public void cp() {
        xcopy();
    }
}
