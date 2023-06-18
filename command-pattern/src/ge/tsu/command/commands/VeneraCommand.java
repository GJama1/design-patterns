package ge.tsu.command.commands;

public class VeneraCommand extends AbstractCommand {

    private static final String CODE = "venera";

    VeneraCommand() {
        super();
    }

    public VeneraCommand(int priority) {
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
        return new VeneraCommand(priority);
    }

    @Override
    public void run() {

        System.out.println("Flying to Venera!");

        try {
            Thread.sleep(2500);
            System.out.println("Venera mission successful!");
        } catch (InterruptedException e) {
            System.out.println("Flying to Venera failed!");
        }

    }

}
