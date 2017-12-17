package AnimalLib.Classes;

import AnimalLib.Types.Chordate;
import AnimalLib.Features.IColdBlooded;

public abstract class Fish  extends Chordate implements IColdBlooded {
    @Override
    public boolean canLiveEverywhere(){
        return false;
    }
}
