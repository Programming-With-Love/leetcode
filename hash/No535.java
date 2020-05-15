package Algorithm.leetcode.hash;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * Created by tujietg on Feb 11, 2020
 */
public class No535 {

	Map<Integer, String> map = new HashMap<>();
	int i = 0;

	// Encodes a URL to a shortened URL.
	public String encode(String longUrl) {
		map.put(i, longUrl);
		return "http://tinyurl.com/" + i++;
	}

	// Decodes a shortened URL to its original URL.
	public String decode(String shortUrl) {
		return map.get(Integer.parseInt(shortUrl.replace("http://tinyurl.com/", "")));
	}
}
