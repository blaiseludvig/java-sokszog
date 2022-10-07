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
