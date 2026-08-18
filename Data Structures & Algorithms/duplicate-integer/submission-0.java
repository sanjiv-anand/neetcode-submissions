class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean check = false;
        HashSet<Integer> seen = new HashSet<>();
        for(int n : nums){
            if(seen.contains(n)){
                check = true;
                break;
            }
            else{
                seen.add(n);
            }
        }
        return check;
    }
}