import java.util.Scanner;

public class palindrome {
    static int main(int num, int newnum) {
        if (num == 0) {
            return newnum;
        } else {
            newnum = (newnum * 10) + (num % 10);
            return main(num / 10, newnum);
        }
    }

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        num = sc.nextInt();
        int newnum = 0;
        if (main(num, newnum) == num) {
            System.out.println("Number is palindrome");
        } else {
            System.out.println("Number is not Palindrome");
        }
    }
}