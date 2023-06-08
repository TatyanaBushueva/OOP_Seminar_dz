package OOP.Aquarium_OOP.fish;

import OOP.Aquarium_OOP.fish.base.Predator;
import OOP.Aquarium_OOP.SwimSpeed;

public class Piranha extends Predator implements SwimSpeed {
    public Piranha(String name) {
        super(name);
    }


    @Override
    public String feed() {
        return "рыбки";
    }


    @Override
    public String toString() {
        return String.format("Piranha: %s, SwimSpeed: %d", super.toString(), getSwimSpeed());
    }

    @Override
    public int getSwimSpeed() {
        return 20;
    }


}
