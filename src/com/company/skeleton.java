package com.company;

public class skeleton extends Boss{
    private static int numberOfArrows;


    public skeleton(){
        numberOfArrows++;
    }


    public int getNumberOfArrows() {
        return numberOfArrows;
    }

    @Override
    public String printInfo() {
        return super.printInfo() + getNumberOfArrows();
    }

    public static void sum(int bullet1, int bullet2) {
        int c = calculate.addition(bullet1, bullet2);
        System.out.println("Количество лука: " + c);
    }
}
