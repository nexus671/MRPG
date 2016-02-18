package com.truth.neogames.Ahmane.Targets;

import com.truth.neogames.Enums.Shape;

/**
 * Created by acurr on 2/17/2016.
 */
public class Area extends Target {
    int radius;
    boolean friendlyFire;
    Shape shape;
    int area;
    int centerX;
    int centerY;

    public Area(int radius, boolean friendlyFire, Shape shape, int centerX, int centerY) {
        this.radius = radius;
        this.friendlyFire = friendlyFire;
        this.shape = shape;
        this.centerX = centerX;
        this.centerY = centerY;
        setArea(radius);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public boolean isFriendlyFire() {
        return friendlyFire;
    }

    public void setFriendlyFire(boolean friendlyFire) {
        this.friendlyFire = friendlyFire;
    }

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int r) {
        if (shape == Shape.SQUARE)
            area = r * r;
        else if (shape == Shape.CIRCLE)
            area = (int) (Math.PI * Math.pow(r, 2));
    }

    public int getCenterX() {
        return centerX;
    }

    public void setCenterX(int centerX) {
        this.centerX = centerX;
    }

    public int getCenterY() {
        return centerY;
    }

    public void setCenterY(int centerY) {
        this.centerY = centerY;
    }
}
