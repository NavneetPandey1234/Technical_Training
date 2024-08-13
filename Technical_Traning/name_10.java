// public class name_10 {
//     public static void printname(int n) {
//         if (n == 0) {
//             return;
//         }
//         System.out.println(n + " Navneet");
//         printname(n - 1);
//     }

//     public static void main(String[] args) {
//         // int n = 10;
//         printname(10);
//     }
// }

public class name_10 {
    public static void printname(int n) {
        if (n == 0) {
            return;
        }
        printname(n - 1);
        System.out.println(n + ". Navneet");
        // printname(n - 1);
    }

    public static void main(String[] args) {
        // int n = 10;
        printname(5);
    }
}