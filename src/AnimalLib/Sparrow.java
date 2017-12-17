package AnimalLib;

import AnimalLib.Classes.Bird;

public class Sparrow extends Bird {
    public Sparrow(int temp) {
        super.setCurrentTemperature(temp);
    }
    @Override
    public void callSound() {
        System.out.println("Tweet");
    }

    @Override
    public void move() {
        System.out.println("Sparrow can fly");
    }
}
