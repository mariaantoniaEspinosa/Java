public class Main{
    public static void main(String[] agrs){
        ContaBancaria conta = new ContaBancaria();

        conta.depositar(500);
        conta.sacar(200);

        System.out.println("Saldo atual: " + conta.getSaldo());
    }
}
