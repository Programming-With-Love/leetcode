package Algorithm.leetcode.String;

/**
 * @author tujietg
 * @date 2019/9/6 9:45 AM
 */
public class No557 {

    public static String reverseWords(String s) {
        String endString = "";
        String[] strArray = s.split(" ");
        for (int i = 0; i < strArray.length; i++) {
            String midStr = "";
            for (int j = 0; j < strArray[i].length(); j++) {
                char first = strArray[i].charAt(j);
                char last = strArray[i].charAt(strArray[i].length() - j - 1);
                char mid = first;
                if (j < strArray[i].length() - 1 - j) {
                    first = last;
                    last = mid;
                }
            }
            strArray[i] = strArray[i] + " ";
        }
        return endString;
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("Let's"));
    }
}
