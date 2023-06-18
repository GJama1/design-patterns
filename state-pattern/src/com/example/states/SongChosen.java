package com.example.states;

import com.example.JukeBox;

public class SongChosen extends State {

    public SongChosen(JukeBox context) {
        super(context);
    }

    @Override
    public void chooseSong(String song) {
        if (context.getSongs().contains(song)) {
            context.setCurrentSong(song);
            System.out.println("Song Chosen: " + context.getCurrentSong());
        }
    }

    @Override
    public void insertMoney() {
        context.setState(new ReadyToPlay(context));
        System.out.println("Money Inserted");
    }

}
