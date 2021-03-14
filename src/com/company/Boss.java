package com.company;

public class Boss extends GameEntity {
    private String giveWeapon;

    public String getGiveWeapon() {
        return giveWeapon;
    }

    public void setGiveWeapon(String giveWeapon) {
        this.giveWeapon = giveWeapon;
    }

    public String printInfo(){
        return "Здоровья : " + getHealth()  + "\n" + "Удар : " + getDamage() + "\n"
                + "Суперсила: " + getSuperPower() + "\n" + "Тип защиты: " + getTypeOfDefence()
                + "\n" + "Оружия: " + getGiveWeapon();
    }
}
