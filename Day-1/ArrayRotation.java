import java.util.Arrays;

class Solution {

    public static int[] reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }

    static int[] rotateArr(int arr[], int d) {
        int n = arr.length;

        d = d % n;

        if (d < 0) {
            d = d + n;
        }

        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int d = 2;

        int[] res = rotateArr(arr, d);

        System.out.println(Arrays.toString(res));
    }
}
