public class same_num_in_array {

    static boolean checkDuplicate(int[] arr, int num, int index) {
        if (index >= arr.length) {
            return false;
        }
        if (arr[index] == num) {
            return true;
        }
        return checkDuplicate(arr, num, index + 1);
    }

    static boolean hasDuplicates(int[] arr, int index) {
        if (index >= arr.length - 1) {
            return false;
        }
        if (checkDuplicate(arr, arr[index], index + 1)) {
            return true;
        }
        return hasDuplicates(arr, index + 1);
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 50, 40, 50 };
        if (hasDuplicates(arr, 0)) {
            System.out.println("The array contains duplicate numbers.");
        } else {
            System.out.println("The array does not contain duplicate numbers.");
        }
    }
}
