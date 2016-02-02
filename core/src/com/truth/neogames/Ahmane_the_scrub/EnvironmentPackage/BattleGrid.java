package com.truth.neogames.Ahmane_the_scrub.EnvironmentPackage;

import com.truth.neogames.Ahmane_the_scrub.Entities.Entity;

import java.util.Random;

/**
 * Created by acurr on 11/4/2015.
 * Class Description:
 */
public class BattleGrid {
    private Entity[][] grid;

    public BattleGrid() {
        grid = new Entity[13][13];
    }

    public BattleGrid(int r, int c) {
         grid = new Entity[r][c];
    }

    public boolean isSpaceEmpty(int x, int y) {
        return (grid[x][y] == null);
    }

    public void shiftEntity(Entity e, int x, int y) {
        int oldX = e.getxPos();
        int oldY = e.getyPos();

        e.setxPos(oldX + x);
        e.setyPos(oldY + y);

        grid[oldX][oldY] = null;

        addEntity(e);
    }

    public void moveEntity(Entity e, int x, int y) {
        int oldX = e.getxPos();
        int oldY = e.getyPos();

        e.setxPos(x);
        e.setyPos(y);

        grid[oldX][oldY] = null;

        addEntity(e);
    }

    public void addEntity(Entity e) {
        grid[e.getxPos()][e.getyPos()] = e;
    }

    private void placeObstacles() {
        int treesPlaced = 0;
        Random random = new Random();
        while (treesPlaced < 10) {
            int x = random.nextInt(13);
            int y = random.nextInt(13);
            if (grid[x][y] == null) {
                //grid[x][y] = Tree; TODO Add tree entity and add rocks
                treesPlaced++;
            }
        }
    }

    public void showgrid() {
        for (int i = 0; i < 13; i++) System.out.print("\t" + (i));
        System.out.println();

        for (int row = 0; row < 13; row++) {
            System.out.print((row) + "");
            for (int column = 0; column < 13; column++) {
                if (grid[row][column] != null) {
                    System.out.print("\t" + "E");
                } else if (grid[row][column] == null) {
                    System.out.print("\t" + "-");
                }
            }
            System.out.println();
        }

    }

}
