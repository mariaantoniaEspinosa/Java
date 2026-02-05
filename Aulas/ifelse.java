import java.util.Scanner;

public class IfElse {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        int age;
        String name;
        boolean isestudante;

        System.out.print("Digite seu nome: ");
        name = scanner.nextLine();

        System.out.print("Digite sua idade:" );
        age = scanner.nextInt();

        System.out.print("Voce eh estudante? diga true or false ");
        isestudante = scanner.nextBoolean();


        //

        if(name.isEmpty()){
            System.out.println("voce nao respondeu seu nome");
        } else{
            System.out.println("\n heloo "+ name);
        }


        //

       if(age>=18){
            System.out.println("Voce eh adulto");
       } else if (age >= 5 && age<=18){
            System.out.println("Voce eh criança");
       } else if(age == 0) {
           System.out.println("Voce eh bebe");
       } else {
            System.out.println("voce nao nasceu");
       }
       //

        if(isestudante == true){ // if(isestudante)
            System.out.println("Voce eh estudante");
        } else {
            System.out.println("Voce nao eh estudante");
        }
    }
}
