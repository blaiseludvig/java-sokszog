package hu.petrik.szokszog_oop;

public class Teglalap extends Sokszog {
    protected double b;

    @Override
    public String getMegnevezes() {
        return "téglalap";
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
        ervenyesit();
    }

    public Teglalap(double a, double b) {
        super(a);
        this.b = b;

        ervenyesit();

    }

    @Override
    protected boolean isErvenyes() {
        if (a <= 0 || b <= 0) {
            return false;
        } else {
            return true;
        }
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
