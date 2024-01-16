public class App {
    public static void main(String[] args) {

        Bottle myBottle = new Bottle();
        myBottle.color = "Silver";
        myBottle.material = "Iron";
        // myBottle.capacity = 1;
        myBottle.height = 20;
        // myBottle.covered = true;
        myBottle.close();
        myBottle.status();
    }
}