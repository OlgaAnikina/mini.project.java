package anikina.olga.tasks.java.main;

public class Container {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Container(final int x, final int y, final int weidth, final int height){
        this.x1 = x;
        this.y1 = y;
        this.x2 = x + weidth;
        this.y2 = y - height;
    }

    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public int getWeidth() {
        return y1;
    }

    public int getHeight() {
        return y1;
    }

    public boolean collides(Ball ball) {
        if (((ball.getX() - ball.getRadius()) > this.getX1())
                && ((ball.getX() + this.getX1()) < this.getX1() + this.getWeidth())) {
            if (((ball.getY() + ball.getRadius()) < this.getY1()
                    && ((ball.getY() - ball.getRadius()) < this.getY1() - this.getHeight()))) {
                 return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Container = [ (" + this.x1 + ", "
                + this.y1 + ") , (" + this.x2 + ", " + this.y2 + ") ]";
    }
}
