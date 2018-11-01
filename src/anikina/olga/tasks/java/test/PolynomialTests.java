package anikina.olga.tasks.java.test;

import anikina.olga.tasks.java.main.firstTask.Polynomial;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PolynomialTests {
    private static final double DELTA = 0.1;
    @Test
    public void isPolynomialAddRight() {
        double[] coeffs1 = {1, 3, 2, 4};
        double[] coeffs2 = {2, 3};
        double[] coeffs3 = {3, 6, 2, 4};


        Polynomial polynom1 = new Polynomial(coeffs1);
        Polynomial polynom2 = new Polynomial(coeffs2);
        Polynomial polynom3 = polynom1.add(polynom2);
        assertEquals(3, polynom3.getDegree() );
    }


    @Test
    public void isPolynomialMultiplyRight() {
        double[] coeffs1 = {1, 3, 2, 4};
        double[] coeffs2 = {2, 3};
        double[] coeffs3 = {3, 6, 2, 4};


        Polynomial polynom1 = new Polynomial(coeffs1);
        Polynomial polynom2 = new Polynomial(coeffs2);
        Polynomial polynom3 = polynom1.multiply(polynom2);

        assertEquals(4, polynom3.getDegree() );
    }

    @Test
    public void isEqualsPolynomialRightwhithThis() {
        double[] coeffs2 = {2, 3};
        Polynomial polynom2 = new Polynomial(coeffs2);

        assertEquals(true, polynom2.equals(polynom2) );
    }

    @Test
    public void isEqualsPolynomialRightWhithOther() {
        double[] coeffs1 = {1, 3, 2, 4};
        double[] coeffs2 = {2, 3};
        Polynomial polynom1 = new Polynomial(coeffs1);
        Polynomial polynom2 = new Polynomial(coeffs2);

        assertEquals(false, polynom2.equals(polynom1) );
    }
}
