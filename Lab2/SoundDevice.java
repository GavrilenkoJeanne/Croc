package com.company;

public abstract class SoundDevice {
       private  String nameOfDevice;

    public SoundDevice(String nameOfDevice) {
        this.nameOfDevice = nameOfDevice;
    }

    public String getNameOfDevice() {
        return this.nameOfDevice;
    }

    public abstract void play (SoundCarrier soundCarrier);

}
