// import javax.swing.plaf.synth.SynthListUI;

public class even_odd_file {

    static void even_odd(int range) {
        if (range == 0)
            if (range % 2 == 0) {
                System.out.println(range + ". Even");
            } else {
                System.out.println(range + ". Odd");
            }
        even_odd(range - 1);

    }

    public static void main(String[] args) {
        even_odd(50);
    }

}
