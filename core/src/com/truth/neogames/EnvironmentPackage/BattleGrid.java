package com.truth.neogames.EnvironmentPackage;

import com.truth.neogames.Entities.Entity;

import java.util.Random;

/**
 * Created by acurr on 11/4/2015.
 * Class Description:
 */
public class BattleGrid {
    Entity[][] BattleGrid;

    BattleGrid() {
        Entity[][] BattleGrid = new Entity[100][100];
    }

    BattleGrid(int r, int c) {
        Entity[][] BattleGrid = new Entity[r][c];
    }

    void placeTrees() {
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
