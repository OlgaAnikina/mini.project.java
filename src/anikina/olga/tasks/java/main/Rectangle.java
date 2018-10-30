package anikina.olga.tasks.java.main;

public class Rectangle {
    private float length = 1.0f;
    private  float weidht = 1.0f;
    public Rectangle(){};
    public Rectangle(float length, float weidht) {
        this.length = length;
        this.weidht = weidht;
    }

    public float getLength() {
        return length;
    }

    public float getWeidht() {
        return weidht;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public void setWeidht(float weidht) {
        this.weidht = weidht;
    }
    public float getArea() {
        return length * weidht;
    }
    public float getPerimetr(){
        return 2 * (length + weidht);
    }
    public String toString() {
        return " Length = " + length + ", Weidht = " + weidht +
                ", Area = " + this.getArea() + ", Perimetr = " + this.getPerimetr();

    }
}
