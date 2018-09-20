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
public int strStr(String haystack, String needle) {
        int hayLen = haystack.length() , needLen = needle.length();
        if(hayLen < needLen){
            return -1;
        }else if(needLen == 0){
            return 0;
        }
        int dum = hayLen - needLen;
        for(int i = 0; i <= dum ; i++){
            if((haystack.substring(i,i+needLen)).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
