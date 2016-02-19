package com.truth.neogames.Ahmane.Battle;

import com.truth.neogames.Ahmane.Abilitys.Ability;
import com.truth.neogames.Ahmane.Entities.LivingEntity;
import com.truth.neogames.Ahmane.Entities.SubTypes.Monster;
import com.truth.neogames.Ahmane.Entities.SubTypes.Player;

import java.util.ArrayList;

/**
 * Created by Ahmane on 10/21/2015.
 * Class Description: Calculations for a battle.
 */
public class Battle {
    private Player player;
    private Monster[] monsters;

    public Battle(Player p, Monster[] monsters) {
        player = p;
        this.monsters = monsters;
    }

    public void ApplyAbility(Ability ability, LivingEntity target, LivingEntity caster) {

    }

    public void ApplyAbility(Ability ability, ArrayList<LivingEntity> targets, LivingEntity caster) {

    }
    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Monster[] getMonsters() {
        return monsters;
    }

    public void setMonsters(Monster[] monsters) {
        this.monsters = monsters;
    }
}
