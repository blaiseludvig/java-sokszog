package hu.petrik.szokszog_oop;

import java.util.concurrent.ThreadLocalRandom;

public class Paralelogramma extends Sokszog implements Sokszog.AsciiArt {
    protected double h;

    // paralelogramma oldalának hossza
    private double b;

    protected double alfa;

    @Override
    public String getMegnevezes() {
        return "paralelogramma";
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
        ervenyesit();
    }

    public double getAlfa() {
        return alfa;
    }

    public void setAlfa(double alfa) {
        this.alfa = alfa;
        ervenyesit();
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
        ervenyesit();
    }

    public Paralelogramma(double a, double h, double alfa) {
        super(a);
        this.h = h;
        this.alfa = alfa;
        this.b = h / Math.sin(Math.toRadians(alfa));

        ervenyesit();
    }

    public Paralelogramma() {
        super(0);

        // a nextDouble() alsó értéke inklúzív, ezért lehet 0
        do {
            this.a = ThreadLocalRandom.current().nextDouble(0, 10);
            this.h = ThreadLocalRandom.current().nextDouble(0, 10);
            this.alfa = ThreadLocalRandom.current().nextDouble(0, 90);
        } while (!isErvenyes());

        this.b = h / Math.sin(Math.toRadians(alfa));
    }

    @Override
    protected boolean isErvenyes() {
        if (alfa <= 0 || alfa >= 90) {
            return false;
        }

        if (h <= 0 || a <= 0) {
            return false;
        }

        return true;

    }

    @Override
    public double getKerulet() {
        return 2 * a + 2 * getB();
    }

    @Override
    public double getTerulet() {
        return a * h;
    }

    public String getAsciiArt() {
        return ""
                + "             a          \n"
                + "   *-------------------*\n"
                + "  /|                A /\n"
                + " / | h               / b\n"
                + "/  |                /\n"
                + "*--+----------------*\n";
    }

    @Override
    public String toString() {
        return String.format("%s: a: %.2f b: %.2f K: %.2f T: %.2f", getMegnevezes(), a, this.getB(), getKerulet(), getTerulet());
    }
}
