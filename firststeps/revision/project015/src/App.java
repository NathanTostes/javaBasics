public class App {
    static double multiplication (double num1, double num2){
        return (num1 * num2);
    }

    public static void main(String[] args) {
        double num1 = Math.random() * 10;
        double num2 = Math.random() * 10;
        System.out.println("Num1: " + num1);
        System.out.println("Num2: " + num2);
        System.out.println("Result: " + multiplication(num1, num2));
    }
}
