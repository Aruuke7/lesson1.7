package com.company;

public class Medic extends Hero{
    @Override
    public void applySuperAbility(String superAbilityType) {
        superAbilityType = "CRITICAL DAMAGE";
        System.out.println("Medic применил суперспособность " + superAbilityType);
    }
}
