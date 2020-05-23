package String;

import java.util.HashMap;
import java.util.Map;

/**
 * @author tujietg
 * @date 5/23/20 1:03 PM
 */
public class No76 {
    public static String minWindow(String s, String t) {
        int sLen = s.length();

        int start = -1;
        int end = sLen - 1;

        char[] tChars = t.toCharArray();
        char[] sChars = s.toCharArray();

        if (s.length() < t.length()) {
            return "";
        }

        Map<Character, Integer> tMap = new HashMap<>(t.length());

        for (int i = 0; i < tChars.length; i++) {
            tMap.put(tChars[i], tMap.getOrDefault(tChars[i], 0) + 1);
        }

        for (int i = 0; i < sLen; i++) {
            for (int j = i; j < sLen; j++) {
                String substring = s.substring(i, j + 1);
                HashMap<Character, Integer> characterIntegerHashMap = new HashMap<>(t.length());
                characterIntegerHashMap.putAll(tMap);
                if (check(characterIntegerHashMap, substring.toCharArray()) == true) {
                    if (j - i <= end - start) {
                        end = j;
                        start = i;
                        j = sLen;
                        while (!tMap.containsKey(sChars[i]) && i < sLen && !tMap.containsKey(sChars[i + 1])) {
                            i++;
                        }
                    }
                }
            }
        }
        return start == -1 ? "" : s.substring(start, end + 1);
    }

    private static boolean check(Map<Character, Integer> midMap, char[] sChars) {
        for (int i = 0; i < sChars.length; i++) {
            if (midMap.containsKey(sChars[i])) {
                if (midMap.get(sChars[i]).equals(1)) {
                    midMap.remove(sChars[i]);
                } else {
                    midMap.put(sChars[i], midMap.get(sChars[i]) - 1);
                }
            }
        }
        return midMap.size() == 0;
    }
}
