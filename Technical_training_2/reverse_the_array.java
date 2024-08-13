public class reverse_the_array {
    static void printArray(int arr[], int index) {
        if (index == arr.length) {
            return;
        }
        System.out.print(arr[index] + " ");
        printArray(arr, index + 1);
    }

    static void reverseArray(int arr[], int low, int high) {
        if (low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            reverseArray(arr, low + 1, high - 1);
        }
    }

    public static void main(String[] args) {
        int n = 5;
        int arr[] = { 10, 20, 30, 40, 50 };
        reverseArray(arr, 0, n - 1);
        printArray(arr, 0);
    }
}