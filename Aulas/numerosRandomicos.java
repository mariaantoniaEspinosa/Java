import java.util.Random;

public class random {
    public static void main (String[]args){
        Random random = new Random();

        int num;
        int num2;
        int num3;

        num = random.nextInt(1, 6);
        num2 = random.nextInt(1, 6);
        num3 = random.nextInt(1, 6);

        System.out.println(num);
        System.out.println(num2);
        System.out.println(num3);
    }
}
