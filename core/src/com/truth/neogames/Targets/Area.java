package com.truth.neogames.Targets;

import com.truth.neogames.Enums.Shape;

/**
 * Created by acurr on 2/17/2016.
 */
public class Area extends Target {
    /**
     * The Radius.
     */
    int radius;
    /**
     * The Friendly fire.
     */
    boolean friendlyFire;
    /**
     * The Shape.
     */
    Shape shape;
    /**
     * The Area.
     */
    int area;
    /**
     * The Center x.
     */
    int centerX;
    /**
     * The Center y.
     */
    int centerY;

    /**
     * Instantiates a new Area.
     *
     * @param radius       the radius
     * @param friendlyFire the friendly fire
     * @param shape        the shape
     * @param centerX      the center x
     * @param centerY      the center y
     */
    public Area(int radius, boolean friendlyFire, Shape shape, int centerX, int centerY) {
        this.radius = radius;
        this.friendlyFire = friendlyFire;
        this.shape = shape;
        this.centerX = centerX;
        this.centerY = centerY;
        setArea(radius);
    }

    /**
     * Gets radius.
     *
     * @return the radius
     */
    public int getRadius() {
        return radius;
    }

    /**
     * Sets radius.
     *
     * @param radius the radius
     */
    public void setRadius(int radius) {
        this.radius = radius;
    }

    /**
     * Is friendly fire boolean.
     *
     * @return the boolean
     */
    public boolean isFriendlyFire() {
        return friendlyFire;
    }

    /**
     * Sets friendly fire.
     *
     * @param friendlyFire the friendly fire
     */
    public void setFriendlyFire(boolean friendlyFire) {
        this.friendlyFire = friendlyFire;
    }

    /**
     * Gets shape.
     *
     * @return the shape
     */
    public Shape getShape() {
        return shape;
    }

    /**
     * Sets shape.
     *
     * @param shape the shape
     */
    public void setShape(Shape shape) {
        this.shape = shape;
    }

    /**
     * Gets area.
     *
     * @return the area
     */
    public int getArea() {
        return area;
    }

    /**
     * Sets area.
     *
     * @param r the r
     */
    public void setArea(int r) {
        if (shape == Shape.SQUARE) {
            area = r * r;
        } else if (shape == Shape.CIRCLE) {
            area = (int) (Math.PI * Math.pow((double) r, 2.0));
        }
    }

    /**
     * Gets center x.
     *
     * @return the center x
     */
    public int getCenterX() {
        return centerX;
    }

    /**
     * Sets center x.
     *
     * @param centerX the center x
     */
    public void setCenterX(int centerX) {
        this.centerX = centerX;
    }

    /**
     * Gets center y.
     *
     * @return the center y
     */
    public int getCenterY() {
        return centerY;
    }

    /**
     * Sets center y.
     *
     * @param centerY the center y
     */
    public void setCenterY(int centerY) {
        this.centerY = centerY;
    }

    @Override
    public String toString() {
        return "Area{" +
                "radius=" + radius +
                ", friendlyFire=" + friendlyFire +
                ", shape=" + shape +
                ", area=" + area +
                ", centerX=" + centerX +
                ", centerY=" + centerY +
                '}';
    }
}
