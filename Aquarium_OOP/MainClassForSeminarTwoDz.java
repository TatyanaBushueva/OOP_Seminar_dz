package OOP.Aquarium_OOP;

import OOP.Aquarium_OOP.fish.Aravana;
import OOP.Aquarium_OOP.fish.Barbus;
import OOP.Aquarium_OOP.fish.Pearl;
import OOP.Aquarium_OOP.fish.Piranha;

public class MainClassForSeminarTwoDz {
    public static void main(String[] args) {

        Aquarium aquarium = new Aquarium();
        aquarium.addFish(new Aravana("KiKi")).addFish(new Barbus("MiKi")).addFish(new Pearl("Donald")).addFish(new Piranha("Sava"));
        System.out.println(aquarium);

        System.out.println("--Самый быстрый пловец--");
        System.out.println(aquarium.getFastestSwimmer());
       

    }
}
