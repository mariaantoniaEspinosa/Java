import java.util.Scanner;

public class Questão09 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int idade;

        System.out.print("Digite sua idade: ");
        idade = sc.nextInt();

        if(idade < 16){
            System.out.println("Não pode votar");
        } else if (idade >= 16 && idade < 18 || idade > 70){
            System.out.println("Voto facultativo");
        } else{
            System.out.println("Voto obrigatório");
        }
        sc.close();
    }
}
