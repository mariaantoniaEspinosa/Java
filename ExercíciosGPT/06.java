import java.util.Scanner;

public class Exercicio06 {
    //NOME DO USUÁRIO
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        //le uma linha de texto

        System.out.println("Olá, " + nome +"!");
        //mensagem personalizada
    }
}
