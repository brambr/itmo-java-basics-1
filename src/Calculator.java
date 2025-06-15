public class Calculator {

    public long summation(long x, long y) {
        return x + y;
    }

    public double summation(double x, double y) {
        return x + y;
    }

    public int summation(int x, int y) {
        return x + y;
    }

    public long subtraction(long x, long y) {
        return x - y;
    }

    public double subtraction(double x, double y) {
        return x - y;
    }

    public int subtraction(int x, int y) {
        return x - y;
    }

    public long multiplication(long x, long y) {
        return x * y;
    }

    public double multiplication(double x, double y) {
        return x * y;
    }

    public int multiplication(int x, int y) {
        return x * y;
    }

    public long division(long x, long y) {
        if (y != 0)
            return x / y;
        else {
            System.out.println(" Y не может быть равен 0");
            return 0;
        }
    }

    public double division(double x, double y) {
        if (y != 0)
            return x / y;
        else {
            System.out.println(" Y не может быть равен 0");
            return 0;
        }
    }

    public int division(int x, int y) {
        if (y != 0)
            return x / y;
        else {
            System.out.println(" Y не может быть равен 0");
            return 0;
        }
    }
}