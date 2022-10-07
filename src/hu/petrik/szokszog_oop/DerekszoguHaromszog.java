package hu.petrik.szokszog_oop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.concurrent.ThreadLocalRandom;

public class DerekszoguHaromszog extends Sokszog implements Sokszog.AsciiArt {
    protected double b;

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return Math.sqrt(a * a + b * b);
    }

    public DerekszoguHaromszog(double a, double b) {
        super(a);
        this.b = b;
        ervenyesit();
    }

    public DerekszoguHaromszog() {
        super(0);

        // a nextDouble() alsó értéke inklúzív, ezért lehet 0
        do {
            this.a = ThreadLocalRandom.current().nextDouble(0, 10);
            this.b = ThreadLocalRandom.current().nextDouble(0, 10);
        } while (!isErvenyes());

    }

    @Override
    public String getMegnevezes() {
        return "derékszögű háromszög";
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
        return a + b + getC();
    }

    @Override
    public double getTerulet() {
        return 0.5 * a * b;
    }

    @Override
    public String getAsciiArt() {
        return ""
                + "         /|\n"
                + "        / |\n"
                + "       /  |\n"
                + "      /   |\n"
                + "     /    |\n"
                + "  c /     | b\n"
                + "   /      |\n"
                + "  /       |\n"
                + " /        |\n"
                + "/     90° |\n"
                + "*---------+\n"
                + "     a     \n";
    }

    @Override
    public String toString() {
        return String.format("%s: a: %.2f b: %.2f c: %.2f K: %.2f T: %.2f", getMegnevezes(), a, b, getC(), getKerulet(), getTerulet());
    }
}
