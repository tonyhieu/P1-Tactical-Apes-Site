package files.labs;

public class Recursion {
    public static int gcf(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        else {
            return gcf(b, a % b);
        }
    }

    public static String returnGcf(int a, int b) {
        int end = gcf(a, b);
        return "The greatest common factor of " + a + " and " + b + " is " + end;
    }

    public static String reduceFraction(int numerator, int denominator) {
        if (numerator % denominator == 0) {
            return numerator + "/" + denominator + " reduces to " + numerator/denominator;
        }
        else {
            return numerator + "/" + denominator + " reduces to " + numerator/gcf(numerator, denominator) + "/" + denominator/gcf(numerator, denominator);
        }
    }
}

