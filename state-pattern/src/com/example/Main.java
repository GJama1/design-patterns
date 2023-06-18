package com.example;

import java.util.Set;

public class Main {


    public static void main(String[] args) {

        JukeBox jukeBox = new JukeBox(Set.of("Elvis", "Queen", "Metallica"));

        jukeBox.chooseSong("Queen");
        jukeBox.insertMoney();
        jukeBox.chooseSong("Elvis");
        jukeBox.ejectMoney();

        jukeBox.chooseSong("Metallica");
        jukeBox.insertMoney();
        jukeBox.playSong();
        jukeBox.pauseSong();
        jukeBox.stopSong();
    }


}