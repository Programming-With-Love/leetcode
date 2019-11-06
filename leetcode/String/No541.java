package Algorithm.leetcode.String;

/**
 * 
 * Created by tujietg on Nov 6, 2019
 */
public class No541 {
	public String reverseStr(String s, int k) {
		// 隔着K然后反转K
		int len = s.length();
		char[] c = s.toCharArray();
		for (int i = 0; i < len; i += 2 * k) {
			if (i + k <= len) {
				reverse(c, i, i + k - 1);
			} else {
				reverse(c, i, len - 1);
			}
		}
		// 字符数组转化为字符串 直接new String (c)
		return new String(c);
	}

	// 反转方法的实现
	public void reverse(char[] c, int start, int end) {
		// 从start到end结束 之中进行反转
		while (start < end) {
			char temp = c[start];
			c[start] = c[end];
			c[end] = temp;
			start++;
			end--;
		}
	}
}
