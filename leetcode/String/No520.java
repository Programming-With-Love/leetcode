package Algorithm.leetcode.String;

/**
 * @author tujietg
 * @date 2019/9/5 9:10 AM
 */
public class No520 {

    public static void main(String[] args) {
        System.out.println(detectCapitalUse("uZfa"));
    }

    public static boolean detectCapitalUse(String word) {
        int sum = 0;
        for (int i = 0; i < word.length(); i++) {
            char mid = word.charAt(i);
            if (mid - 'a' <= -7) {
                sum++;
            }
        }
        if (sum == word.length() || sum == 0) {
            return true;
        } else {
            if (sum == 1) {
                if (word.charAt(0) - 'a' <= -7) {
                    return true;
                }
            }
            return false;
        }
    }
}

