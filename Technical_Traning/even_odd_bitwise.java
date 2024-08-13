import java.util.Scanner;

public class even_odd_bitwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        if ((n ^ 1) == n + 1) {
            System.out.println("even");
        } else {
            System.out.println("Odd");
        }
        if ((n | 1) == n + 1) {
            System.out.println("even");
        } else {
            System.out.println("Odd");
        }
        if ((n & 1) == 0) {
            System.out.println("even");
        } else {
            System.out.println("Odd");
        }
    }
}