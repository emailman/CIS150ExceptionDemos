package p2;

/*
 * Created by emailman on 3/1/2016.
 */

public class Main {
    public static void main(String[] args) {
        try {
            Balloon b1 = new Balloon(10, "Yellow");
            System.out.println(b1);

            Balloon b2 = new Balloon(-10, "Yellow");
            System.out.println(b2);

        } catch (InvalidDiameterException e) {
            System.out.println(e);
        } finally {
            System.out.println
                    ("number of balloons = " + Balloon.getNumberOfBalloons());
        }
    }
}

class Balloon {

    private double diameter;
    private String color;
    private static int numberOfBalloons = 0;

    public Balloon(double arg1, String arg2) throws InvalidDiameterException {
        if (arg1 > 0)
            diameter = arg1;
        else
            throw new InvalidDiameterException(arg1);

        color = arg2;
        numberOfBalloons++;
    }

    public static int getNumberOfBalloons() {
        return numberOfBalloons;
    }

    @Override
    public String toString() {
        return "Balloon{" +
                "diameter=" + diameter +
                ", color='" + color + '\'' +
                '}';
    }
}

// Define a custom exception
class InvalidDiameterException extends Exception {
    // Construct an exception
    public InvalidDiameterException(double e) {
        super("Invalid diameter " + e);
    }
}
