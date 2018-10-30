package anikina.olga.tasks.java.main;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.*;

public class MyTriangle {
    MyPoint point1;
    MyPoint point2;
    MyPoint point3;

    public MyTriangle(MyPoint point1, MyPoint point2, MyPoint point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
        if (!validateTriangle()) {
            throw new IllegalArgumentException("This triangle is not exist");
        }
    }
    private boolean validateTriangle() {
        List<Double> edges = new ArrayList<>();
        edges.add(this.point1.distnce(point2));
        edges.add(this.point1.distnce(point3));
        edges.add(this.point3.distnce(point2));
        double i1 = edges.get(0);
        if ((edges.get(0) < (edges.get(1) + edges.get(2))) &&
                (edges.get(1) < (edges.get(0) + edges.get(2)))
                && ((edges.get(2) < (edges.get(1) + edges.get(0))))) {
            return true;
        }
        else return  false;
    }


    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.point1.setXY(x1, y1);
        this.point2.setXY(x2, y2);
        this.point3.setXY(x3, y3);
    }

    public double getPerimetr() {
        Double result = this.point1.distnce(point2) + this.point1.distnce(point3) + this.point2.distnce(point3);
        double newDouble = new BigDecimal(result).setScale(3, RoundingMode.UP).doubleValue();
        return newDouble;
    }

    public String getType() {
        String result = "";
        Set<Double> edges = new HashSet<>();
        edges.add(this.point1.distnce(point2));
        edges.add(this.point1.distnce(point3));
        edges.add(this.point3.distnce(point2));
        switch (edges.size()) {
            case 1:
                result = "equilateral";
                break;
            case 2:
                result = "isosceles";
                break;
            case 3:
                result = "scalene";
            break;
        }
        return result;
    }
    public String formatRerimetrString() {
        String pattern = "##0.00";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);
        String format = decimalFormat.format(this.getPerimetr());
        return format;
    }

    @Override
    public String toString() {
        return "MyTriangle = [ v1 = " + point1.toString() + ", v2 = "
                + point2.toString() + ", v3 = " + point3.toString();
    }
}
