package com.codecentral.shrekjump.objects;

import java.awt.Point;

public abstract class GameObject {

    private Point mPoint;

    protected GameObject() {
        this(0, 0);
    }

    protected GameObject(int x, int y) {
        mPoint = new Point(x, y);
    }

    /**
     * Updates the stored location of this game object.
     *
     * @param dx The distance to move horizontally - negative values are left, positive values are right
     * @param dy The distance to move vertically - negative values are down, positive values are up
     */
    public void move(int dx, int dy) {
        mPoint.move(dx, dy);
    }

    public double getX() {
        return mPoint.getX();
    }

    public double getY() {
        return mPoint.getY();
    }
}
