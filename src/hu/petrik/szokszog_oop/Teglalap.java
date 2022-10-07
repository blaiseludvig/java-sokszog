package hu.petrik.szokszog_oop;

public class Teglalap extends Sokszog {

    public double b;

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public Teglalap(double a, double b) {
        super(a);
        this.b = b;
    }

    @Override
    public double getKerulet() {
        return 2 * (a + b);
    }

    @Override
    public double getTerulet() {
        return a * b;
    }

    @Override
    public String toString() {
        return String.format("a: %.2f b: %.2f K: %.2f T: %.2f", a, b, getKerulet(), getTerulet());
    }


}
