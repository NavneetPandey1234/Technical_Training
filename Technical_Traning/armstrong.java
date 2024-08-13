import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = sc.nextInt();
        int len = (int) (Math.log10(number) + 1);
        System.out.println("Length of the number is : " + len);
        int originalNumber, remainder, result = 0, n = 0;

        originalNumber = number;
        for (; originalNumber != 0; originalNumber /= 10, ++n)
            ;

        originalNumber = number;

        for (; originalNumber != 0; originalNumber /= 10) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
        }
        System.out.println("The sum of the number is : " + result);

        if (result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}