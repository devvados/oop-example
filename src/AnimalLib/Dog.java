package AnimalLib;

import AnimalLib.Classes.Mammal;

public class Dog extends Mammal {
    public Dog(int temp) {
        super.setCurrentTemperature(temp);
    }
    @Override
    public void callSound() {
        System.out.println("Bark");
    }
    @Override
    public void move() {
        System.out.println("Dog can run");
    }
}
