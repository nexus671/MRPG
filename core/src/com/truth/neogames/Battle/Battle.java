package com.truth.neogames.Battle;

import com.truth.neogames.AI.Pathing.Path;
import com.truth.neogames.AI.Pathing.PathFinder;
import com.truth.neogames.Abilities.ActiveAbility;
import com.truth.neogames.Entities.LivingEntity;
import com.truth.neogames.Entities.SubTypes.Monster;
import com.truth.neogames.Entities.SubTypes.Player;
import com.truth.neogames.EnvironmentPackage.BattleGrid;
import com.truth.neogames.RPGObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Ahmane on 10/21/2015.
 * Class Description: Calculations for a battle.
 */
public class Battle extends RPGObject {
    private Player player;
    private Monster[] monsters;
    private BattleGrid grid;
    private PathFinder finder;
    private Path path;

    /**
     * Instantiates a new Battle.
     *
     * @param p        the p
     * @param monsters the monsters
     * @param b        the b
     */
    public Battle(Player p, Monster[] monsters, BattleGrid b) {
        player = p;
        this.monsters = monsters;
        grid = b;
    }

    /**
     * Apply ability.
     *
     * @param ability the ability
     * @param targets the targets
     * @param caster  the caster
     */
    public void ApplyAbility(ActiveAbility ability, ArrayList<LivingEntity> targets, LivingEntity caster) {

    }

    /**
     * Gets player.
     *
     * @return the player
     */
    public Player getPlayer() {
        return player;
    }

    /**
     * Sets player.
     *
     * @param player the player
     */
    public void setPlayer(Player player) {
        this.player = player;
    }

    /**
     * Get monsters monster [ ].
     *
     * @return the monster [ ]
     */
    public Monster[] getMonsters() {

        return monsters;
    }

    /**
     * Sets monsters.
     *
     * @param monsters the monsters
     */
    public void setMonsters(Monster... monsters) {
        this.monsters = monsters;
    }

    /**
     * Gets monsters in area.
     *
     * @param area the area
     * @return the monsters area
     */
    public List<Monster> getMonstersArea(int area) {


        List<Monster> mlist = new ArrayList<Monster>();

        for (int x = player.getxPos() - area; x <= (player.getxPos() + area); x++) {
            for (int y = player.getyPos() - area; y <= (player.getyPos() + area); y++) {

                for (Monster monster : monsters) {
                    if ((monster.getxPos() == x) && (monster.getyPos() == y)) {

                        mlist.add(monster);
                    }
                }
            }


        }

        return mlist;
    }

    /**
     * Gets finder.
     *
     * @return the finder
     */
    public PathFinder getFinder() {
        return finder;
    }

    /**
     * Sets finder.
     *
     * @param finder the finder
     */
    public void setFinder(PathFinder finder) {
        this.finder = finder;
    }

    /**
     * Gets path.
     *
     * @return the path
     */
    public Path getPath() {
        return path;
    }

    /**
     * Sets path.
     *
     * @param path the path
     */
    public void setPath(Path path) {
        this.path = path;
    }

    /**
     * Gets grid.
     *
     * @return the grid
     */
    public BattleGrid getGrid() {
        return grid;
    }

    /**
     * Sets grid.
     *
     * @param grid the grid
     */
    public void setGrid(BattleGrid grid) {
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
