package com.example.states;

import com.example.JukeBox;

public abstract class State {

    protected JukeBox context;

    public State(JukeBox context) {
        this.context = context;
    }

    public void chooseSong(String song) {}

    public void insertMoney() {}

    public void ejectMoney() {}

    public void playSong() {}

    public void pauseSong() {}

    public void stopSong() {}

}
