package anikina.olga.tasks.java.main;

import java.sql.SQLOutput;

public class Polynomial {
    private double[] coeffs;

    public Polynomial(final double... coeffs) {
        this.coeffs = new double[coeffs.length];
        for (int i = 0; i < coeffs.length; i++) {
            this.coeffs[i] = coeffs[i];
        }
    }

    public double[] getCoeffs() {
        return this.coeffs;
    }

    public int getDegree() {
        return this.coeffs.length - 1;
    }

    public String sing(final double x) {
        if (x < 0) return " - ";
        else return " + ";
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = coeffs.length; i <= 1; i--) {
            result += sing(coeffs[i]) + Math.abs(coeffs[i]) + "x^" + i;
        }
        result += sing(coeffs[0]) + Math.abs(coeffs[0]);
        return result;
    }

    public Polynomial add(Polynomial rightPolynomial) {
        int maxDegree = Math.max(this.getDegree(), rightPolynomial.getDegree());
        int minDegree = Math.min(this.getDegree(), rightPolynomial.getDegree());
        double[] resultCoeffs = new double[maxDegree + 1];
        for (int i = 0; i <= minDegree; i++) {
            resultCoeffs[i] = coeffs[i] + rightPolynomial.getCoeffs()[i];
        }
        if (maxDegree == this.getDegree()) {
            for(int i = minDegree + 1; i <= maxDegree; i++) {
                resultCoeffs[i] = this.getCoeffs()[i];
            }
        } else {
            for(int i = minDegree + 1; i <= maxDegree; i++) {
                resultCoeffs[i] = rightPolynomial.getCoeffs()[i];
                System.out.println(" thr " + resultCoeffs[i]);
            }
        }
        Polynomial result = new Polynomial(resultCoeffs);
        return  result;
    }

    public Polynomial multiply(Polynomial rightPolynomial) {
        int resultDegree = this.getDegree() + rightPolynomial.getDegree();
        double[] resultCoeffs = new double[resultDegree + 1];
        for (int i = 0; i <= this.getDegree(); i++ ) {
            for (int j = 0; j < rightPolynomial.getDegree(); j++) {
                resultCoeffs[i + j] += this.getCoeffs()[i] * rightPolynomial.getCoeffs()[j];
            }

        }
        Polynomial result = new Polynomial(resultCoeffs);
        return result;
    }


}
