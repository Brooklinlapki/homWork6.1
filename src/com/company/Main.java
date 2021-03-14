package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Boss boss = new Boss();
        boss.setHealth(100);
        boss.setDamage(25);
        boss.setSuperPower("Увеличение");
        boss.setTypeOfDefence("Отражение Удара");
        boss.setGiveWeapon("Пулемет");
        boss.setBullet(15);



        System.out.println("Здоровья : " + boss.getHealth()  + "\n" + "Удар : " + boss.getDamage() + "\n"
                + "Суперсила: " + boss.getSuperPower() + "\n" + "Тип защиты: " + boss.getTypeOfDefence() + "\n"
                + "Оружия: " + boss.getGiveWeapon() + "\n" + "Запас пули: " + boss.getBullet());

        System.out.println("---------");

        System.out.println(boss.printInfo());

        skeleton skeleton1 = new skeleton();
        skeleton1.setHealth(75);
        skeleton1.setDamage(15);
        skeleton1.setSuperPower("Ядовитая стрела");
        skeleton1.setTypeOfDefence("Алмазная броня");
        skeleton1.setGiveWeapon("Лук");
        skeleton1.setBullet(10);

        System.out.println("Здоровья : " + skeleton1.getHealth()  + "\n" + "Удар : " + skeleton1.getDamage() + "\n"
                + "Суперсила: " + skeleton1.getSuperPower() + "\n" + "Тип защиты: " + skeleton1.getTypeOfDefence() + "\n"
                + "Оружия: " + skeleton1.getGiveWeapon() + "\n" + "Запас лука: " + skeleton1.getBullet());

        System.out.println("---------");


        skeleton skeleton2 = new skeleton();
        skeleton2.setHealth(75);
        skeleton2.setDamage(15);
        skeleton2.setSuperPower("Огенная стрела");
        skeleton2.setTypeOfDefence("Золотая броня");
        skeleton2.setGiveWeapon("Лук");
        skeleton2.setBullet(10);

        System.out.println("Здоровья : " + skeleton2.getHealth()  + "\n" + "Удар : " + skeleton2.getDamage() + "\n"
                + "Суперсила: " + skeleton2.getSuperPower() + "\n" + "Тип защиты: " + skeleton2.getTypeOfDefence() + "\n"
                + "Оружия: " + skeleton2.getGiveWeapon() + "\n" + "Запас лука: " + skeleton2.getBullet());

        System.out.println("---------");

        skeleton.numberOfArrows = skeleton1.getBullet() + skeleton2.getBullet();
        System.out.println("Количество лука: " + skeleton.numberOfArrows);
    }
}
