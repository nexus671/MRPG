package com.truth.neogames.Ahmane_the_scrub.EnvironmentPackage;

import com.truth.neogames.Ahmane_the_scrub.Entities.Entity;

import java.util.Random;

/**
 * Created by acurr on 11/4/2015.
 * Class Description:
 */
public class BattleGrid {
    private Entity[][] BattleGrid;

    public BattleGrid() {
        Entity[][] BattleGrid = new Entity[100][100];
    }

    public BattleGrid(int r, int c) {
        Entity[][] BattleGrid = new Entity[r][c];
    }

    public boolean isSpaceEmpty(int x, int y) {
        return (BattleGrid[x][y] == null);
    }

    public void moveEntity(Entity e, int x, int y) {
        int oldX = e.getxPos();
        int oldY = e.getyPos();

        e.setxPos(oldX + x);
        e.setyPos(oldY + y);

        BattleGrid[oldX][oldY] = null;

        addEntity(e);
    }

    public void addEntity(Entity e) {
        BattleGrid[e.getxPos()][e.getyPos()] = e;
    }

    private void placeObstacles() {
        int treesPlaced = 0;
        Random random = new Random();
        while (treesPlaced < 10) {
            int x = random.nextInt(100);
            int y = random.nextInt(100);
            if (BattleGrid[x][y] == null) {
                //BattleGrid[x][y] = Tree; TODO Add tree entity and add rocks
                treesPlaced++;
            }
        }
    }

}
