public class App {
    public static void main(String[] args) throws Exception {
        Fighter fighters[] = new Fighter[5];

        fighters[0] = new Fighter("Pretty Boy", "Franch", 31, 1.75f, 68.9f, 11, 2, 1);

        fighters[1] = new Fighter("PutsScritpt", "Brazilian", 29, 1.68f, 57.8f, 14, 2, 3);

        fighters[2] = new Fighter("SnapShadow", "American", 35, 8.75f, 80.9f,  12, 2, 1);

        fighters[3] = new Fighter("DeadCode", "Australian", 28, 1.93f, 81.6f,  13, 0, 2);

        fighters[4] = new Fighter("UfoCobol", "Brazilian", 37, 1.70f, 119.3f, 5, 4, 3);

        fighters[5] = new Fighter("Nerdaard", "American", 30, 1.81f, 105.7f, 12, 2, 4);
    }
}
