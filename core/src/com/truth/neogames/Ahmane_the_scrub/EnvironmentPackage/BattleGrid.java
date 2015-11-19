package com.truth.neogames.Ahmane_the_scrub.EnvironmentPackage;

import com.truth.neogames.Ahmane_the_scrub.Entities.Entity;

import java.util.Random;

/**
 * Created by acurr on 11/4/2015.
 * Class Description:
 */
public class BattleGrid {
    private Entity[][] Grid;

    public BattleGrid() {
         Grid = new Entity[100][100];
    }

    public BattleGrid(int r, int c) {
         Grid = new Entity[r][c];
    }

    public boolean isSpaceEmpty(int x, int y) {
        return (Grid[x][y] == null);
    }

    public void moveEntity(Entity e, int x, int y) {
        int oldX = e.getxPos();
        int oldY = e.getyPos();

        e.setxPos(oldX + x);
        e.setyPos(oldY + y);

        Grid[oldX][oldY] = null;

        addEntity(e);
    }

    public void addEntity(Entity e) {
        Grid[e.getxPos()][e.getyPos()] = e;
    }

    private void placeObstacles() {
        int treesPlaced = 0;
        Random random = new Random();
        while (treesPlaced < 10) {
            int x = random.nextInt(100);
            int y = random.nextInt(100);
            if (Grid[x][y] == null) {
                //Grid[x][y] = Tree; TODO Add tree entity and add rocks
                treesPlaced++;
            }
        }
    }

}
