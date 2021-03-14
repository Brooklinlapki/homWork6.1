package com.company;

public class skeleton extends Boss{
    public static int numberOfArrows;


    public int getNumberOfArrows() {
        return numberOfArrows;
    }

    @Override
    public String printInfo() {
        return super.printInfo() + getNumberOfArrows();
    }
}

