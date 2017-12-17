import AnimalLib.Kingdoms.*;
import AnimalLib.Features.*;
import AnimalLib.*;;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[] {
            new Cat(36),
            new Dog(36),
            new Frog(3),
            new Shark(2),
            new Sparrow(40)
        };

        System.out.println("Let's see what our animals can do:");
        for (int i = 0; i < animals.length; i++) {
            animals[i].move();
        }

        System.out.println("\nNow let's see what they can say:");
        ShowPetSounds(animals);
    }

    public static void ShowPetSounds(IMakeSound[] petNoises) {
        for (int i = 0; i < petNoises.length; i++) {
            petNoises[i].callSound();
        }
    }
}

/* The execution result:
 *
 * Let's see what our animals can do:
 * Cat can run
 * Dog can run
 * Frog can jump
 * Shark can swim really fast
 * Sparrow can fly
 *
 * Now let's see what they can say:
 * Meow
 * Bark
 * Croak
 * Some shark's sounds
 * Tweet
 */