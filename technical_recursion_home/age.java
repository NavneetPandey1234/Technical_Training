// import java.util.Scanner;

// public class age {
//     public static int age(int ur_age) {
//         if (ur_age == 0) {
//             return 0;
//         } else if (ur_age >= 18) {
//             System.out.println("You can give vote......");
//         } else {
//             System.out.println("You can not give vote......");
//         }
//         // reutrn (ur_age);
//         return ur_age;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter your age : ");
//         int ur_age = sc.nextInt();
//         System.out.println(ur_age);
//     }
// }

import java.util.Scanner;

public class age {
    public static void checkVotingEligibility(int ur_age) {
        if (ur_age >= 18) {
            System.out.println("You can vote.");
        } else {
            System.out.println("You cannot vote.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int ur_age = sc.nextInt();
        checkVotingEligibility(ur_age);
        sc.close(); // Don't forget to close the scanner
    }
}
