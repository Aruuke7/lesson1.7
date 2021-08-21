package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Hero heroes[] = {new Warrior(),new Magic(),new Medic()};
        for (int i = 0; i < heroes.length; i++) {
            heroes[i].applySuperAbility(heroes[i].superAbilityType);

        }

    }
}
