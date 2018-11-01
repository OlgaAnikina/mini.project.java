package anikina.olga.tasks.java.test;

import anikina.olga.tasks.java.main.firstTask.MyPoint;
import anikina.olga.tasks.java.main.firstTask.MyTriangle;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TriangleTests {
    private static final double DELTA = 0.1;
    @Test
    public void isPerimentrRightToString() {
        MyPoint point1 = new MyPoint(3,4);
        MyPoint point2 = new MyPoint(7,0);
        MyPoint point3 = new MyPoint(0,0);
        MyTriangle triangle = new MyTriangle(point1, point2, point3);

        assertEquals("17.66", triangle.formatRerimetrString());
    }
    @Test
    public void isDoublePerimetrRight() {
        MyPoint point1 = new MyPoint(3,4);
        MyPoint point2 = new MyPoint(7,0);
        MyPoint point3 = new MyPoint(0,0);
        MyTriangle triangle = new MyTriangle(point1, point2, point3);

        assertEquals(17.66, triangle.getPerimetr(), DELTA);
    }

    @Test
    public void ifTypeRight() {
        MyPoint point1 = new MyPoint(2,4);
        MyPoint point2 = new MyPoint(4,0);
        MyPoint point3 = new MyPoint(0,0);
        MyTriangle triangle = new MyTriangle(point1, point2, point3);

        assertEquals("isosceles", triangle.getType());

    }


}
