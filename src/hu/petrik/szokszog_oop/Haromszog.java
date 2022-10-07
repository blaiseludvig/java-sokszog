package hu.petrik.szokszog_oop;

public class Haromszog extends Sokszog {

    public double b;
    public double c;

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public Haromszog(double a, double b, double c) {
        super(a);
        this.b = b;
        this.c = c;
    }

    @Override
    public double getKerulet() {
        return a + b + c;
    }

    @Override
    public double getTerulet() {
        double s = (a + b + c) / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public String toString() {
        return String.format("a: %.2f b: %.2f c: %.2f K: %.2f T: %.2f", a, b, c, getKerulet(), getTerulet());

    }
}
