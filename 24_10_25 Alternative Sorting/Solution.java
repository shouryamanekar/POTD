class Solution {
    public static ArrayList<Integer> alternateSort(int[] arr) {

        // Your code goes here
         Arrays.sort(arr);
        
        int low = 0;
        int high = arr.length - 1;
        
        ArrayList<Integer> result = new ArrayList<>();
        
        while (low <= high) {
            if (high >= low) {
                result.add(arr[high--]);
            }
            if (low <= high) {
                result.add(arr[low++]); 
            }
        }
        
        return result;
    }
}