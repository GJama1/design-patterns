package ge.tsu.command;

import ge.tsu.command.commands.Command;
import ge.tsu.command.commands.CommandManager;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class NasaSuperComputer {

    private static final String EXIT_COMMAND = "Q";
    private static final int THREAD_POOL_SIZE = 4;

    private final Queue<Command> executionQueue = new PriorityQueue<>(Comparator.comparingInt(Command::getPriority).reversed());
    private final CommandManager commandManager = new CommandManager();
    private final Executor commandExecutor = Executors.newFixedThreadPool(THREAD_POOL_SIZE);

    public void submitCommand(String commandCode, int priority) {
        try {
            Command command = commandManager.getCommand(commandCode, priority);
            executionQueue.add(command);
            commandExecutor.execute(executionQueue.poll());
        }
        catch (NullPointerException e) {
            System.out.println("Invalid command!");
        }
    }

    public void initialize() {

        Scanner input = new Scanner(System.in);
        System.out.println("Supercomputer initialized. Awaiting command...");

        while (true) {

            System.out.println("Press q to quit. Available commands: " + commandManager.getAvailableCommands());
            String command = input.nextLine();

            if (EXIT_COMMAND.equalsIgnoreCase(command)) {
                System.exit(0);
            }

            System.out.println("Enter execution priority number...");
            int priority = Integer.parseInt(input.nextLine());

            submitCommand(command, priority);

        }

    }

}
