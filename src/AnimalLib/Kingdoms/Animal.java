package AnimalLib.Kingdoms;

import AnimalLib.Features.IMakeSound;
import AnimalLib.Features.IMove;

public abstract class Animal implements IMakeSound, IMove {
    public abstract void callSound();
    public abstract void move();
}
