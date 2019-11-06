package Algorithm.leetcode.String;

/**
 * 
 * Created by tujietg on Oct 24, 2019
 */
public class No1189 {
	public int maxNumberOfBalloons(String text) {
		int a = 0;
		int b = 0;
		int o = 0;
		int l = 0;
		int n = 0;
		for (int i = 0; i < text.length(); i++) {
			char item = text.charAt(i);
			if (item == 'a') {
				a = a + 1;
			} else if (item == 'b') {
				b++;
			} else if (item == 'l') {
				l++;
			} else if (item == 'o') {
				o++;
			} else if (item == 'n') {
				n++;
			} else {
			}
		}
		l = l / 2;
		o = o / 2;
		int minText = 0;
		minText = Math.min(a, b);
		minText = Math.min(minText, l);
		minText = Math.min(minText, o);
		minText = Math.min(minText, n);
		return minText;
	}
}
