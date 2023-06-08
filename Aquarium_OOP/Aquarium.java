package OOP.Aquarium_OOP;

import OOP.Aquarium_OOP.fish.base.Fish;


import java.util.ArrayList;
import java.util.List;

public class Aquarium {
    private final List<Fish> aquarium = new ArrayList<>();

    public Aquarium addFish(Fish fish) {
        aquarium.add(fish);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("Рыбки в аквариуме:\n");
        for (Fish fish : aquarium) {
            builder.append(fish).append('\n');
        }
        return builder.toString();
    }

 
      private List<SwimSpeed> getSwimmers() {
        List<SwimSpeed> swimmers = new ArrayList<>();
        for (Fish fish : aquarium) {
            if (fish instanceof SwimSpeed) {
                swimmers.add((SwimSpeed) fish);
            }
        }
        return swimmers;
    }

    public SwimSpeed getFastestSwimmer() {
        List<SwimSpeed> swimmers = getSwimmers();
        SwimSpeed fastestSwimmer = swimmers.get(0);
        for (SwimSpeed swimmer : swimmers) {
            if (swimmer.getSwimSpeed() > fastestSwimmer.getSwimSpeed()) {
                fastestSwimmer = swimmer;
            }
        }
        return fastestSwimmer;
    }
  

}
