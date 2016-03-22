package com.truth.neogames.AI.Pathing;


import com.truth.neogames.Entities.LivingEntity;

/**
 * A heuristic that uses the tile that is closest to the target
 * as the next best tile.
 *
 * @author Kevin Glass
 */
public class ClosestHeuristic implements AStarHeuristic {
    /**
     * @see AStarHeuristic#getCost(TileBasedMap, LivingEntity, int, int, int, int)
     */
    public float getCost(TileBasedMap map, LivingEntity mover, int x, int y, int tx, int ty) {
        float dx = tx - x;
        float dy = ty - y;

        return (float) (Math.sqrt((dx * dx) + (dy * dy)));
    }

}