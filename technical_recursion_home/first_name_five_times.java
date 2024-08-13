public class first_name_five_times {
    static void name(int val) {
        if (val == 0) {
            return;
        }
        name(val - 1);
        System.out.println("Navneet Pandey" + val);
        // System.out.println("Pandey" + val);
    }

    public static void main(String[] args) {
        name(5);
    }
}