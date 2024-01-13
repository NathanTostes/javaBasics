public class App {
    public static void main (String[] args) {

        int num = 0;
        while (num < 10) {
            ++num;
            if (num != 3 && num != 5) {
               System.out.println("Hello World #" + num);
            }
        }
        do {
            System.out.println("Hello World #" + num);
        } while (num < 10);
        
    }
}
