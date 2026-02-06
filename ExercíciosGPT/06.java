import java.util.Scanner;

public class Exercicio05 {
    //NUMERO PAR OU IMPAR
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero:");
        int numero = scanner.nextInt();
        //le o numero digitado

        if(numero % 2 == 0){
            System.out.println("Par!");
        } else {
            System.out.println("Impar!");
        }
    }
}
