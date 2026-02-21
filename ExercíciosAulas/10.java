import java.util.Scanner;
//caso usando switch colado do chat gpt
public class Questao01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double n1;
        double n2;
        double resultado;
        int opcao;

        System.out.print("Digite o primeiro numero: ");
        n1 = scanner.nextDouble();

        System.out.print("Digite o segundo numero: ");
        n2 = scanner.nextDouble();

        System.out.println("\nEscolha a operacao:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtracao");
        System.out.println("3 - Multiplicacao");
        System.out.println("4 - Divisao");
        System.out.print("Opcao: ");
        opcao = scanner.nextInt();

        switch (opcao) {

            case 1:
                resultado = n1 + n2;
                System.out.println("Resultado da Soma: " + resultado);
                break;

            case 2:
                resultado = n1 - n2;
                System.out.println("Resultado da Subtracao: " + resultado);
                break;

            case 3:
                resultado = n1 * n2;
                System.out.println("Resultado da Multiplicacao: " + resultado);
                break;

            case 4:
                if (n2 != 0) {
                    resultado = n1 / n2;
                    System.out.println("Resultado da Divisao: " + resultado);
                } else {
                    System.out.println("Erro: divisao por zero!");
                }
                break;

            default:
                System.out.println("Opcao invalida!");
        }

        scanner.close();
    }
}
