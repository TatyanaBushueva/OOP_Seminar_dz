package OOP.seminar_4_dz.warriors;


import OOP.seminar_4_dz.shields.Shield;
import OOP.seminar_4_dz.weapons.rangedWeapon.Ranged;

public class Archer extends Warrior<Ranged, Shield>{
    public Archer(String name, int healthPoint, Ranged weapon, Shield shield) {
        super(name, healthPoint, weapon, shield);
    }

    public int distance(){
        return super.getWeapon().distance();
    }
    public int block() { return super.getShield().block();}


    @Override
    public String toString() {
        return String.format("Archer: %s, Distance: %d, Block: %d",super.toString(), distance(), block());
    }
}
