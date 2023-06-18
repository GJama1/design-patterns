package ge.tsu.command.commands;

public abstract class AbstractCommand implements Command {

    protected int priority;

    protected AbstractCommand() { }

    public AbstractCommand(int priority) {
        this.priority = priority;
    }

}
