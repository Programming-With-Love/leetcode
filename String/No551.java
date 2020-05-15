package Algorithm.leetcode.String;

/**
 * @author tujietg
 * @date 2019/9/5 2:12 PM
 */
public class No551 {

    public boolean checkRecord(String s) {
        if (s.contains("LLL")) {
            return false;
        }
        int sum = 0;
        for (char item : s.toCharArray()) {
            if (item == 'A') {
                sum++;
            }
        }
        if (sum > 1) {
            return false;
        }
        return true;
    }

}
