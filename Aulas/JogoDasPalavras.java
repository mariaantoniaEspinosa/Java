import java.util.Scanner;

public class MabLibsGame {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String adjetivo1;
        String substantivo1;
        String adjetivo2;
        String verbo1;
        String adjetivo3;

        System.out.print("Digite um adjetivo de descrição: ");
        adjetivo1 = scanner.nextLine();

        System.out.print("Digite um substantivo (animal ou pessoa): ");
        substantivo1 = scanner.nextLine();

        System.out.print("Digite um adjetivo de descrição: ");
        adjetivo2 = scanner.nextLine();

        System.out.print("Digite um verbo ENDO/INDO: ");
        verbo1 = scanner.nextLine();

        System.out.print("Digite um adjetivo de descrição: ");
        adjetivo3 = scanner.nextLine();



        System.out.println("\nHoje eu fui a um " + adjetivo1 + " zoologico");
        System.out.println("em uma exibição eu vi um " + substantivo1 + ".");
        System.out.println(substantivo1 + " estava " + adjetivo2 + " e " + verbo1 + "!");
        System.out.println("Eu estava " + adjetivo3 + "!");

    }
}
