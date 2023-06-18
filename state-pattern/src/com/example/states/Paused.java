package com.example.states;

import com.example.JukeBox;

public class Paused extends State {

    public Paused(JukeBox context) {
        super(context);
    }

    @Override
    public void playSong() {
        context.setState(new Playing(context));
        System.out.println("com.example.states.Playing: " + context.getCurrentSong());
    }

    @Override
    public void stopSong() {
        context.setCurrentSong(null);
        context.setState(new StandBy(context));
        System.out.println("Stopped");
    }

}
