package OOP.seminar_4_dz;

import OOP.seminar_4_dz.shields.BigShield;
import OOP.seminar_4_dz.shields.NormalShield;
import OOP.seminar_4_dz.shields.SmallShield;
import OOP.seminar_4_dz.warriors.Archer;
import OOP.seminar_4_dz.warriors.Infantryman;
import OOP.seminar_4_dz.warriors.Warrior;
import OOP.seminar_4_dz.weapons.meleeWeapon.Axe;
import OOP.seminar_4_dz.weapons.meleeWeapon.Sword;
import OOP.seminar_4_dz.weapons.rangedWeapon.Bow;
import OOP.seminar_4_dz.weapons.rangedWeapon.CrossBow;


public class MainClassForSeminarFour {
    public static void main(String[] args) {
        Team<Warrior> team1 = new Team<>();
        team1.add(new Archer("Robin", 100, new Bow(), new BigShield()));
        team1.add(new Infantryman("John", 150,new Axe(), new NormalShield()));

        Team<Archer> teamArchers = new Team<>();
        teamArchers.add(new Archer("Jimmy", 100, new CrossBow(), new SmallShield()));
        teamArchers.add(new Archer("Piter",100, new Bow(), new NormalShield()));

        Team<Infantryman> teamInfantryman = new Team<>();
        teamInfantryman.add(new Infantryman("James", 150, new Sword(), new BigShield()));

        System.out.println(team1);
        System.out.println("-----------");
        System.out.println(teamArchers);
        System.out.println("-----------");
        System.out.println(teamInfantryman);


        Battle battle1 = new Battle(new Infantryman("John", 150,new Axe(), new NormalShield()), (new Archer("Robin", 100, new Bow(), new BigShield())));

        battle1.fight();

    }
}
