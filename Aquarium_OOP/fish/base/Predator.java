package OOP.Aquarium_OOP.fish.base;

import OOP.Aquarium_OOP.fish.base.Fish;

public abstract class Predator extends Fish {

    public Predator(String name) {
        super(name);
    }

     @Override
     public String feed() {
         return "мясо";
     }

}
