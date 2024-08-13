import java.util.Scanner;

public class pattern5 {
    static void pattern1(int num) {
        for (int i = 0; i <= num; i++) {
            for (int j = num; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        pattern1(num);
    }
}