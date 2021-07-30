package com.company.players;

import java.util.Random;

public class Thor {   //extends
    private int ThorDamage;

//    public int getThorDamage() {
//        return ThorDamage;
//    }
//
//    public void setThorDamage(int thorDamage) {
//        ThorDamage = thorDamage;
//    }
//
//    public Thor(int health, int damage, int ThorDamage) {
//        super(health, damage);
//    }
////Добавить еще игрока, Thor, имеет шанс оглушить босса на раунд, вследствие чего босс пропускает раунд и не бьёт
//    @Override
//    public void applySuperAbility(Boss boss, Hero[] heroes) {
//        for (int i = 0; i < heroes.length; i++) {
//            if (heroes[i].getHealth() > 0) {
//                boss.setHealth(boss.getHealth() - ThorDamage);
//                if (boss.getHealth() - ThorDamage < 0) {
//                    boss.setHealth(0);
//                    Random random = new Random();
//                    int  a  = random.nextInt(2);
//                    if (heroes[i].getHealth() > 0 && a > 0){
//                        System.out.println("Thor оглушил");
//                        if (heroes[0].getHealth() > 250 && a > 0){
//                            heroes[i].setHealth(250);
//                        }
//                    }
//                    if (heroes[i].getHealth() > 0 && a == 0 ){
//                        heroes[i].setHealth(heroes[i].getHealth() - boss.getDamage());
//                    }
//
//                }
//
//            }
//
//    }
}
