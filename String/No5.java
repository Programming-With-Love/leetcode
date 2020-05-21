/**
 * @author tujietg
 * @date 5/21/20 9:07 AM
 */
public class No5 {
    public String longestPalindrome(String s) {
        int len = s.length();
        if (len < 2) {
            return s;
        }
        int start = 0;
        int midLen = 1;

        boolean[][] bp = new boolean[len][len];
        for (int i = 0; i < len; i++) {
            bp[i][i] = true;
        }

        char[] charArr = s.toCharArray();
        for (int j = 1; j < len; j++) {
            for (int i = 0; i < j; i++) {
                if (charArr[i] != charArr[j]) {
                    bp[i][j] = false;
                } else {
                    if (j - i < 3) {
                        bp[i][j] = true;
                    } else {
                        bp[i][j] = bp[i + 1][j - 1];
                    }
                }
                if (bp[i][j] == true && j - i + 1 > midLen) {
                    midLen = j - i + 1;
                    start = i;
                }
            }
        }
        return s.substring(start, start + midLen);
    }
}
