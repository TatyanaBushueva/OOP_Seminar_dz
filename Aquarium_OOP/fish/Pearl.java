package OOP.Aquarium_OOP.fish;

import OOP.Aquarium_OOP.SwimSpeed;
import OOP.Aquarium_OOP.fish.base.GoldenFish;

public class Pearl extends GoldenFish implements SwimSpeed {

    public Pearl(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return String.format("Pearl: %s, SwimSpeed: %d", super.toString(), getSwimSpeed());
    }



    @Override
    public int getSwimSpeed() {
        return 5;
    }
}
