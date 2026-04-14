import java.util.*;

class MergeSort {

    // Divide the array into smaller parts
    public static int[] divide(int[] arr) {
        if(arr.length == 1) {
            return arr; // base case
        }

        int mid = arr.length / 2;

        // split array into left and right
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);

        // recursively divide
        left = divide(left);
        right = divide(right);

        // merge sorted arrays
        return merge(left, right, new int[arr.length]);
    }

    // Merge two sorted arrays
    public static int[] merge(int[] arr1, int[] arr2, int[] res) {
        int i = 0, j = 0, k = 0;
        // compare and merge elements
        while(i < arr1.length && j < arr2.length) {
            if(arr1[i] < arr2[j]) {
                res[k++] = arr1[i++];
            } else {
                res[k++] = arr2[j++];
            }
        }
        // copy remaining elements
        while(i < arr1.length) {
        	res[k++] = arr1[i++];
        }
        while(j < arr2.length) {
        	res[k++] = arr2[j++];
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {32,18,17,15,6,4,5,2};

        int[] res = divide(arr);
        // print sorted array
        System.out.println(Arrays.toString(res));
    }
}
