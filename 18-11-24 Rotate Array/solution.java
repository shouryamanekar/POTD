class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        int n = arr.length;
        d = d % n; // Handle cases where d > n (effective rotations)
        
        // Step 1: Reverse the first d elements
        reverse(arr, 0, d - 1);
        
        // Step 2: Reverse the remaining elements
        reverse(arr, d, n - 1);
        
        // Step 3: Reverse the entire array
        reverse(arr, 0, n - 1);
    }

    // Helper function to reverse a portion of the array
    static void reverse(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
