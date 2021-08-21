package com.company;

public class Magic extends Hero{
    @Override
    public void applySuperAbility(String superAbilityType) {
        superAbilityType = "MAGICAL";
        System.out.println("Magic применил суперспособность " + superAbilityType);

    }
}
