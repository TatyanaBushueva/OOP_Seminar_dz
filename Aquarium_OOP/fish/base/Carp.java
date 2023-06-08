package OOP.Aquarium_OOP.fish.base;

import OOP.Aquarium_OOP.fish.base.Fish;

public abstract class Carp extends Fish {
    public Carp(String name) {
        super(name);
    }

    @Override
    public String feed() {
         return "любой корм";
     }

}
