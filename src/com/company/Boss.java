package com.company;

public class Boss extends GameEntity {
    Weapon weapon = new Weapon();

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String printInfo(){
        return "Здоровья : " + getHealth()  + "\n" + "Удар : " + getDamage() + "\n"
                + "Суперсила: " + getSuperPower() + "\n" + "Тип защиты: " + getTypeOfDefence() + "\n"
                + "Имя оружия: " + weapon.nameOfWeapon + "\n" + "Тип оружия: " +  weapon.typeOfWeapon;
    }
}
