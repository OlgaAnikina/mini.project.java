package anikina.olga.tasks.java.main;

public class Factorial {
    private int n;
    private String type;

    public Factorial(int n) {
        this.n = n;
    }

    public Factorial() {
    }

    public String getType() {
        return type;
    }

    public int factorialRecursion(int n) {
        type = "Factorial with Recursion";
        if (n == 1) return n;
        else return n * factorialRecursion(n - 1);
    }

    public int factorial() {
        type = "Factorial without Recursion";
        int i = 1;
        while (n != 1) {
            i *= n;
            n--;
        }
        return i;
    }
}
