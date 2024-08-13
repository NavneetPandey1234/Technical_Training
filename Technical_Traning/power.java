public class power {
    public static int armstrong(int num) {
        return 0;
    }

    public static int power_1(int n, int p) {
        if (p == 0) {
            return 1;
        }
        return power_1(n, p - 1) * n;
    }

    public static int len(int n) {
        if (n == 0) {
            return 0;
        }
        return len(n / 10) + 1;
    }

    public static void main(String[] args) {
        System.out.println(power_1(2, 2));
        System.out.println(len(12345));
    }
}