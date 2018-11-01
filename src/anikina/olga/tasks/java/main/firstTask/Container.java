package anikina.olga.tasks.java.main.firstTask;

public class Container {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Container(final int x, final int y, final int weidth, final int height) {
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

    public boolean collides(final Ball ball) {
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

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + x1;
        result = 31 * result + x2;
        result = 31 * result + y1;
        result = 31 * result + y2;
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
        Container container = (Container) obj;
        return container.x1 == x1 && container.x2 == x2 && container.y1 == y1 && container.y2 == y2;
    }
}
