class Solution {
    public boolean findTriplet(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        
        for (int k = n - 1; k >= 0; k--) {
            int target = arr[k];
            int i = 0, j = k - 1;
            
            while (i < j) {
                int currentSum = arr[i] + arr[j];
                
                if (currentSum == target) {
                    return true;
                } else if (currentSum < target) {
                    i++;
                } else {
                    j--;
                }
            }
        }
        
        return false;
    }
}