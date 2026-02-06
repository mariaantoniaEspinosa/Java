public class ContaBancaria {
    //atributo privado
    private double saldo;

    //metodo de adicionar dinheiro
    void depositar(double valor){

        //soma ao valor atual
        saldo += valor;
    }

    //metodo sacar dinheiro
    void sacar(double valor){

        //verifica se ha saldo
        if(valor <= saldo){

            //retira do valor
            saldo -= valor;
        } else{
            System.out.println("Saldo insuficiente");
        }
    }

    //metodo que retorna o saldo
    double getSaldo(){
        return saldo;
    }

}
