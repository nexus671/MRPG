package com.truth.neogames.Ahmane.Battle;

import com.truth.neogames.Ahmane.Abilities.ActiveAbility;
import com.truth.neogames.Ahmane.Entities.SubTypes.Monster;
import com.truth.neogames.Utilities.KBReader;

import java.util.ArrayList;

/**
 * Created by Adam on 2/29/2016.
 * Class Description: Temporary UI for testing combat.
 */
public class TempUI {
    private Battle battle;

    public TempUI(Battle b) {
        battle = b;
        playerTurn();
    }

    public void playerTurn() {
        printPlayerMenu();
    }

    public void printPlayerMenu() {
        int i = 1;
        ArrayList<ActiveAbility> abilities = battle.getPlayer().getProfession().getUnlockedActiveAbilities();
        for (ActiveAbility a : abilities) {
            System.out.println(i + ". " + a.getName());
            i++;
        }
        System.out.println(i + ". View Consumables");
        System.out.print("Enter your choice: ");
        int choice = KBReader.getScanner().nextInt();
        if (choice < i) {
            ActiveAbility ability = abilities.get(choice - 1);
            i = 1;
            for (Monster m : battle.getMonsters()) {
                System.out.println(i + ". " + m.getName());
                i++;
            }
            System.out.println("Select a target: ");
            int targetChoice = KBReader.getScanner().nextInt();
            Monster target = battle.getMonsters()[targetChoice - 1];
            ArrayList<Monster> targets = new ArrayList<Monster>();
            targets.add(target);
            ability.use(targets);
        }
    }
}
