package anikina.olga.tasks.java.main;

public class MyPoint {
    private int x = 0;
    private int y = 0;

    public MyPoint() {}
    public MyPoint(final int x, final int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY() {
        int[] xy = {x, y};
        return xy;
    }

    public void setXY(final int x, final int y) {
        this.x = x;
        this.y = y;
    }

    public void setXY(int[] xy) {
        this.x = xy[0];
        this.y = xy[1];
    }

    @Override
    public String toString() {
        return "( " + this.x + ", " + this.y + " )";
    }

    public double distance() {
        return Math.sqrt( Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }

    public double distnce(int x, int y) {
        return Math.sqrt( Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
    }
    public double distnce(MyPoint point) {
        return Math.sqrt( Math.pow(this.x - point.x, 2) + Math.pow(this.y - point.y, 2));
    }




}
