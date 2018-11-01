package anikina.olga.tasks.java.main.firstTask;

public class Ball {
    private float x;
    private float y;
    private float xDelta;
    private float yDelta;
    private int radius;

    public Ball(final float x, final float y, final int speed, final int direction, final int radius) {
        this.x = x;
        this.y = y;
        this.xDelta = (float) (speed * Math.cos(direction));
        this.yDelta = (float) ((-1) * speed * Math.sin(direction));
        this.radius = radius;

    }

    public void setY(final float y) {
        this.y = y;
    }

    public void setX(final float x) {
        this.x = x;
    }

    public void setRadius(final int radius) {
        this.radius = radius;
    }

    public void setxDelta(final float xDelta) {
        this.xDelta = xDelta;
    }

    public void setyDelta(final float yDelta) {
        this.yDelta = yDelta;
    }

    public float getX() {
        return x;
    }

    public float getxDelta() {
        return xDelta;
    }

    public float getY() {
        return y;
    }

    public float getyDelta() {
        return yDelta;
    }

    public int getRadius() {
        return radius;
    }

    public void move() {
        this.x += this.xDelta;
        this.y += this.yDelta;
    }

    public void reflectHorizontal() {
        this.x = (-1) * this.x;
    }

    public void reflectVertical() {
        this.y = (-1) * this.y;
    }

    @Override
    public String toString() {
        return "Ball = [ (" + this.x + " , " + this.y
                + " ), speed = (" + this.xDelta + ", " + this.yDelta + ")]";
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (int) x;
        result = 31 * result + (int) y;
        result = 31 * result + (int) xDelta;
        result = 31 * result + (int) yDelta;
        result = 31 * result + radius;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Ball ball = (Ball) obj;
        return ball.radius == radius && ball.x == x && ball.y == y
                && ball.yDelta == yDelta && ball.xDelta == xDelta;
    }


}
