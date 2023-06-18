package ge.tsu.command.commands;

public interface Command extends Runnable {

    String getCode();
    int getPriority();
    Command createCommand(int priority);

}
