package ge.tsu.memento;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        IDE ide = new IDE(new File("file.txt"));
        Git git = new Git(ide);

        git.writeAndCommit("Hello");
        git.writeAndCommit("World");

        //Revert to Hello
        git.revert();

        //Revert back to Hello World
        Commit latestCommit = git.getCommits().get(1);
        git.revertByHash(latestCommit.getHash());
    }
}