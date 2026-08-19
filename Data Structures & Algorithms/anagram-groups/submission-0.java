class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String s: strs){
        int[] count = new int[26];
            for(char c: s.toCharArray()){
                count[c-'a']++;
            }

            String signature = Arrays.toString(count);
            if (!map.containsKey(signature)) {
                map.put(signature, new ArrayList<>());
            }
            map.get(signature).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
