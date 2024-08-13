public class demo {
    static void printname(int val) {
        if (val == 0) {
            return;
        }
        System.out.println("Navneet" + val);
        // System.out.println("Pandey");
        printname(val - 1);
        System.out.println("Pandey" + val);

        // Tail recorsion because it id the last line of the fuction
        // System.out.println("Pandey");
    }

    public static void main(String[] args) {
        printname(5);
    }
}