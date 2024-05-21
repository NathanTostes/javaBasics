public class StringTest {
	public static void main(String[] args) {
			String s = "java";
			s = s.replaceAll("j", "J");
			System.out.println(s);
			String text = "I like Java";
			System.out.println(text.contains(s));
			System.out.println(text.isEmpty());
			System.out.println(text.replaceAll(" ", ""));
		}
}
