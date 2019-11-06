package Algorithm.leetcode.String;

/**
 * 
 * Created by tujietg on Nov 6, 2019
 */
public class No680 {
	    public boolean validPalindrome(String s) {
	        int start = -1, end = s.length();
	        while(++start < --end){
	            if(s.charAt(start) != s.charAt(end)){
	                return isTrue(s,start - 1, end) || isTrue(s,start, end + 1);
	            }
	        }
	        return true;
	    }
	    
	    public boolean isTrue(String str,int start,int end){
	        while(++start < --end){
	            if(str.charAt(start) != str.charAt(end)){
	                return false;
	            }
	        }
	        return true;
	    }
}
