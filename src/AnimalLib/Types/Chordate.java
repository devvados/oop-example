package AnimalLib.Types;

import AnimalLib.Kingdoms.Animal;

public abstract class Chordate extends Animal {
    private int bodyTemperature;

    public abstract void callSound();
    public abstract void move();

    public void setCurrentTemperature(int bt) {
        bodyTemperature = bt;
    }

    public int currentBloodTemperature(){
        return bodyTemperature;
    }
}
