package com.example.states;

import com.example.JukeBox;

public class ReadyToPlay extends State {

    public ReadyToPlay(JukeBox context) {
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
    public void ejectMoney() {
        context.setCurrentSong(null);
        context.setState(new StandBy(context));
        System.out.println("Money Ejected");
    }

    @Override
    public void playSong() {
        context.setState(new Playing(context));
        System.out.println("Playing: " + context.getCurrentSong());
    }

}
