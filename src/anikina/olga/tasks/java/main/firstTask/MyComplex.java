package anikina.olga.tasks.java.main.firstTask;

public class MyComplex {
    private double real = 0.0;
    private double imag = 0.0;

    public MyComplex() {
    }

    ;

    public MyComplex(final double real, final double imag) {
        this.imag = imag;
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public double getReal() {
        return real;
    }

    public void setImag(final double imag) {
        this.imag = imag;
    }

    public void setReal(final double real) {
        this.real = real;
    }

    public void setValue(final double real, final double imag) {
        this.imag = imag;
        this.real = real;
    }

    public String toString() {
        return " ( " + this.real + " + " + this.imag + "i )";
    }

    public boolean isReal() {
        if (this.real != 0.0) return true;
        else return false;
    }

    public boolean isImag() {
        if (this.imag != 0.0) return true;
        else return false;
    }

    public boolean equals(final double real, final double imag) {
        if ((this.real == real) && (this.imag == imag)) return true;
        else return false;
    }

    public boolean equals(final MyComplex anotherComplex) {
        if ((this.real == anotherComplex.real) && (this.imag == anotherComplex.imag)) return true;
        else return false;
    }

    public double magnitude() {
        return Math.sqrt(Math.pow(this.real, 2) + Math.pow(this.imag, 2));
    }

    public double argiment() {
        return Math.acos(this.real / this.magnitude());
    }

    public MyComplex add(MyComplex rightComplex) {
        this.setReal(this.real + rightComplex.getReal());
        this.setImag(this.imag + rightComplex.getImag());
        return this;
    }

    public MyComplex addNew(MyComplex rightComplex) {
        MyComplex another = new MyComplex();
        another.setReal(this.real + rightComplex.getReal());
        another.setImag(this.imag + rightComplex.getImag());
        return this;
    }

    public MyComplex subtract(MyComplex rightComplex) {
        this.setReal(this.real - rightComplex.getReal());
        this.setImag(this.imag - rightComplex.getImag());
        return this;
    }

    public MyComplex subtractNew(MyComplex rightComplex) {
        MyComplex another = new MyComplex();
        another.setReal(this.real - rightComplex.getReal());
        another.setImag(this.imag - rightComplex.getImag());
        return this;
    }

    public MyComplex multiply(MyComplex rightComplex) {
        double real = this.real * rightComplex.getReal() - this.imag * rightComplex.getImag();
        double imag = this.real * rightComplex.getImag() + this.imag * rightComplex.getReal();
        this.setValue(real, imag);
        return this;
    }

    public MyComplex divide(MyComplex rightComplex) {
        double denominator = (Math.pow(rightComplex.getReal(), 2) + Math.pow(rightComplex.getImag(), 2));
        double real = (this.real * rightComplex.getReal()
                + this.imag * rightComplex.getImag()) / denominator;
        double imag = (this.imag * rightComplex.getReal()
                - this.real * rightComplex.getImag()) / denominator;
        this.setValue(real, imag);
        return this;
    }

    public MyComplex conjugate() {
        this.setImag((-1) * this.getImag());
        return this;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (int) real;
        result = 31 * result + (int) imag;
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
        MyComplex myComplex = (MyComplex) obj;
        return myComplex.getImag() == imag && myComplex.getReal() == real;
    }
}
