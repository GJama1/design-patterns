package ge.tsu.command.commands;

public class MarsCommand extends AbstractCommand {

    private static final String CODE = "mars";

    MarsCommand() {
        super();
    }

    public MarsCommand(int priority) {
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
        return new MarsCommand(priority);
    }

    @Override
    public void run() {

        System.out.println("Flying to Mars!");

        try {
            Thread.sleep(3000);
            System.out.println("Mars mission successful!");
        } catch (InterruptedException e) {
            System.out.println("Flying to Mars failed!");
        }

    }

}
