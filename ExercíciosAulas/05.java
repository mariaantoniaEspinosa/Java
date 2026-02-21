import java.util.Scanner;

public class Exercício05 {
    //em qual quadrante está o ponto
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        double x;
        double y;

        System.out.println("Digite o valor de X: ");
        x = sc.nextDouble();

        System.out.println("Digite o valor de Y: ");
        y = sc.nextDouble();

        if (x == 0 && y == 0) {
            System.out.println("Origem");
        }
        else if (x == 0) {
            System.out.println("Está no eixo Y");
        }
        else if (y == 0) {
            System.out.println("Está no eixo X");
        }
        else if (x > 0 && y > 0) {
            System.out.println("1º Quadrante");
        }
        else if (x < 0 && y > 0) {
            System.out.println("2º Quadrante");
        }
        else if (x < 0 && y < 0) {
            System.out.println("3º Quadrante");
        }
        else {
            System.out.println("4º Quadrante");
        }

        sc.close();

    }
}
