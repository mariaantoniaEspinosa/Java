public class IfElse {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        int age;

        System.out.print("Digite sua idade:" );
        age = scanner.nextInt();

       if(age>=18){
            System.out.println("Voce eh adulto");
       } else if (age >= 5 && age<=18){
            System.out.println("Voce eh criança");
       } else if(age == 0) {
           System.out.println("Voce eh bebe");
       } else {
            System.out.println("voce nao nasceu");
       }
    }
}
