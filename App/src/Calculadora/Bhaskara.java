package Calculadora;

public class Bhaskara {

    public static double[] bhaskara(double a, double b, double c) {
        double delta = Math.sqrt(Math.pow(b, 2) - 4 * a * c);
        double x1 = Math.pow(-b, 2) + delta / 2 * a;
        double x2 = Math.pow(-b, 2) - delta / 2 * a;

        return new double[] {x1, x2};
    }

}
