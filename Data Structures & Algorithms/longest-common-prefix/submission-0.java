class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        int strLen = strs[0].length();
        for(String s: strs){
            if(strLen > s.length()){
                strLen = s.length();
            }
        }
        for(int i = 0; i<strLen; i++){
            Boolean check = true;
            char prev = strs[0].charAt(i);
            for(int j = 0; j<strs.length; j++){
                if(prev != strs[j].charAt(i)){
                    check = false;
                    break;
                }
            }
            if(check){
                sb.append(prev);
            }
            else{
                break;
            }
        }
        return sb.toString();
    }
}