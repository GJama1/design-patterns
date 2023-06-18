package com.example.states;

import com.example.JukeBox;

public class StandBy extends State {

    public StandBy(JukeBox context) {
        super(context);
    }

    @Override
    public void chooseSong(String song) {
        if (context.getSongs().contains(song)) {
            context.setCurrentSong(song);
            context.setState(new SongChosen(context));
            System.out.println("Song Chosen: " + context.getCurrentSong());
        }
    }

}
