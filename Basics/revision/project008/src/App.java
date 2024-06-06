import java.util.Scanner;

public class App {

    public static void main (String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int old = 2023 - keyboard.nextInt();
        
        if (old < 16) System.out.println("You not can vote");
            else if ((16 <= old && old < 18) || old > 70) System.out.println("Optional vote");
                else System.out.println("Mandatory vote");

    }

}