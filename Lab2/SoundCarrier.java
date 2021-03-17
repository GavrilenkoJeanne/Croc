package com.company;

public class SoundCarrier {
    private String nameOfCarrier;
    private Song song;

    public SoundCarrier(String nameOfCarrier) {
        this.nameOfCarrier = nameOfCarrier;
    }

    public Song getSong() {
        return this.song;
    }

    public String getNameOfCarrier() {
        return this.nameOfCarrier;
    }

    public void setNameOfCarrier(String nameOfCarrier) {
        this.nameOfCarrier = nameOfCarrier;
    }

    public void writeSong (Song song) {
        this.song = song;
        System.out.println("Песня " + song.getNameOfSong() + " записана на " + getNameOfCarrier());
    }



}
