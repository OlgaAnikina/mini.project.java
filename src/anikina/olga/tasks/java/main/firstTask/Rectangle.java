package anikina.olga.tasks.java.main.firstTask;

public class Rectangle {
    private float length = 1.0f;
    private float weidht = 1.0f;

    public Rectangle() {
    }

    ;

    public Rectangle(final float length, final float weidht) {
        this.length = length;
        this.weidht = weidht;
    }

    public float getLength() {
        return length;
    }

    public float getWeidht() {
        return weidht;
    }

    public void setLength(final float length) {
        this.length = length;
    }

    public void setWeidht(final float weidht) {
        this.weidht = weidht;
    }

    public float getArea() {
        return length * weidht;
    }

    public float getPerimetr() {
        return 2 * (length + weidht);
    }

    public String toString() {
        return " Length = " + length + ", Weidht = " + weidht +
                ", Area = " + this.getArea() + ", Perimetr = " + this.getPerimetr();
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (int) weidht;
        result = 31 * result + (int) length;
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
        Rectangle rectangle = (Rectangle) obj;
        return rectangle.getLength() == length && rectangle.weidht == weidht;
    }
}
