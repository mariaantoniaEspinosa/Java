import java.util.Scanner;

public class Exercicio10 {
    //USO DO WHILE
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        int soma = 0, numero;

        do{
            System.out.println("Digite um numero (zero para sair):");
            numero = scanner.nextInt();
            soma+= numero; //soma o valor digitado ao total
        } while (numero != 0);
        System.out.println("Soma total: " + soma);
    }
}
