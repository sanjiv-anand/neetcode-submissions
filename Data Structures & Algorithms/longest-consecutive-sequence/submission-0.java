class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> inp = new HashSet<>();
        for(int n: nums){
            inp.add(n);
        }

        int longest = 0;
        for(int n: inp){
            if(inp.contains(n-1)){
                continue;
            }

            int length = 1;

            while(inp.contains(n+length)){
                length++;
            }
            longest = Math.max(longest, length);
        }
        return longest;
    }
}
