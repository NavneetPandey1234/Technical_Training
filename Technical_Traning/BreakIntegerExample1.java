import java.util.Scanner;

public class BreakIntegerExample1 {
    public static void main(String args[]) {
        int n, temp, digit, count = 0;
        // object of the Scanner class
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        n = sc.nextInt();
        System.out.println("Enter the seed : ");
        int seed = sc.nextInt();
        temp = n;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        while (temp > 0) {
            digit = temp % 10;
            // System.out.println("Digit at place " + count + " is: " + digit);
            temp = temp / 10;
            count--;
        }
    }
}