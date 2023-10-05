package com.MadsMoeller.EnergydrinkList.repository;

import com.MadsMoeller.EnergydrinkList.entity.Drink;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DrinkRepository extends CrudRepository<Drink, Long> {
}
