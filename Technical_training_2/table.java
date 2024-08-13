import java.util.Scanner;

public class table {

    static void Table(int num, int start) {
        if (start > 10) {
            return;
        }
        System.out.printf("%d x %d = %d%n", num, start, num * start);
        Table(num, start + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number u want table : ");
        int num = sc.nextInt();
        Table(num, 1);
    }
}