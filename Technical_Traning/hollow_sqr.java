import java.util.Scanner;

public class hollow_sqr {
    public static void main(String args[]) {
        int i, j, my_input;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of a side : ");
        my_input = sc.nextInt();
        System.out.println("The hollow square pattern : ");

        for (i = 1; i <= my_input; i++) {
            for (j = 1; j <= my_input; j++) {
                if (i == 1 || i == my_input || j == 1 || j == my_input) {
                    System.out.print("*" + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.print("\n");
        }
        for (i = 1; i <= my_input; i++) {
            for (j = 1; j <= my_input; j++) {
                if (i == 1 || i == my_input || j == 1 || j == my_input) {
                    System.out.print("*" + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.print("\n");
        }
    }
}