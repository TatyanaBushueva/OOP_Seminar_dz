package OOP.Aquarium_OOP.fish.base;

import OOP.Aquarium_OOP.fish.base.Fish;

public abstract class GoldenFish extends Fish {

    public GoldenFish(String name) {
        super(name);
    }

     @Override
     public String feed() {
         return "любой корм";
     }

}
