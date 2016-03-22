package com.truth.neogames.Battle;

import com.truth.neogames.Abilities.ActiveAbility;
import com.truth.neogames.Entities.SubTypes.Monster;
import com.truth.neogames.Enums.EntityStatName;
import com.truth.neogames.Utilities.KBReader;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adam on 2/29/2016.
 * Class Description: Temporary UI for testing combat.
 */
public class TempUI {
    private final Battle battle;

    /**
     * Instantiates a new Temp ui.
     *
     * @param b the b
     */
    public TempUI(Battle b) {
        battle = b;
        playerTurn();
    }

    /**
     * Player turn.
     */
    public void playerTurn() {
        printPlayerMenu();
    }

    /**
     * Print player menu.
     */
    public void printPlayerMenu() {
        battle.getGrid().showGrid();
        double speed = battle.getPlayer().getStats().getStat(EntityStatName.SPEED).getMax();
        List<ActiveAbility> abilities = battle.getPlayer().getProfession().getUnlockedActiveAbilities();
        System.out.println("0. Move");
        int i = 1;
        for (ActiveAbility a : abilities) {
            System.out.println(i + ". " + a.getName());
            i++;
        }
        System.out.println(i + ". View Consumables");
        System.out.print("Enter your choice: ");
        int choice = KBReader.getScanner().nextInt();
        while (choice != -1) {
            if ((choice == 0) && (speed > 0.0)) {
                System.out.println("1. UP 2.Down 3.Left 4.Right");
                int m = KBReader.getScanner().nextInt();

                if ((m == 1) && battle.getPlayer().moveForward(battle.getGrid())) {
                    speed -= 10.0;
                }
                if ((m == 2) && battle.getPlayer().moveBackward(battle.getGrid())) {
                    speed -= 10.0;
                }
                if ((m == 3) && battle.getPlayer().moveLeft(battle.getGrid())) {
                    speed -= 10.0;
                }
                if ((m == 4) && battle.getPlayer().moveRight(battle.getGrid())) {
                    speed -= 10.0;
                }
                battle.getGrid().showGrid();
            } else if ((choice == 0) && (speed <= 0.0)) {
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
            if ((choice > 0) && (choice < i)) {
                ActiveAbility ability = abilities.get(choice - 1);
                i = 1;
                List<Monster> availableTargets = battle.getMonstersArea(ability.getArea());
                if (availableTargets.isEmpty()) {
                    System.out.println("Nobody in range");
                } else {
                    for (Monster m : availableTargets) {
                        System.out.println(i + ". " + m.getName());
                        i++;
                    }
                    System.out.println("Select a target: ");
                    int targetChoice = KBReader.getScanner().nextInt();
                    Monster target = availableTargets.get(targetChoice - 1);
                    List<Monster> targets = new ArrayList<Monster>();
                    targets.add(target);
                    ability.use(targets);
                }
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "TempUI{" +
                "battle=" + battle +
                '}';
    }
}
