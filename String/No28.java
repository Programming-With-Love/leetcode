class Solution {
    public int strStr(String haystack, String needle) {
        if(needle == "" || needle == null){
            return 0;
        }
        if(haystack.contains(needle)){
            return haystack.indexOf(needle);
        }
        return -1;
    }
}
