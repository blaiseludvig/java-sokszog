package hu.petrik.szokszog_oop;

import java.util.concurrent.ThreadLocalRandom;

public class Haromszog extends Sokszog implements Sokszog.AsciiArt {

    protected double b;
    protected double c;

    @Override
    public String getMegnevezes() {
        return "háromszög";
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
        ervenyesit();
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
        ervenyesit();
    }

    public Haromszog(double a, double b, double c) {
        super(a);
        this.b = b;
        this.c = c;

        ervenyesit();

    }

    public Haromszog() {
        super(0);

        // a nextDouble() alsó értéke inklúzív, ezért lehet 0
        do {
            this.a = ThreadLocalRandom.current().nextDouble(0, 10);
            this.b = ThreadLocalRandom.current().nextDouble(0, 10);
            this.c = ThreadLocalRandom.current().nextDouble(0, (int) (a + b));
        } while (!isErvenyes());

    }

    public double getS() {
        return (a + b + c) / 2.0;
    }

    protected boolean isErvenyes() {
        if (a <= 0 || b <= 0 || c <= 0) {
            return false;
        }

        if ((a + b) <= c || (a + c) <= b || (b + c) <= a) {
            return false;
        }

        return true;
    }

    @Override
    public double getKerulet() {
        return a + b + c;
    }

    @Override
    public double getTerulet() {
        return Math.sqrt(getS() * (getS() - a) * (getS() - b) * (getS() - c));
    }

    @Override
    public String getAsciiArt() {
        return ""
                + "     /\\\n"
                + "    /  \\\n"
                + "   /    \\\n"
                + "a /      \\ b\n"
                + " /        \\\n"
                + "/          \\\n"
                + "------------\n"
                + "     c      \n";
    }

    @Override
    public String toString() {
        return String.format("a: %.2f b: %.2f c: %.2f K: %.2f T: %.2f", a, b, c, getKerulet(), getTerulet());

    }
}
