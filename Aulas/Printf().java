import java.util.Scanner;

public class Painel {
    public static void main(String[] args){

        //printf().

        String name = "bob esponja";
        char primeiraletra = 'b';
        int idade = 30;
        double altura = 60.5;
        boolean iscontratado = true;

       // no lugar de Systen.out.println() usamos o printf();
        System.out.printf("Hello %s\n", name);
        System.out.printf("Seu nome começa com %c\n", primeiraletra);
        System.out.printf("Sua idade é %d anos\n", idade);
        System.out.printf("Você tem %.1fcm de altura\n", altura);
        System.out.printf("Empregado: %b \n", iscontratado);

        System.out.printf("%s tem %d anos", name, idade);
    }
}
