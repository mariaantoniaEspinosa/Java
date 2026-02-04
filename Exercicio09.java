import java.util.Scanner;

public class Exercicio09 {
    //TABUADA
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero:  ");
        int numero = scanner.nextInt();

        for(int i = 1; i <=10; i++){
            System.out.println(numero + "x" + i + "=" + (numero * i));

        }
    }
}
