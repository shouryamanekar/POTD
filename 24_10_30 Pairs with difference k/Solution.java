class Solution {
    int countPairsWithDiffK(int[] arr, int k) {
        // code here
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        int count = 0;

        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        for (int num : frequencyMap.keySet()) {
            if (k == 0) {
                int freq = frequencyMap.get(num);
                count += freq * (freq - 1) / 2;
            } else {
                if (frequencyMap.containsKey(num + k)) {
                    count += frequencyMap.get(num) * frequencyMap.get(num + k);
                }
            }
        }

        return count;
    }
}