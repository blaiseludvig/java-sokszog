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
        return 0;
    }

    @Override
    public double getTerulet() {
        return 0;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
