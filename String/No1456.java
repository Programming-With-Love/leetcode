package String;

/**
 * @author tujietg
 * @date 5/27/20 8:39 AM
 */
public class No1456 {

    public int maxVowels(String s, int k) {
        int max = 0, count = 0, j = 0, sLen = s.length();

        for (int i = 0; i < sLen; i++) {
            count += check(s.charAt(i));
            if (i - j + 1 > k) {
                count -= check(s.charAt(j++));
            }
            max = Math.max(max, count);
        }
        return max;

    }

    public int check(char item) {
        if (item == 'a' || item == 'e' || item == 'i' || item == 'o' || item == 'u') {
            return 1;
        } else {
            return 0;
        }
    }
}
