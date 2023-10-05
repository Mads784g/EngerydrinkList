package com.MadsMoeller.EnergydrinkList.service;

import com.MadsMoeller.EnergydrinkList.entity.Drink;

import java.util.List;

public interface DrinkService {

    //Save operation
    Drink saveDrink(Drink drink);

    // Read operation
    List<Drink> fetchDrinkList();

    // Update operation
    Drink updateDrink(Drink drink,
                      Long drinkId);

    // Delete operation
    void deleteDrinkById(Long drinkId);
}
