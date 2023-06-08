package OOP.Aquarium_OOP.fish;

import OOP.Aquarium_OOP.SwimSpeed;
import OOP.Aquarium_OOP.fish.base.Carp;

public class Barbus extends Carp implements SwimSpeed {
    public Barbus(String name) {
        super(name);
    }


    @Override
    public String toString() {
        return String.format("Barbus: %s, SwimSpeed: %d", super.toString(), getSwimSpeed());
    }


    @Override
    public int getSwimSpeed() {
        return 15;
    }
}
