package trainingjava;

public class TrainingJava {

    public static void main(String[] args) {
        
        String text1 = "100";
        int num1 = Integer.parseInt(text1);
        
        float num2 = num1; 
        System.out.println(num2);
        
        boolean bol1 = false;
        int num3 = bol1 ? 1 : 0;
        System.out.println(num3);
        
        float num4 = 0.45f;
        float num5 = Math.round(num4);
        System.out.println(num5);
        
    }
    
}
