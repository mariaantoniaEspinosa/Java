import java.util.Scanner;

public class Questão02 {
    //consumo e lucro diário de um taxista
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double odometroinicio, odometrofinal, litrosgastos, valorrecebido;
        double  totalkm, mediaconsumo, gastocombustivel, lucrodia;

        System.out.print("odometro inicial: ");
        odometroinicio = scanner.nextDouble();

        System.out.print("odometro final: ");
        odometrofinal = scanner.nextDouble();

        System.out.print("COmbustivel gasto em litros: ");
        litrosgastos = scanner.nextDouble();

        System.out.print("valor total recebido: ");
        valorrecebido = scanner.nextDouble();

        totalkm = odometrofinal - odometroinicio;
        mediaconsumo = totalkm / litrosgastos;
        gastocombustivel = litrosgastos * 4.90;
        lucrodia = valorrecebido - gastocombustivel;

        System.out.println("Total percorrido (km): " + totalkm);
        System.out.println("Média de consumo (Km/l): " + mediaconsumo);
        System.out.println("Lucro líquido do dia (R$): " + lucrodia);

        scanner.close();


    }
}
