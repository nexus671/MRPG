package com.truth.neogames.Battle;

import com.truth.neogames.Abilities.ActiveAbility;
import com.truth.neogames.Entities.LivingEntity;
import com.truth.neogames.RPGObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Ahmane on 10/21/2015.
 * Class Description: Calculations for a battle.
 */
public class Battle extends RPGObject {
    private com.truth.neogames.Entities.SubTypes.Player player;
    private com.truth.neogames.Entities.SubTypes.Monster[] monsters;
    private com.truth.neogames.EnvironmentPackage.BattleGrid grid;

    public Battle(com.truth.neogames.Entities.SubTypes.Player p, com.truth.neogames.Entities.SubTypes.Monster[] monsters, com.truth.neogames.EnvironmentPackage.BattleGrid b) {
        player = p;
        this.monsters = monsters;
        grid = b;
    }

    public void ApplyAbility(ActiveAbility ability, ArrayList<LivingEntity> targets, LivingEntity caster) {

    }

    public com.truth.neogames.Entities.SubTypes.Player getPlayer() {
        return player;
    }

    public void setPlayer(com.truth.neogames.Entities.SubTypes.Player player) {
        this.player = player;
    }

    public com.truth.neogames.Entities.SubTypes.Monster[] getMonsters() {

        return monsters;
    }

    public void setMonsters(com.truth.neogames.Entities.SubTypes.Monster... monsters) {
        this.monsters = monsters;
    }

    public List<com.truth.neogames.Entities.SubTypes.Monster> getMonstersArea(int area) {


        List<com.truth.neogames.Entities.SubTypes.Monster> mlist = new ArrayList<com.truth.neogames.Entities.SubTypes.Monster>();

        for (int x = player.getxPos() - area; x <= (player.getxPos() + area); x++) {
            for (int y = player.getyPos() - area; y <= (player.getyPos() + area); y++) {

                for (com.truth.neogames.Entities.SubTypes.Monster monster : monsters) {
                    if ((monster.getxPos() == x) && (monster.getyPos() == y)) {

                        mlist.add(monster);
                    }
                }
            }


        }

        return mlist;
    }

    public com.truth.neogames.EnvironmentPackage.BattleGrid getGrid() {
        return grid;
    }

    public void setGrid(com.truth.neogames.EnvironmentPackage.BattleGrid grid) {
        this.grid = grid;
    }

    @Override
    public String toString() {
        return "Battle{" +
                "player=" + player +
                ", monsters=" + Arrays.toString(monsters) +
                ", grid=" + grid +
                '}';
    }
}
