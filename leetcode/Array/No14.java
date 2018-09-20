class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int i = 0;
        if(strs.length == 0){
            return "";
        }
        if(strs == null){
            return null;
        }
        while(i < strs[0].length() && strs[0].toCharArray()[i] == (strs[strs.length - 1].toCharArray()[i])){
            i++;
        }
        if(i == 0){
            return "";
        }else{
            return strs[0].substring(0,i);
        }
        
    }
}

