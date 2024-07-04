package telran.introducions;

public class Calculations {
    public static int sum(int op1, int op2) {
        // TODO
        int res = op1 + op2;
        return res;
    }

    public static int multiply(int op1, int op2) {
        // TODO
        int res = op1*op2;
        return res;
    }

    public static int divide(int op1, int op2) {
        // TODO
        int res = op1/op2;
        return res;
    }

    public static int sumOfDigits(int number) {
        // TODO
        int res = number + number;
        return res;
    }

    public static int maxDigit(int num1, int num2) {
        // TODO
        if (num1 > num2) {
            return num1;
        } else if (num2 > num1) {
            return num2;
        } else
        return -1;
    }

    public static boolean isDividedOn(int number, int divider) {
        // TODO
        boolean res = false;
        if (number%divider == 0) {
            res = true;
        }
        return res;
    }
}
