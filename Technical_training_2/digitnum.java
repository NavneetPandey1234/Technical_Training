public class digitnum {
    static void maine(int num, int sum) {
        if (num == 0) {
            System.out.println(sum);
        } else {
            // maine(num / 10, sum);
            int i = num % 10;
            sum += i;
            maine(num / 10, sum);
        }
    }

    public static void main(String[] args) {
        maine(12345, 0);
    }
}
