package ge.tsu.command.commands;

import java.util.*;

public class CommandManager {

    private final Map<String, Command> commands = new HashMap<>();

    public CommandManager() {

        addCommand(new MoonCommand());
        addCommand(new MarsCommand());
        addCommand(new VeneraCommand());

    }

    public Command getCommand(String code, int priority) throws NullPointerException {
        Command command = Objects.requireNonNull(commands.get(code));
        return command.createCommand(priority);
    }

    public List<String> getAvailableCommands() {
        return new ArrayList<>(commands.keySet());
    }

    private void addCommand(Command command) {
        commands.put(command.getCode(), command);
    }

}
