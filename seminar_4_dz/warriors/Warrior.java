package OOP.seminar_4_dz.warriors;

import OOP.seminar_4_dz.shields.Shield;
import OOP.seminar_4_dz.weapons.Weapon;

import java.util.Random;

public abstract class Warrior<W extends Weapon, S extends Shield> {
    private final String name;
    private int healthPoint;
    private W weapon;

    private S shield;

    public Warrior(String name, int healthPoint, W weapon) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.weapon = weapon;
        this.shield = null;
    }
    public Warrior(String name, int healthPoint, W weapon, S shield) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.weapon = weapon;
        this.shield = shield;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public W getWeapon() {
        return weapon;
    }

    public S getShield() {
        return  shield;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public void setWeapon(W weapon) {
        this.weapon = weapon;
    }

    public void setShield(S shield) {
        this.shield = shield;
    }

    public int hit() {
        Random rnd = new Random();

        return rnd.nextInt(0, weapon.damage() + 1);
    }

    public void reduceHealth(int damage) {
        int block = 0;
        if (shield != null) {
            block = shield.block();
        }
        damage -= block;
        if (damage < 0) {
            damage = 0;
        }
        healthPoint -= damage;
        if (healthPoint < 0) {
            healthPoint = 0;
        }
    }


    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Name: ").append(name).append(",");
        builder.append(" Weapon: ").append(weapon).append(",");
        if (shield != null){
            builder.append(" Shield: ").append(shield).append(",");
        }
        builder.append(" HealthPoint: ").append(healthPoint);
        return builder.toString();
    }
}
