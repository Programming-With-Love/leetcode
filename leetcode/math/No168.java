class No168 {
	public String convertToTitle(int n) {
		if (n < 1) {
			return "";
		}
		StringBuilder str = new StringBuilder();
		while (n-- > 0) {
			System.out.println(n);
			str.append((char) (n % 26 + 'A'));
			n = n / 26;
		}
		return str.reverse().toString();
	}
}
