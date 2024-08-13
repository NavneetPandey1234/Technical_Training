import java.util.Arrays;

public class replace_same_num {
    static void replace(int[] arr, int targetValue, int replacementValue, int index) {
        if (index >= arr.length) {
            return;
        }
        if (arr[index] == targetValue) {
            arr[index] = replacementValue;
        }
        replace(arr, targetValue, replacementValue, index + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 50, 60, 50, 40, 70, };
        int targetValue = 50;
        int replacementValue = 500;

        replace(arr, targetValue, replacementValue, 0);

        // Print the updated array
        System.out.println(Arrays.toString(arr));
    }
}
