package com.MadsMoeller.EnergydrinkList.service;

import com.MadsMoeller.EnergydrinkList.entity.Drink;
import com.MadsMoeller.EnergydrinkList.repository.DrinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class DrinkServiceImpl implements DrinkService{

    @Autowired
    private DrinkRepository drinkRepository;

    // Save operation
    @Override
    public Drink saveDrink(Drink drink)
    {
        return drinkRepository.save(drink);
    }

    // Read operation
    @Override
    public List<Drink> fetchDrinkList()
    {
        return (List<Drink>)
                drinkRepository.findAll();
    }

    // Update operation
    @Override
    public Drink
    updateDrink(Drink drink,
                     Long drinkId)
    {
        Drink depDB
                = drinkRepository.findById(drinkId)
                .get();

        if (Objects.nonNull(drink.getDrinkId())
                && !"".equalsIgnoreCase(
                drink.getName())) {
            depDB.setName(
                    drink.getName());
        }

        if (Objects.nonNull(
                drink.getJScore()))
                 {
            depDB.setJScore(
                    drink.getJScore());
        }

        if (Objects.nonNull(drink.getKScore())) {
            depDB.setKScore(
                    drink.getKScore());
        }

        if (Objects.nonNull(drink.getMScore())) {
            depDB.setMScore(
                    drink.getMScore());
        }

        return drinkRepository.save(depDB);
    }

    // Delete operation
    @Override
    public void deleteDrinkById(Long drinkId)
    {
        drinkRepository.deleteById(drinkId);
    }
}
