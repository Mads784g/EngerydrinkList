package com.MadsMoeller.EnergydrinkList.entity;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Drink {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long drinkId;
    private String name;
    private int JScore;
    private int KScore;
    private int MScore;

    public Drink(String name, int JScore, int KScore, int MScore) {
        this.name = name;
        this.JScore = JScore;
        this.KScore = KScore;
        this.MScore = MScore;
    }

    public Drink(){

    }

    public Long getDrinkId(){
        return this.drinkId;
    }

    public void setDrinkId(Long drinkId) {
        this.drinkId = drinkId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getJScore() {
        return JScore;
    }

    public void setJScore(int JScore) {
        this.JScore = JScore;
    }

    public int getKScore() {
        return KScore;
    }

    public void setKScore(int KScore) {
        this.KScore = KScore;
    }

    public int getMScore() {
        return MScore;
    }

    public void setMScore(int MScore) {
        this.MScore = MScore;
    }
}
