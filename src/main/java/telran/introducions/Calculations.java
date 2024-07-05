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

    public static int maxDigit(int number) {
        // TODO
        if (number == 0) {
            return 0; // Special case for zero
          }
          int maxDigit = 0;
          while (number > 0) {
            int digit = number % 10;
            maxDigit = Math.max(maxDigit, digit);
            number /= 10;
          }
          return maxDigit;
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
