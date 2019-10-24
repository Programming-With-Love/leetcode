package Algorithm.leetcode.String;

/**
 * 
 * Created by tujietg on Oct 24, 2019
 */
public class No1108 {
	public static String defangIPaddr(String address) {
		address = address.replace(".", "}");
		String[] addArr = address.split("}");
		String end = "";
		for (int i = 0; i < addArr.length; i++) {
			end = end + addArr[i];
			if (i != 3) {
				end = end + "[.]";
			}
		}
		return end;
	}

	public static void main(String[] args) {
		System.out.println(defangIPaddr("1.1.1.1"));
	}
}
