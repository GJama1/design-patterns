package ge.tsu.memento;

import java.util.*;
import java.util.List;

public class Git {

    private final IDE ide;
    public List<Commit> commits = new LinkedList<>();

    public Git(IDE ide) {
        this.ide = ide;
    }

    public void writeAndCommit(String text) {
        ide.writeToFile(text);
        commits.add(ide.commit());
    }

    public List<Commit> getCommits() {
        return commits;
    }

    public void revert() {
        ide.restore(Objects.requireNonNull(commits.get(commits.size()-2)));
    }

    public void revertByHash(String hash) {
        commits.stream()
                .filter(c -> c.getHash().equals(hash))
                .findFirst()
                .ifPresent(ide::restore);
    }

}
