package ge.tsu.command.commands;

public class MoonCommand extends AbstractCommand {

    private static final String CODE = "moon";

    MoonCommand() {
        super();
    }

    public MoonCommand(int priority) {
        super(priority);
    }

    @Override
    public String getCode() {
        return CODE;
    }

    @Override
    public int getPriority() {
        return priority;
    }

    @Override
    public Command createCommand(int priority) {
        return new MoonCommand(priority);
    }

    @Override
    public void run() {

        System.out.println("Flying to the Moon!");

        try {
            Thread.sleep(1500);
            System.out.println("Moon mission successful!");
        } catch (InterruptedException e) {
            System.out.println("Flying to the Moon failed!");
        }

    }

}
