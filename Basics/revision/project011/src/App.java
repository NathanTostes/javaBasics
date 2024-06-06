public class App {
    public static void main(String[] args) throws Exception {
        
        for (int combo = 1; combo <= 10; combo++){
            System.out.printf("- - - Combo %d - - -\n", combo);
            for (int punch = 1; punch <= 3; punch++){
                System.out.println("Punch " + punch);
            }
            System.out.println("\n");
        }

    }
}
