import java.util.Scanner;

public class ProgramadeCompras {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        String item;
        double preco;
        int quantia;
        String valor = "R$";
        double total;

        System.out.print("O que você deseja comprar? ");
        item = scanner.nextLine();

        System.out.print("Qual o preço de cada? ");
        preco = scanner.nextDouble();

        System.out.print("Quantos(as) você irá comprar? ");
        quantia = scanner.nextInt();

        total = preco * quantia;

        System.out.println("\n Você comprou " + quantia + " " + item + "/s");
        System.out.println("O total foi de " + valor + total);
        
        scanner.close();
    }

}
