package com.MadsMoeller.EnergydrinkList.entity;

import java.util.ArrayList;

public class DrinkList {
    private ArrayList<Drink> drinkList = new ArrayList<Drink>();

    public void addDrink(String name, int JScore, int KScore, int MScore) {

        drinkList.add(new Drink(name, JScore, KScore, MScore));
    }

    public String print() {
        String result = "";
        for (Drink drink : drinkList) {
            result = result + String.format("%s %s %s %s \n",drink.getName(), drink.getJScore(), drink.getKScore(), drink.getMScore());

        }
        return result;
    }
}
