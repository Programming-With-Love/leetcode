package Algorithm.leetcode.String;

/**
 * @author tujietg
 * @date 2019/9/4 10:06 AM
 */
public class No415 {

    public static void main(String[] args) {
        System.out.println(addStrings("1", "1"));
    }

    public static String addStrings(String num1, String num2) {

        int i = num1.length() - 1;
        int j = num2.length() - 1;

        char[] num1Array = num1.toCharArray();
        char[] num2Array = num2.toCharArray();

        int mid = 0;

        StringBuilder sb = new StringBuilder();

        while (i >= 0 || j >= 0 || mid == 1) {
            int a = i >= 0 ? num1Array[i--] - '0' : 0;
            int b = j >= 0 ? num2Array[j--] - '0' : 0;
            int sum = a + b + mid;
            if (sum > 9) {
                sb.insert(0, sum % 10);
            } else {
                sb.insert(0, sum);
            }


            mid = sum / 10;
        }
        return sb.toString();
    }
}
