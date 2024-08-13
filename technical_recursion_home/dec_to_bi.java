import java.util.Scanner;

public class dec_to_bi {
    static int binary(int num) {
        if (num == 0) {
            return 0;
        } else {
            return (num % 2) + 10 * binary(num / 2);
        }
    }

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        num = sc.nextInt();
        System.out.println(binary(num));
    }
}
