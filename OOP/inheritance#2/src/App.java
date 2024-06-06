public class App {
    public static void main(String[] args) {
        // Visitor v1 = new Visitor("Ronaldinho", 32, "M");
        // System.out.println(v1.toString());

        // Student s1 = new Student("Nathan", 16, "M", 11, "DSI");
        // System.out.println(s1.toString());
        // s1.montlyPayment();

        Scholar s2 = new Scholar("Nathan", 16, "M", 11, "DSI");
        s2.montlyPayment();
    }
}
