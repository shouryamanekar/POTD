class Solution {
    public long maxSum(Long[] arr) {
        // code here
        Arrays.sort(arr);
        int n = arr.length;
        
        Long[] zigzagArr = new Long[n];
        int i = 0, j = n - 1;
        int idx = 0;
        
        while (i <= j) {
            if (idx % 2 == 0) {
                zigzagArr[idx++] = arr[i++];
            } else {
                zigzagArr[idx++] = arr[j--];
            }
        }
        
        long maxSum = 0;
        for (int k = 0; k < n; k++) {
            maxSum += Math.abs(zigzagArr[k] - zigzagArr[(k + 1) % n]);
        }
        
        return maxSum;
    }
}