package com.example;


//Create a function that returns the name of the winner in a fight between two fighters.
//
//        Each fighter takes turns attacking the other and whoever kills the other first is victorious. Death is defined as having health <= 0.
//
//        Each fighter will be a Fighter object/instance. See the Fighter class below in your chosen language.
//
//        Both health and damagePerAttack (damage_per_attack for python) will be integers larger than 0. You can mutate the Fighter objects.
//
//        Example:

public class Fighter {
    public String name;
    public int health, damagePerAttack;
    public Fighter(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }
}
public class KataDeclareWinner {
    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        int moves1 = (int) Math.ceil( (double)fighter2.health / fighter1.damagePerAttack);
        int moves2 = (int) Math.ceil( (double)fighter1.health / fighter2.damagePerAttack);
        if (moves1 > moves2) {
            return fighter2.name;
        } else if (moves1 < moves2) {
            return fighter1.name;
        } else {
            return firstAttacker;
        }
    }
}


//    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
//        double attacksToKill1 = Math.ceil((double) fighter2.health / fighter1.damagePerAttack) + (fighter1.name.equals(firstAttacker) ? 0 : 1);
//        double attacksToKill2 = Math.ceil((double) fighter1.health / fighter2.damagePerAttack);
//
//        return attacksToKill1 <= attacksToKill2 ? fighter1.name : fighter2.name;
//    }
