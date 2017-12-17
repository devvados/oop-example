package AnimalLib;

import AnimalLib.Classes.Mammal;

public class Cat extends Mammal {
    public Cat(int temp) {
        super.setCurrentTemperature(temp);
    }
    @Override
    public void callSound() {
        System.out.println("Meow");
    }
    @Override
    public void move() {
        System.out.println("Cat can run");
    }
}