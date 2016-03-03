package com.truth.neogames.Ahmane.Battle;

import com.truth.neogames.Ahmane.Abilities.ActiveAbility;
import com.truth.neogames.Ahmane.Entities.SubTypes.Monster;
import com.truth.neogames.Enums.EntityStatName;
import com.truth.neogames.Utilities.KBReader;

import java.util.ArrayList;
import java.util.List;

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
        battle.getGrid().showGrid();
        double speed = battle.getPlayer().getStats().getStat(EntityStatName.SPEED).getMax();
        ArrayList<ActiveAbility> abilities = battle.getPlayer().getProfession().getUnlockedActiveAbilities();
        System.out.println("0. Move");
        for (ActiveAbility a : abilities) {
            System.out.println(i + ". " + a.getName());
            i++;
        }
        System.out.println(i + ". View Consumables");
        System.out.print("Enter your choice: ");
        int choice = KBReader.getScanner().nextInt();
        while (choice != -1) {
            if (choice == 0 && speed > 0) {
                System.out.println("1. UP 2.Down 3.Left 4.Right");
                int m = KBReader.getScanner().nextInt();

                if (m == 1 && battle.getPlayer().moveForward(battle.getGrid())) {
                    speed -= 10;
                }
                if (m == 2 && battle.getPlayer().moveBackward(battle.getGrid())) {
                    speed -= 10;
                }
                if (m == 3 && battle.getPlayer().moveLeft(battle.getGrid())) {
                    speed -= 10;
                }
                if (m == 4 && battle.getPlayer().moveRight(battle.getGrid())) {
                    speed -= 10;
                }
                battle.getGrid().showGrid();
            } else if (choice == 0 && speed <= 0) {
                System.out.println("Cant Move no more fastness lmao rip gg get good boi");
                System.out.println("0. Move");
                i = 1;
                for (ActiveAbility a : abilities) {

                    System.out.println(i + ". " + a.getName());
                    i++;
                }
                System.out.println(i + ". View Consumables");
                System.out.print("Enter your choice: ");
                choice = KBReader.getScanner().nextInt();
            }
            if (choice > 0 && choice < i) {
                ActiveAbility ability = abilities.get(choice - 1);
                i = 1;
                List<Monster> availableTargets = battle.getMonstersArea(ability.getArea());
                if (!availableTargets.isEmpty()) {
                    for (Monster m : availableTargets) {
                        System.out.println(i + ". " + m.getName());
                        i++;
                    }
                    System.out.println("Select a target: ");
                    int targetChoice = KBReader.getScanner().nextInt();
                    Monster target = availableTargets.get(targetChoice - 1);
                    ArrayList<Monster> targets = new ArrayList<Monster>();
                    targets.add(target);
                    ability.use(targets);
                } else {
                    System.out.println("Nobody in range");
                }
                break;
            }
        }
    }
}
