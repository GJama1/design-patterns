package ge.tsu.memento;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.UUID;

public class Commit {
    private final String hash;
    private final File state;

    public Commit(File file) {

        hash = UUID.randomUUID().toString();
        String[] fileNameInfo = file.getName().split("\\.");
        String newFileName = fileNameInfo[0] + "-" + hash + "." + fileNameInfo[1];
        state = new File(newFileName);

        try {
            Files.copy(Paths.get(file.getPath()), new FileOutputStream(state));
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public File getState() {
        return state;
    }

    public String getHash() {
        return this.hash;
    }

}
