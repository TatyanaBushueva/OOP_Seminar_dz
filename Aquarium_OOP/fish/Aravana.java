package OOP.Aquarium_OOP.fish;

import OOP.Aquarium_OOP.SwimSpeed;
import OOP.Aquarium_OOP.fish.base.Predator;

public class Aravana extends Predator implements SwimSpeed {
    public Aravana(String name) {
        super(name);
    }



    @Override
    public String toString() {
        return String.format("Aravana: %s, SwimSpeed: %d", super.toString(), getSwimSpeed());
    }



    @Override
    public int getSwimSpeed() {
        return 10;
    }


}
