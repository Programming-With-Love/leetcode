package Algorithm.leetcode.String;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * Created by tujietg on Oct 29, 2019
 */
public class No819 {
	public static String mostCommonWord(String paragraph, String[] banned) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		paragraph = paragraph.toLowerCase();
		paragraph = paragraph.replaceAll("\\pP", " ");
		String[] paragraphChar = paragraph.split(" ");
		for (int i = 0; i < paragraphChar.length; i++) {
			if (map.containsKey(paragraphChar[i])) {
				int a = map.get(paragraphChar[i]);
				map.remove(paragraphChar[i]);
				map.put(paragraphChar[i], ++a);
			} else {
				if (paragraphChar[i] != null && paragraphChar[i] != "") {
					map.put(paragraphChar[i], 1);
				}
			}
		}

		map.remove("");

		for (int i = 0; i < banned.length; i++) {
			if (map.containsKey(banned[i])) {
				map.remove(banned[i]);
			}
		}

		String end = "";
		int mid = 0;
		for (int i = 0; i < paragraphChar.length; i++) {
			if (map.get(paragraphChar[i]) != null && map.get(paragraphChar[i]) > mid) {
				mid = map.get(paragraphChar[i]);
				end = paragraphChar[i];
			}
		}
		return end;
	}

	public static void main(String[] args) {
		String[] strArr = new String[] { "bob", "hit" };
		System.out.println(mostCommonWord("Bob. hIt, baLl", strArr));

	}
}
