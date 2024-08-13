import java.util.Arrays;

public class max_min {
    static int findMax(int[] arr, int index) {
        if (index == arr.length - 1) {
            return arr[index];
        }
        int maxRest = findMax(arr, index + 1);
        return Math.max(arr[index], maxRest);
    }

    static int findMin(int[] arr, int index) {
        if (index == arr.length - 1) {
            return arr[index];
        }
        int minRest = findMin(arr, index + 1);
        return Math.min(arr[index], minRest);
    }

    public static void main(String[] args) {
        int arr[] = { 20, 30, 10, 40, 60 };

        int max = findMax(arr, 0);
        int min = findMin(arr, 0);

        int[] maxMinArray = { max, min };
        System.out.println("Maximum element is: " + max);
        System.out.println("Minimum element is: " + min);
        System.out.println("Array containing max and min elements: " + Arrays.toString(maxMinArray));
    }
}
