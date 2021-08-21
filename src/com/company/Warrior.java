package com.company;

public class Warrior extends Hero{
    @Override
    public void applySuperAbility(String superAbilityType) {
        superAbilityType = "PHYSICAL";
        System.out.println("Warrior применил суперспособность " + superAbilityType);
    }
}
