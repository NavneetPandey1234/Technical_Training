import java.net.SocketTimeoutException;
import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int count = 0, i;
        for (i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("It is prime number....");
        } else {
            System.out.println("It is not prime number....");
        }
    }
}