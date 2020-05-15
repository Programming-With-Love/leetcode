package Algorithm.leetcode.String;

/**
 * 
 * Created by tujietg on Nov 6, 2019
 */
public class No434 {
	public int compress(char[] chars) {
		int index = 0;
		int endindex = 0;
		while (index < chars.length) {
			char current = chars[index];
			int count = 0;
			while (index < chars.length && current == chars[index]) {
				count++;
				index++;
			}

			chars[endindex++] = current;

			if (count != 1) {
				for (char item : Integer.toString(count).toCharArray()) {
					chars[endindex++] = item;
				}
			}
		}
		return endindex;
	}
}
