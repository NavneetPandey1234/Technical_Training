public class search_array {
    static boolean search(int[] arr, int num, int i) {
        if (i == arr.length) {
            return false;
        }
        if (arr[i] == num) {
            return true;
        }
        return search(arr, num, i + 1);
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        int num = 50;
        System.out.println(search(arr, num, 0));
    }
}
