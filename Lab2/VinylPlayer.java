package com.company;

public class VinylPlayer extends SoundDevice {
    private String answer;
    public VinylPlayer() {
        super("Vinyl player");
    }

    @Override
    public void play(SoundCarrier soundCarrier) {
        if (!(soundCarrier instanceof Vinyl)) {
            answer = "Воспроизвести " + soundCarrier.getNameOfCarrier() + " устройством Vinyl player невозможно";
        } else answer = (soundCarrier.getSong() == null) ? "Музыкальный носитель " + soundCarrier.getNameOfCarrier() + " пуст" : getNameOfDevice() + "\nНазвание песни:" + soundCarrier.getSong().getNameOfSong() + "\nИсполнитель: " + soundCarrier.getSong().getNameOfPerformer();
        System.out.println(answer);
    }
}
