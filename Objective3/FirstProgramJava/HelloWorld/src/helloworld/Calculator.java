package helloworld;

public class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int subtract(int left, int right) {
        return left - right;
    }

    int divide(int numerator, int denominator) {
        if (denominator == 0) {
            return Integer.MAX_VALUE;
        }
        return numerator / denominator;
    }

    int multiply(int port, int starboard) {
        System.out.println("oh, so you want me to add " + port + " and " + starboard + " together?");
        return port * starboard;
    }

    long divide(long numerator, long denominator) {
        if (denominator == 0) {
            return Long.MAX_VALUE;
        }
        return numerator / denominator;
    }

    double divide(double numerator, double denominator) {
        if (denominator == 0) {
            return Double.MAX_VALUE;
        }
        return numerator / denominator;
    }

    public static void main(String[] args) {
        System.out.println(Character.BYTES);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Float.MAX_VALUE);

        System.out.println(2l / 3l);
        System.out.println(3l / 2l);
        System.out.println(2f / 3f);
        System.out.println(3d / 2d);
    }

    int modulus(int a, int b) {
        return b % a;
    }

    int decrement(int i) {
        return --i;
    }

    int increment(int i) {
        return ++i;
    }
}
