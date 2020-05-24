package String;

/**
 * @author tujietg
 * @date 5/24/20 3:56 PM
 */
public class No5416 {

    public int isPrefixOfWord(String sentence, String searchWord) {
        int endIndex = -1;
        String[] s = sentence.split(" ");
        for (int i = 0; i < s.length; i++) {
            if (s[i].startsWith(searchWord)) {
                return i + 1;
            }
        }
        return -1;
    }
}
