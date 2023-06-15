package OOP.seminar_4_dz.warriors;

import OOP.seminar_4_dz.shields.Shield;
import OOP.seminar_4_dz.weapons.meleeWeapon.Melee;

public class Infantryman extends Warrior<Melee, Shield>{

    public Infantryman(String name, int healthPoint, Melee weapon, Shield shield) {
        super(name, healthPoint, weapon, shield);
    }

    @Override
    public String toString() {
        return String.format("Infantryman: %s", super.toString());
    }
}
