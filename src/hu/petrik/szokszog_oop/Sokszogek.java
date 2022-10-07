package hu.petrik.szokszog_oop;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;

public class Sokszogek {
    private ArrayList<Sokszog> sokszogLista = new ArrayList<>();

    private static ArrayList<Class> sokszogek = new ArrayList<>() {{
        add(Teglalap.class);
        add(Haromszog.class);
        add(Paralelogramma.class);
        add(DerekszoguHaromszog.class);
    }};

    public Sokszogek() {
        for (Class c : sokszogek) {
            try {
                sokszogLista.add((Sokszog) (c.getDeclaredConstructor().newInstance()));
            } catch (InstantiationException e) {
                throw new RuntimeException(e);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e);
            } catch (NoSuchMethodException e) {
                throw new RuntimeException(String.format("A %s osztálynak nincsen random konstruktora!", c.getName()));
            }
        }
    }

    public double osszKerulet() {
        double n = 0;

        for (Sokszog s : sokszogLista) {
            n += s.getKerulet();
        }
        return n;
    }

    public double osszTerulet() {
        double n = 0;

        for (Sokszog s : sokszogLista) {
            n += s.getTerulet();
        }
        return n;
    }

    public int maxTerulet() {
        Sokszog max = sokszogLista.get(0);

        for (Sokszog s : sokszogLista) {
            if (s.getTerulet() > max.getTerulet()) {
                max = s;
            }
        }

        return sokszogLista.indexOf(max);
    }

    @Override
    public String toString() {
        String str = "Sokszogek: {\n";
        str += String.format("  Össz. kerület: %.2f%n", osszKerulet());
        str += String.format("  Össz. terület: %.2f%n", osszTerulet());
        str += String.format("  Max terület: %d. sokszög%n", maxTerulet() + 1);

        for (int i = 0; i < sokszogLista.size(); i++) {
            str += String.format("  %d - %s%n", i + 1, sokszogLista.get(i));
        }

        str += "}\n";

        return str;

    }
}
