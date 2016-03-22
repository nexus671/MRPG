package com.truth.neogames.AI;

import com.truth.neogames.Entities.SubTypes.Monster;
import com.truth.neogames.EnvironmentPackage.BattleGrid;

/**
 * Created by acurr on 3/21/2016.
 */
public class MoveTo extends Routine {
    final protected int destX;
    final protected int destY;

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
