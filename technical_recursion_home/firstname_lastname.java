public class firstname_lastname {
    static void name(int val) {
        if (val == 0) {
            return;
        }
        name(val - 1);
        System.out.println("Navneet " + val);
        System.out.println("Pandey " + val);
    }

    public static void main(String[] args) {
        name(5);
    }
}
