package hu.petrik.szokszog_oop;

import java.util.concurrent.ThreadLocalRandom;

public class Teglalap extends Sokszog implements Sokszog.AsciiArt {
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

    public Teglalap() {
        super(0);
        // a nextDouble() alsó értéke inklúzív, ezért lehet 0
        do {
            this.a = ThreadLocalRandom.current().nextDouble(0, 10);
            this.b = ThreadLocalRandom.current().nextDouble(0, 10);
        } while (!isErvenyes());

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
    public String getAsciiArt() {
        return ""
                + "      a      \n"
                + "+-----------+\n"
                + "|           |\n"
                + "|           | b\n"
                + "|           |\n"
                + "+-----------+\n";
    }

    @Override
    public String toString() {
        return String.format("%s: a: %.2f b: %.2f K: %.2f T: %.2f", getMegnevezes(), a, b, getKerulet(), getTerulet());
    }


}
