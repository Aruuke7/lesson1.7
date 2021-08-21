package com.company;

public abstract class Hero implements HavingSuperAbility {
    int health;
    int damage;
    String superAbilityType;

    public abstract void applySuperAbility(String superAbilityType);
}
