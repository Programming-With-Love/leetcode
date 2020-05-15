package Algorithm.leetcode.String;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * Created by tujietg on Oct 28, 2019
 */
public class No929 {
	public int numUniqueEmails(String[] emails) {
		Set<String> hashSet = new HashSet<String>();
		for (String item : emails) {
			String[] end = item.split("@");
			String[] start = end[0].split("\\+");
			hashSet.add(start[0].replace(".", "") + "@" + end[1]);
		}
		return hashSet.size();
	}

}
