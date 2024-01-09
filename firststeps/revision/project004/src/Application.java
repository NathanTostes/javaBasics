import java.lang.Math;

public class Application {

    public static void main (String[] args){

        int num1 = 8;
        num1 /= 2;
        System.out.println(num1 + "\n");
        

        int num2 = 25;
        System.out.printf("The square tree of %d is %d \n", num2, (int) Math.sqrt(num2));
        System.out.printf("%d squared is %d \n\n", num2, (int) Math.pow(num2, 2));

        float num3 = (float) 5.7;
        float num4 = (float) 7.2;
        System.out.printf("Rounded 5.7 and 7.2: \nThey become %d and %d respectively \n\n", Math.round(num3), Math.round(num4));

        int num5 = -9;
        System.out.printf("The absolute of -9 is %d \n\n", Math.abs(num5));

        double num6 = Math.ceil(Math.random() * 20);
        System.out.println("Your random number is: " + (int)num6);
        

    }

}