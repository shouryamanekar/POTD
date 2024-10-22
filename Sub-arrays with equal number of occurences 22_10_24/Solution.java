class Solution {

    static int sameOccurrence(int arr[], int x, int y) {
        // write code here
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); 
        
        int diff = 0, result = 0;
        
        for (int num : arr) {
            if (num == x) diff++; 
            if (num == y) diff--;  
            
            int count = map.getOrDefault(diff, 0);  
            result += count;
            map.put(diff, count + 1);
        }
        
        return result;
    }
}