import java.util.Scanner;

public class rotate_num_1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            System.out.print("Enter the number of positions to rotate: ");
            int positions = scanner.nextInt();
            int length = String.valueOf(number).length();
            if (positions < 0) {
                positions = positions + length;
            }

            int rotatedNumber = rotateNumber(number, positions);
            System.out.println("Rotated number: " + rotatedNumber);
        }
    }

    private static int rotateNumber(int number, int positions) {
        int length = String.valueOf(number).length();
        positions = positions % length;

        int divisor = (int) Math.pow(10, positions);
        int remainder = number % divisor;
        int quotient = number / divisor;

        int rotatedNumber = (remainder * (int) Math.pow(10, length - positions)) + quotient;
        return rotatedNumber;
    }
}
