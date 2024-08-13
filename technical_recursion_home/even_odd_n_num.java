import java.util.Scanner;

public class even_odd_n_num {
    static void num(int num, int ce, int co) {
        if (num == 0) {
            System.err.println("Total number of even digit : " + ce);
            System.out.println("Total number of odd digit : " + co);
            return;
        } else {
            if (num % 2 == 0) {
                // System.out.println("Even " + num);
                ce++;
            } else {
                // System.out.println("Odd " + num);
                co++;
            }
            num(num - 1, ce, co);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int ce = 0;
        int co = 0;
        num(num, ce, co);
    }
}
