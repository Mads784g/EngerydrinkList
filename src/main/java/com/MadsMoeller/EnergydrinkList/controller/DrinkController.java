package com.MadsMoeller.EnergydrinkList.controller;

import com.MadsMoeller.EnergydrinkList.entity.Drink;
import com.MadsMoeller.EnergydrinkList.service.DrinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class DrinkController {


    @Autowired
    private DrinkService drinkService;

    // Save operation
    @PostMapping("/drinks")
    public Drink saveDrink(
            @RequestBody Drink drink)
    {
        System.out.println(drink.getName());
        System.out.println(drink.getJScore());
        System.out.println(drink.getKScore());
        System.out.println(drink.getMScore());
        return drinkService.saveDrink(drink);
    }

    // Read operation
    @GetMapping("/drinks")
    public List<Drink> fetchDrinkList()
    {
        return drinkService.fetchDrinkList();
    }

    // Update operation
    @PutMapping("/drinks/{id}")
    public Drink
    updateDrink(@RequestBody Drink drink,
                     @PathVariable("id") Long drinkId)
    {
        return drinkService.updateDrink(
                drink, drinkId);
    }

    // Delete operation
    @DeleteMapping("/drinks/{id}")
    public String deleteDrinkById(@PathVariable("id")
                                       Long drinkId)
    {
        drinkService.deleteDrinkById(
                drinkId);
        return "Deleted Successfully";
    }
}
