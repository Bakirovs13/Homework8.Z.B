package com.company.players;

public class Tank extends Hero {
    private  int savepoint;

    public Tank(int health, int damage,int savepoint ) {
        super(health, damage, SuperAbility.SAVE_DAMAGE_AND_REVERT);
        this.savepoint = savepoint;


        //Tank должен получать от босса урон, и потом наносить ему свой урон + полученный от босса

    }



    public int getSavepoint() {
        return savepoint;
    }

    public void setSavepoint(int savepoint) {
        this.savepoint = savepoint;
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        if ( boss.getHealth() > 0){     //если здоровье босса больше 0
            boss.setHealth(boss.getHealth() - savepoint );     // здоровье босса равно  - балл
            System.out.println("Double attack from TANK: " + savepoint  );
        }


    }
}
