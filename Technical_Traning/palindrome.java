import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num, reserve, len, i, j, k, l, m;
        System.out.println("Enter the number : ");
        num = sc.nextInt();
        reserve = num;
        System.out.println("Reserve number : " + reserve);
        System.out.println("Original number : " + num);
        len = (int) (Math.log10(num) + 1);
        System.out.println("Length of the number is : " + len);
        // l = num % 10;
        // System.out.println("Value of l : " + l);
        while (num > 0) {
            // finds the last digit of the given number
            l = num % 10;
            // adds last digit to the variable sum
            m = +l;
            // removes the last digit from the number
            num = num / 10;

        }
    }
}