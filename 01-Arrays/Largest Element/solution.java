// Solution.java
class Solution {

    /**
     * Function to find the largest element in an array.
     *
     * @param arr The input array
     * @param n   The size of the array
     * @return The largest element in the array
     */
    public static int findLargestElement(int[] arr, int n) {
        int max = arr[0]; // Initialize max with the first element

        // Iterate through the array to find the maximum element
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max; // Return the largest element found
    }
}

// Main.java
public class Main {

    public static void main(String[] args) {
        // Array 1
        int[] arr1 = {2, 5, 1, 3, 0};
        int max = Solution.findLargestElement(arr1, arr1.length);
        System.out.println("The largest element in the first array is: " + max);

        // Array 2
        int[] arr2 = {8, 10, 5, 7, 9};
        max = Solution.findLargestElement(arr2, arr2.length);
        System.out.println("The largest element in the second array is: " + max);
    }
}
