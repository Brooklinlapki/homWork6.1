package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Boss boss = new Boss();
        boss.setHealth(100);
        boss.setDamage(25);
        boss.setSuperPower("Увеличение");
        boss.setTypeOfDefence("Отражение Удара");
        boss.weapon.nameOfWeapon = "Уничтожитель";
        boss.weapon.typeOfWeapon = "Пулемет";

        System.out.println("Здоровья : " + boss.getHealth()  + "\n" + "Удар : " + boss.getDamage() + "\n"
                + "Суперсила: " + boss.getSuperPower() + "\n" + "Тип защиты: " + boss.getTypeOfDefence() + "\n"
                + "Имя оружия: " + boss.weapon.nameOfWeapon + "\n" + "Тип оружия: " +  boss.weapon.typeOfWeapon);
        System.out.println("---------");

        System.out.println(boss.printInfo());

        System.out.println("---------");

        skeleton skeleton1 = new skeleton();
        skeleton1.setHealth(75);
        skeleton1.setDamage(15);
        skeleton1.setSuperPower("Увеличение");
        skeleton1.setTypeOfDefence("Алмазные доспехи");
        skeleton1.weapon.nameOfWeapon = "Огненная стрела";
        skeleton1.weapon.typeOfWeapon = "Лук";


        System.out.println("Здоровья : " + skeleton1.getHealth()  + "\n" + "Удар : " + skeleton1.getDamage() + "\n"
                + "Суперсила: " + skeleton1.getSuperPower() + "\n" + "Тип защиты: " + skeleton1.getTypeOfDefence() + "\n"
                + "Имя оружия: " + skeleton1.weapon.nameOfWeapon + "\n" + "Тип оружия: " + skeleton1.weapon.typeOfWeapon);




        skeleton skeleton2 = new skeleton();
        skeleton2.setHealth(75);
        skeleton2.setDamage(15);
        skeleton2.setSuperPower("Увеличение");
        skeleton2.setTypeOfDefence("Золотые доспехи");
        skeleton2.weapon.nameOfWeapon = "Ядовитая стрела";
        skeleton2.weapon.typeOfWeapon = "Лук";

        System.out.println("---------");

        System.out.println("Здоровья : " + skeleton2.getHealth()  + "\n" + "Удар : " + skeleton2.getDamage() + "\n"
                + "Суперсила: " + skeleton2.getSuperPower() + "\n" + "Тип защиты: " + skeleton2.getTypeOfDefence() + "\n"
                + "Имя оружия: " + skeleton2.weapon.nameOfWeapon + "\n" + "Тип оружия: " + skeleton2.weapon.typeOfWeapon);

        System.out.println("---------");

        System.out.println("Количество луков: " + skeleton.numberOfArrows);
    }
}
