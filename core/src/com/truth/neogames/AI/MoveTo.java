package com.truth.neogames.AI;

import com.truth.neogames.Entities.SubTypes.Monster;
import com.truth.neogames.EnvironmentPackage.BattleGrid;

/**
 * Created by Ahmane on 3/21/2016.
 *  Class Description:
 */
public class MoveTo extends Routine {
    /**
     * The Dest x.
     */
    final protected int destX;
    /**
     * The Dest y.
     */
    final protected int destY;

    /**
     * Instantiates a new Move to.
     *
     * @param destX the dest x
     * @param destY the dest y
     */
    public MoveTo(int destX, int destY) {
        super();
        this.destX = destX;
        this.destY = destY;
    }

    public void reset() {
        start();
    }

    @Override
    public void act(Monster mon, BattleGrid b) {
        if (isRunning()) {
            if (!mon.isAlive()) {
                fail();
                return;
            }
            if (!isMonsterAtDestination(mon)) {
                //moveMonster(mon)
            }
        }
    }

    private void moveMonster(Monster mon) {
        //if()
    }


    private boolean isMonsterAtDestination(Monster mon) {
        return destX == mon.getxPos() && destY == mon.getyPos();
    }
}
