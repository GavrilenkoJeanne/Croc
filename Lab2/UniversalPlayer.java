package com.company;

public class UniversalPlayer extends SoundDevice{

    private String answer;
    public UniversalPlayer() {
        super("Universal player");
    }

    @Override
    public void play(SoundCarrier soundCarrier) {
        if (!(soundCarrier instanceof FlashDrive || soundCarrier instanceof CD)) {
            answer = "Воспроизвести " + soundCarrier.getNameOfCarrier() + " устройством Universal player невозможно";
        } else answer = (soundCarrier.getSong() == null) ? "Музыкальный носитель " + soundCarrier.getNameOfCarrier() + " пуст" : getNameOfDevice() + "\nНазвание песни:" + soundCarrier.getSong().getNameOfSong() + "\nИсполнитель: " + soundCarrier.getSong().getNameOfPerformer();
        System.out.println(answer);
    }
}
