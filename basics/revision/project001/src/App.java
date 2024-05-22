public class App {

    public static void main (String[] args){

        String name = new String("Nathan");
        System.out.println("Nome: " + name);

        float money = (float) 15680.00;
        System.out.printf("Dinheiro: %.2f \n", money);

        System.out.printf("%s possui %.2f reais", name, money);

    }

}