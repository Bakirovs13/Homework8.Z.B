package com.company.players;

import java.util.Random;

public class Warrior extends Hero{
    private int Randomdamagepoint;



    public Warrior(int health, int damage,int randomdamagepoint) {
        super(health, damage, SuperAbility.CRITICAL_DAMAGE);
        this.Randomdamagepoint = randomdamagepoint;

    }


    public int getRandomdamagepoint() {
        return Randomdamagepoint;
    }

    public void setRandomdamagepoint(int damagepoint) {
        Randomdamagepoint = damagepoint;
    }


    //Warrior каждый раз при атаке критует, т.е. каждая атака умножается на случайное число от 2 до 4.

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        Random random = new Random();
        int koeff = random.nextInt(5);
        if ( boss.getHealth() > 0){
            if (koeff == 2){
                boss.setHealth(boss.getHealth() - Randomdamagepoint*koeff);
                System.out.println("Warrior is using ability: " + koeff+"x" );
            }
            if (koeff == 3){
                boss.setHealth(boss.getHealth() - Randomdamagepoint*koeff);
                System.out.println("Warrior is using ability: " + koeff+"x" );
            }
            if (koeff == 4){
                boss.setHealth(boss.getHealth() - Randomdamagepoint*koeff);
                System.out.println("Warrior is using ability: " + koeff+"x" );
            }
        }



    }
}
