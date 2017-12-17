package AnimalLib.Classes;

import AnimalLib.Types.Chordate;
import AnimalLib.Features.IWarmBlooded;

public abstract class Bird extends Chordate implements IWarmBlooded {
    @Override
    public boolean isOverheated(){
        return currentBloodTemperature() > 47;
    }
}
