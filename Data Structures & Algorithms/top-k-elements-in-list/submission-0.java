class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> count = new HashMap<>();
        for(int n: nums){
            count.put(n, count.getOrDefault(n, 0)+1);
        }
        ArrayList<Map.Entry<Integer, Integer>> entries = new ArrayList<>(count.entrySet());
        entries.sort(
            Map.Entry.<Integer, Integer>comparingByValue().reversed()
        );
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = entries.get(i).getKey();
        }

        return result;
    }
}
