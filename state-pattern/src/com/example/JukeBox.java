package com.example;

import com.example.states.StandBy;
import com.example.states.State;

import java.util.Set;

public class JukeBox {

    private final Set<String> songs;

    private State state;

    private String currentSong;

    public JukeBox(Set<String> songs) {
        this.songs = songs;
        this.state = new StandBy(this);
    }

    public void setState(State state) {
        this.state = state;
    }

    public Set<String> getSongs() {
        return songs;
    }

    public void setCurrentSong(String song) {
        this.currentSong = song;
    }

    public String getCurrentSong() {
        return currentSong;
    }

    public void chooseSong(String song) {
        state.chooseSong(song);
    }

    public void insertMoney() {
        state.insertMoney();
    }

    public void ejectMoney() {
        state.ejectMoney();
    }

    public void playSong() {
        state.playSong();
    }

    public void pauseSong() {
        state.pauseSong();
    }

    public void stopSong() {
        state.stopSong();
    }

}
