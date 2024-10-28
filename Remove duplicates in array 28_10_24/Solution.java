class Solution {
    ArrayList<Integer> removeDuplicate(int arr[]) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        HashSet<Integer> seen = new HashSet<>();
        
        for (int num : arr) {
            if (!seen.contains(num)) {
                seen.add(num);
                result.add(num);
            }
        }
        
        return result;
    }
}