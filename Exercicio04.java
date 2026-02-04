import java.util.Scanner;

public class Exercicio04 {
    //QUAL NUMERO EH MAIOR
    public static void main(String[]agrs){
        Scanner scanner = new Scanner((System.in));
        //entrada de dados

        System.out.println("Digite o primeiro numero:");
        int a = scanner.nextInt();
        //le o primeiro numero

        System.out.println("Digite o segundo numero:");
        int b = scanner.nextInt();

        if(a>b){
            System.out.println("O maior é: " + a);
        } else {
            System.out.println("O maior é: " + b);
        }
    }
}
