package AnimalLib;

import AnimalLib.Classes.Fish;

public class Shark extends Fish {
    public Shark(int temp) {
        super.setCurrentTemperature(temp);
    }
    @Override
    public void callSound() {
        System.out.println("Some shark's sounds");
    }
    @Override
    public void move(){
        System.out.println("Shark can swim really fast");
    }
}
