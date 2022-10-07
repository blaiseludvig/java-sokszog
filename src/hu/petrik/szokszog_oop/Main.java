package hu.petrik.szokszog_oop;

public class Main {

    public static void main(String[] args) {
        System.out.println(new Haromszog(1, 1, 1));
        System.out.println(new Haromszog());
        System.out.println(new Teglalap(10, 4));
        System.out.println(new Paralelogramma(4, 4, 30));
        System.out.println(new DerekszoguHaromszog(12, 4));

        System.out.println(new Sokszogek());
    }
}
