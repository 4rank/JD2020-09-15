package by.it.moiseyenko.jd01_05;
import static java.lang.Math.*;
public class TaskB {
    public static void main(String[] args) {
        step1();
        step2();
    }

    private static void step1() {
        double y = 0;
        double result = 0;
        for (double a = 0; a <= 2; a = a + 0.2) {
            for (int x = 1; x <= 6; x++) {
                y = (Math.pow(7, a)) - (Math.cos(x));
                result = result + y;
            }
            System.out.printf("При a=%.2f Сумма y=%g%n", a, result);
            result = 0;
        }
        System.out.println();
    }
        private static void step2() {
            for (double x = -5.5; x < 2; x = x + 0.5) {
                double b;
                if (-2 < (x / 2) && x / 2 <= -1) {
                    b = sin(pow(x, 2));
                    double a = log10(abs(b + 2.74));
                    System.out.println(a + "" + x);
                } else if (-1 < x / 2 && x / 2 < 0.2) {
                    b = cos(pow(x, 2));
                    double a = log10(abs(b + 2.74));
                    System.out.println(a + "" + x);
                } else if (x / 2 == 0.2) {
                    b = 1 / tan(pow(x, 2));
                    double a = log10(abs(b + 2.74));
                    System.out.println(a + "" + x);
                }
            }
        }
