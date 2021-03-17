package com.company;

public class CDPlayer extends SoundDevice {
    private String answer;
    public CDPlayer() {
        super("CDPlayer");
    }

    @Override
    public void play (SoundCarrier soundCarrier) {
    if (!(soundCarrier instanceof CD)) {
        answer = "Воспроизвести " + soundCarrier.getNameOfCarrier() + " устройством CDPlayer невозможно";
    } else answer = (soundCarrier.getSong() == null) ? "Музыкальный носитель " + soundCarrier.getNameOfCarrier() + " пуст" : getNameOfDevice() + "\nНазвание песни:" + soundCarrier.getSong().getNameOfSong() + "\nИсполнитель: " + soundCarrier.getSong().getNameOfPerformer();
    System.out.println(answer);
    }

}
