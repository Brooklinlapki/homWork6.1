package com.company;

public class Boss extends GameEntity {
    private String giveWeapon;
    private int bullet;

    public String getGiveWeapon() {
        return giveWeapon;
    }

    public void setGiveWeapon(String giveWeapon) {
        this.giveWeapon = giveWeapon;
    }

    public int getBullet() {
        return bullet;
    }

    public void setBullet(int bullet) {
        this.bullet = bullet;
    }

    public String printInfo(){
        return "Здоровья : " + getHealth()  + "\n" + "Удар : " + getDamage() + "\n"
                + "Суперсила: " + getSuperPower() + "\n" + "Тип защиты: " + getTypeOfDefence()
                + "\n" + "Оружия: " + getGiveWeapon() + "\n" + "Запас пули: " + getBullet() + "\n";
    }
}
