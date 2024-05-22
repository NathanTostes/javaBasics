import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String name = keyboard.nextLine();
        Integer age = Integer.parseInt(keyboard.nextLine());
        System.out.printf("Hello World %s, you are %d years \n", name, age);
            
    }

}