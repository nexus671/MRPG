package com.truth.neogames.EnvironmentPackage;

import com.truth.neogames.AI.Pathing.TileBasedMap;
import com.truth.neogames.Entities.Entity;
import com.truth.neogames.Entities.LivingEntity;
import com.truth.neogames.Entities.SubTypes.Monster;
import com.truth.neogames.Entities.SubTypes.Player;
import com.truth.neogames.RPGObject;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by acurr on 11/4/2015.
 * Class Description:
 */
public class BattleGrid extends RPGObject implements TileBasedMap {
    private int WIDTH = 13;
    private int HEIGHT = 13;
    private final Entity[][] entities = new Entity[WIDTH][HEIGHT];
    private final Terrain[][] terrain = new Terrain[WIDTH][HEIGHT];
    private final boolean[][] visited = new boolean[WIDTH][HEIGHT];


    /**
     * Instantiates a new Battle entities.
     */
    public BattleGrid() {
        WIDTH = 13;
        HEIGHT = 13;
    }

    /**
     * Instantiates a new Battle entities.
     *
     * @param width  the width
     * @param height the height
     */
    public BattleGrid(int width, int height) {
        WIDTH = width;
        HEIGHT = height;
    }

    /**
     * Is space empty boolean.
     *
     * @param x the x
     * @param y the y
     * @return the boolean
     */
    public boolean blocked(LivingEntity entity, int x, int y) {
        return (entities[x][y] == null);
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

        entities[oldX][oldY] = null;

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

        entities[oldX][oldY] = null;

        addEntity(e);
    }

    /**
     * Clear the array marking which tiles have been visted by the path
     * finder.
     */
    public void clearVisited() {
        for (int x = 0; x < getWidthInTiles(); x++) {
            for (int y = 0; y < getHeightInTiles(); y++) {
                visited[x][y] = false;
            }
        }
    }

    /**
     * Visited boolean.
     *
     * @param x the x
     * @param y the y
     * @return the boolean
     */
    public boolean visited(int x, int y) {
        return visited[x][y];
    }

    /**
     * Get the terrain at a given location
     *
     * @param x The x coordinate of the terrain tile to retrieve
     * @param y The y coordinate of the terrain tile to retrieve
     * @return The terrain tile at the given location
     */
    public Terrain getTerrain(int x, int y) {
        return terrain[x][y];
    }


    public int getHeightInTiles() {
        return WIDTH;
    }


    public int getWidthInTiles() {
        return HEIGHT;
    }

    /**
     * Get the unit at a given location
     *
     * @param x The x coordinate of the tile to check for a unit
     * @param y The y coordinate of the tile to check for a unit
     * @return The ID of the unit at the given location or 0 if there is no unit
     */
    public Entity getEntity(int x, int y) {
        return entities[x][y];
    }

    /**
     * Set the unit at the given location
     *
     * @param x      The x coordinate of the location where the unit should be set
     * @param y      The y coordinate of the location where the unit should be set
     * @param entity The ID of the unit to be placed on the map, or 0 to clear the unit at the               given location
     */
    public void setEntity(int x, int y, LivingEntity entity) {
        entities[x][y] = entity;
    }

    public void pathFinderVisited(int x, int y) {
        visited[x][y] = true;
    }


    public float getCost(LivingEntity entity, int sx, int sy, int tx, int ty) {
        return 1;
    }

    /**
     * Add entity.
     *
     * @param e the e
     */
    public void addEntity(Entity e) {
        entities[e.getxPos()][e.getyPos()] = e;
    }

    private void placeObstacles() {
        int treesPlaced = 0;
        Random random = new Random();
        while (treesPlaced < 10) {
            int x = random.nextInt(13);
            int y = random.nextInt(13);
            if (entities[x][y] == null) {
                treesPlaced++;
            }
        }
    }

    /**
     * Show entities.
     */
    public void showGrid() {
        for (int i = 0; i < 13; i++) {
            System.out.print("\t" + (i));
        }
        System.out.println();

        for (int row = 0; row < 13; row++) {
            System.out.print(row);
            for (int column = 0; column < 13; column++) {
                if (entities[row][column] == null) {
                    System.out.print("\t" + '-');
                } else if (entities[row][column].getClass().equals(Monster.class)) {
                    System.out.print("\t" + 'M');
                } else if (entities[row][column].getClass().equals(Player.class)) {
                    System.out.print("\t" + 'P');
                }
            }
            System.out.println();
        }

    }

    @Override
    public String toString() {
        return "BattleGrid{" +
                "entities=" + Arrays.toString(entities) +
                '}';
    }
}
