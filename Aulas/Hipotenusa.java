import java.util.Scanner;

public class Painel {
    public static void main(String[] args){

        // hipotenusa c = Math.sqrt(a² + b²)

        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.print("Digite o valor de A: ");
        a = scanner.nextDouble();

        System.out.print("Digite o valor de B: ");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println("A hiponenusa será: " + c );

        scanner.close();
    }
}
