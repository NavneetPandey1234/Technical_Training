import java.util.Scanner;

public class seperate_num_print_in_line {
    static void num(int num, int nm) {
        if (num == 0) {
            return;
        }
        num(num / 10, nm);
        int i = num % 10;
        nm += i;
        System.out.println(i);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        num(num, 0);
    }
}
