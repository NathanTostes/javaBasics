public class PrintString {
	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("Java");
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}
	}
}
