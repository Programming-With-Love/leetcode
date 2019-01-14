/**
 * 
 * @author tujietg
 *
 */
public class No171 {

	public int titleToNumber(String s) {
		// ABC
		char[] ch = s.toCharArray();
		int sum = 0;
		int len = ch.length - 1;
		int num = 'Z' - 'A' + 1;
		for (int i = 0; i <= len; i++) {
			sum += (ch[i] - 'A' + 1) * (Math.pow(num, len - i));
		}
		return sum;
	}

}
