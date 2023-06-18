package com.example.states;

import com.example.JukeBox;

public class Playing extends State {

    public Playing(JukeBox context) {
        super(context);
    }

    @Override
    public void pauseSong() {
        context.setState(new Paused(context));
        System.out.println("Pausing song: " + context.getCurrentSong());
    }

    @Override
    public void stopSong() {
        context.setCurrentSong(null);
        context.setState(new StandBy(context));
        System.out.println("Stopped");
    }

}
