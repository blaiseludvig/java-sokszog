package hu.petrik.szokszog_oop;

public abstract class Sokszog {
    public class ErvenytelenSokszogException extends IllegalArgumentException {
        public ErvenytelenSokszogException() {
            super(String.format("A(z) %s érvénytelen!", getMegnevezes()));
        }
    }

    public abstract String getMegnevezes();

    protected double a;

    public Sokszog(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
        if (!isErvenyes()) {
            throw new ErvenytelenSokszogException();
        }
    }

    protected abstract boolean isErvenyes();

    protected void ervenyesit() {
        if (!isErvenyes()) {
            throw new ErvenytelenSokszogException();
        }
    }

    public abstract double getKerulet();

    public abstract double getTerulet();

    @Override
    public String toString() {
        return String.format("K: %.2f T: %.2f", getKerulet(), getTerulet());
    }
}
