package com.truth.neogames.EnvironmentPackage;

import com.truth.neogames.Entities.Entity;
import com.truth.neogames.Entities.SubTypes.Monster;
import com.truth.neogames.Entities.SubTypes.Player;
import com.truth.neogames.RPGObject;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by acurr on 11/4/2015.
 * Class Description:
 */
public class BattleGrid extends RPGObject {
    private final Entity[][] grid;

    /**
     * Instantiates a new Battle grid.
     */
    public BattleGrid() {
        grid = new Entity[13][13];
    }

    /**
     * Instantiates a new Battle grid.
     *
     * @param r the r
     * @param c the c
     */
    public BattleGrid(int r, int c) {
        grid = new Entity[r][c];
    }

    /**
     * Is space empty boolean.
     *
     * @param x the x
     * @param y the y
     * @return the boolean
     */
    public boolean isSpaceEmpty(int x, int y) {
        return (grid[x][y] == null);
    }

    /**
     * Shift entity.
     *
     * @param e the e
     * @param x the x
     * @param y the y
     */
    public void shiftEntity(Entity e, int x, int y) {
        int oldX = e.getxPos();
        int oldY = e.getyPos();

        e.setxPos(oldX + x);
        e.setyPos(oldY + y);

        grid[oldX][oldY] = null;

        addEntity(e);
    }

    /**
     * Move entity.
     *
     * @param e the e
     * @param x the x
     * @param y the y
     */
    public void moveEntity(Entity e, int x, int y) {
        int oldX = e.getxPos();
        int oldY = e.getyPos();

        e.setxPos(x);
        e.setyPos(y);

        grid[oldX][oldY] = null;

        addEntity(e);
    }

    /**
     * Add entity.
     *
     * @param e the e
     */
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

    /**
     * Show grid.
     */
    public void showGrid() {
        for (int i = 0; i < 13; i++) {
            System.out.print("\t" + (i));
        }
        System.out.println();

        for (int row = 0; row < 13; row++) {
            System.out.print(row);
            for (int column = 0; column < 13; column++) {
                if (grid[row][column] == null) {
                    System.out.print("\t" + '-');
                } else if (grid[row][column].getClass().equals(Monster.class)) {
                    System.out.print("\t" + 'M');
                } else if (grid[row][column].getClass().equals(Player.class)) {
                    System.out.print("\t" + 'P');
                }
            }
            System.out.println();
        }

    }

    @Override
    public String toString() {
        return "BattleGrid{" +
                "grid=" + Arrays.toString(grid) +
                '}';
    }
}
