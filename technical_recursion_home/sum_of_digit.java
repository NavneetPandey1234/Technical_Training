import java.util.Scanner;

public class sum_of_digit {
    static void num(int num, int nm) {
        if (num == 0) {
            System.out.println(nm);
            // return;
        } else {
            int i = num % 10;
            nm += i;
            // System.out.println(i);
            num(num / 10, nm);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        num(num, 0);
    }
}
