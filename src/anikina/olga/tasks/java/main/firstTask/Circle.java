package anikina.olga.tasks.java.main.firstTask;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {
    }

    ;

    public Circle(final double radius) {
        this.radius = radius;
    }

    public Circle(final double radius, final String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(final String color) {
        this.color = color;
    }

    public void setRadius(final double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        String result;
        result = "Radius = " + this.radius + ", Color = " + this.color;
        return result;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (int) radius;
        result = 31 * result + color.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Circle)) {
            return false;
        }
        Circle circle = (Circle) obj;
        return (circle.getRadius() == radius) && (circle.getColor().equals(color));
    }

}