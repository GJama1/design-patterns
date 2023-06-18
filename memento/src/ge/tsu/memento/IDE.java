package ge.tsu.memento;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class IDE {

    private final File file;
    private PrintWriter writer;

    public IDE(File file) {
        this.file = file;
        try {
            this.writer = new PrintWriter(new FileWriter(file), true);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    public void writeToFile(String text) {
        writer.println(text);
    }

    public Commit commit() {
        return new Commit(file);
    }

    public void restore(Commit commit) {
        try {
            Files.copy(Paths.get(commit.getState().getPath()), new FileOutputStream(file));
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
