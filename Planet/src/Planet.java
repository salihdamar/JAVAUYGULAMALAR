import java.util.Scanner;

public enum Planet {
    EARTH   (5.976e+24, 6.37814e6),
    MERCURY (3.303e+23, 2.4397e6),
    VENUS   (4.869e+24, 6.0518e6),
    MARS    (6.421e+23, 3.3972e6),
    JUPITER (1.9e+27,   7.1492e7),
    SATURN  (5.688e+26, 6.0268e7),
    URANUS  (8.686e+25, 2.5559e7),
    NEPTUNE (1.024e+26, 2.4746e7);

    double mass;   // in kilograms
    double radius; // in meters
    Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }

    // universal gravitational constant  (m3 kg-1 s-2)
     double G = 6.67300E-11;

    double surfaceGravity() {
        return G * mass / (radius * radius);
    }
    double surfaceWeight(double otherMass) {
        return otherMass * surfaceGravity();
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double earthWeight=input.nextDouble();
        double mass = earthWeight/EARTH.surfaceGravity();

        int i = 1;
        for (Planet p : Planet.values()) {
            System.out.printf(i + " . %s is %.2f %n", p, p.surfaceWeight(mass));
            i++;
        }
    }
}
