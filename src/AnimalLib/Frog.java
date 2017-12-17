package AnimalLib;


import AnimalLib.Classes.Amphibian;

public class Frog extends Amphibian {
    public Frog(int temp){
        super.setCurrentTemperature(temp);
    }
    @Override
    public void callSound() {
        System.out.println("Croak");
    }
    @Override
    public void move() {
        System.out.println("Frog can jump");
    }
}