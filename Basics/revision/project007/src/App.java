public class App {
    public static void main (String[] args){
        int num1 = (int) Math.ceil(Math.random() * 5);
        switch (num1) {
            case 5:
                System.out.println("Your number is five, hello to you");
                System.out.println(num1);
                break;
        
            default:
                System.out.println("Your number is not five, sorry");
                System.out.println(num1);
                break;
        }
    }
}